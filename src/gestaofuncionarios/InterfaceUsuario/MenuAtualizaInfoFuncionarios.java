package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.Funcionario;
import gestaofuncionarios.Empresa.GestorFuncionarios;

import java.util.Scanner;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.*;
import static gestaofuncionarios.InterfaceUsuario.MenuMostraDetalhesFuncionario.escolherFuncionario;

public class MenuAtualizaInfoFuncionarios {

    public static void atualizaInfoFuncionarios() {
        limpaTela();
        Scanner entrada = new Scanner(System.in);
        GestorFuncionarios gestor = new GestorFuncionarios();
        Funcionario funcionario = escolherFuncionario();
        if (funcionario == null) {
            System.out.println("Erro: Funcionario não encontrado");
        }
        else {
            System.out.println("Exibindo dados do funcionario escolhido");
            pulaLinha();
            for (String line : funcionario.getDadosFuncionario()) {
                System.out.println(line);
            }
            pulaLinha();
            System.out.println("Por favor, digite o que deseja alterar: ");
            System.out.println(" 1 - email");
            System.out.println(" 2 - endereco");
            System.out.println(" 3 - email e endereco");
            pulaLinha();
            int escolha = lerEntradaInt();
            String email;
            String endereco;
            switch (escolha) {
                case 1:
                    System.out.println("Por favor, digite o novo email para o usuario: ");
                    email = lerEntradaString();
                    endereco = funcionario.getEndereco();
                    break;
                case 2:
                    System.out.println("Por favor, digite o novo endereco do usuario");
                    endereco = lerEntradaString();
                    email = funcionario.getEmail();
                    break;
                case 3:
                default:
                    System.out.println("Por favor, digite o novo email para o usuario: ");
                    email = lerEntradaString();
                    System.out.println("Por favor, digite o novo endereco do usuario");
                    endereco = lerEntradaString();
                    break;
            }
            if (gestor.alterarDadosFuncionario(funcionario, email, endereco)) {
                System.out.println("Alteracoes realizadas com sucesso");
            } else {
                System.out.println("Erro! Alteracoes nao foram realizadas!");
            }
        }
    }
}
