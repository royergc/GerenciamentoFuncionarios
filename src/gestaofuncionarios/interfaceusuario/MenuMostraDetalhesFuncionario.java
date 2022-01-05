package gestaofuncionarios.interfaceusuario;

import gestaofuncionarios.empresa.Funcionario;
import gestaofuncionarios.empresa.GestorFuncionarios;

import java.util.Scanner;

import static gestaofuncionarios.interfaceusuario.CommandLineUtils.*;

public class MenuMostraDetalhesFuncionario {

    public static Funcionario escolherFuncionario() {
        GestorFuncionarios gestor = new GestorFuncionarios();
        limpaTela();
        System.out.println("Por favor, digite a matricula do funcionario: ");
        String matricula = lerEntradaString();
        Funcionario func = gestor.procurarFuncionario(matricula);
        return func;
    }

    public static void mostraDetalhes() {
        Scanner entrada = new Scanner(System.in);
        Funcionario funcionario = escolherFuncionario();
        if(funcionario == null) {
            System.out.println("Erro: Funcionario não encontrado");
        }
        else {
            System.out.println("=============================");
            System.out.println("Exibindo dados do funcionario");
            System.out.println("=============================");
            pulaLinha();
            for(String linha : funcionario.getDadosFuncionario()) {
                System.out.println(linha);
            }
            pulaLinha();
        }
    }
}
