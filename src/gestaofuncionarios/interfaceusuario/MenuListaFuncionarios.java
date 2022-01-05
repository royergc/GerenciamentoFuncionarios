package gestaofuncionarios.interfaceusuario;

import gestaofuncionarios.empresa.Funcionario;
import gestaofuncionarios.empresa.GestorFuncionarios;

import java.util.ArrayList;
import java.util.List;

import static gestaofuncionarios.interfaceusuario.CommandLineUtils.limpaTela;
import static gestaofuncionarios.interfaceusuario.CommandLineUtils.pulaLinha;

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
        if(listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionario encontrado");
            pulaLinha();
        }
        else {
            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println("--------------------------------");
                for (String linha : funcionario.getDadosFuncionario()) {
                    System.out.println(linha);
                }
                pulaLinha();
            }
        }
    }
}
