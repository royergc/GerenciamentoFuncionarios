package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.Colaborador;
import gestaofuncionarios.Empresa.Funcionario;
import gestaofuncionarios.Empresa.GestorFuncionarios;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.limpaTela;
import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.pulaLinha;

public class MenuListaFuncionarios {

    public static void listaFuncionarios() {
        limpaTela();
        GestorFuncionarios gestor = new GestorFuncionarios();
        for(Funcionario funcionario: gestor.listarFuncionarios())
        {
            System.out.println("--------------------------------");
            for(String linha : funcionario.getDadosFuncionario()) {
                System.out.println(linha);
            }
            pulaLinha();
        }
    }
}
