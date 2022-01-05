package gestaofuncionarios.InterfaceUsuario;

import java.util.Scanner;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.*;

public class MenuPrincipal {

    public static void main(String[] args) {

        mensagemBemVindo();

        int opcao;
        do {
            exibeMenuPrincipal();
            opcao = lerEntradaInt();
            switch(opcao){
                case 1:
                    // adicionar funcionario
                    MenuAdicionaFuncionario.criaFuncionario();
                    retornaMenuPrincipal();
                    break;
                case 2:
                    // ver detalhes funcionario
                    MenuMostraDetalhesFuncionario.mostraDetalhes();
                    retornaMenuPrincipal();
                    break;
                case 3:
                    // demitir funcionario
                    MenuDemitirFuncionario.demitirFuncionario();
                    retornaMenuPrincipal();
                    break;
                case 4:
                    // atualizar informações funcionario
                    MenuAtualizaInfoFuncionarios.atualizaInfoFuncionarios();
                    retornaMenuPrincipal();
                    break;
                case 5:
                    // listar funcionarios
                    MenuListaFuncionarios.listaFuncionarios();
                    retornaMenuPrincipal();
                    break;
                case 6:
                    // listar somente funcionarios trabalhando
                    break;
                case 7:
                    // listar somente funcionarios demitidos
                    break;
            }
        } while(opcao != 8);
        System.out.println("Obrigado por utilizar o sistema, ate breve");
    }

    public static void mensagemBemVindo() {
        limpaTela();
        System.out.println(" ======================================================");
        System.out.println(" Bem vindo ao sistema de Gerenciamento de Funcionarios ");
        System.out.println(" ======================================================");
        pulaLinha();
        pulaLinha();
        pulaLinha();
        pulaLinha();
        System.out.println("Pressione qualquer tecla para acessar o menu principal...");
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
    }

    public static void exibeMenuPrincipal() {
        limpaTela();
        System.out.println("=========================");
        System.out.println("Escolha a opcao desejada: ");
        System.out.println("=========================");
        System.out.println(" 1 - Adicionar funcionario");
        System.out.println(" 2 - Ver detalhes de um funcionario");
        System.out.println(" 3 - Demitir funcionario");
        System.out.println(" 4 - Atualizar informações de um funcionário");
        System.out.println(" 5 - Listar todos os funcionarios do sistema");
        System.out.println(" 6 - Listar somente os funcionarios trabalhando (ativos)");
        System.out.println(" 7 - Listar somente os funcionarios demitidos");
        System.out.println(" 8 - Sair");
    }

    public static void retornaMenuPrincipal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pressione qualquer tecla para retornar ao menu principal");
        entrada.nextLine();
    }
}

