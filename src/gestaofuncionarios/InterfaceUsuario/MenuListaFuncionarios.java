package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.Funcionario;
import gestaofuncionarios.Empresa.GestorFuncionarios;

import java.util.ArrayList;
import java.util.List;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.limpaTela;
import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.pulaLinha;

public class MenuListaFuncionarios {

    public static void listaFuncionarios(CommandLineUtils.ListaFuncionariosEnum tipoListagem) {
        limpaTela();
        GestorFuncionarios gestor = new GestorFuncionarios();
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        switch(tipoListagem) {
            case TODOS -> listaFuncionarios = gestor.listarFuncionarios();
            case ATIVOS -> listaFuncionarios = gestor.listarFuncionariosAtivos();
            case DEMITIDOS -> listaFuncionarios = gestor.listarFuncionariosInativos();
        }
        for(Funcionario funcionario: listaFuncionarios) {
            System.out.println("--------------------------------");
            for(String linha : funcionario.getDadosFuncionario()) {
                System.out.println(linha);
            }
            pulaLinha();
        }
    }
}
