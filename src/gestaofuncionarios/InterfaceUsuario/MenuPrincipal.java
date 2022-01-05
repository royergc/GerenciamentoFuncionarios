package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.*;
import gestaofuncionarios.Pessoa;

import java.time.LocalDate;
import java.util.Scanner;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.*;

public class MenuPrincipal {

    public static void main(String[] args) {

       /* GestorFuncionarios gestor = new GestorFuncionarios();
        LocalDate dataNasc = LocalDate.of(1981, 9, 14);
        Pessoa pessoa1 = new Pessoa("Joao da Silva", "06706746991", "2004692", "Rua Lages, 268", "01/01/2000");
        GerenteGeral gerenteDpto1 = new GerenteGeral(pessoa1, "005/01", "joaodasilva@gmail.com", 25000);

        Colaborador colaborador1 = new Colaborador("Guilherme", "03596463955", "2004692", "Rua Coronel Santiago, 859", "10/10/2010",
                "001/21", "guilherme.royer@gmail.com", 4500.00);

        LiderTecnico lider1 = new LiderTecnico("Thiago", "03596463955", "2004692", "Rua Coronel Santiago, 859", "01/01/2001",
                "003/21", "lider.tecnico@gmail.com", 12500.00);

        gestor.adicionarFuncionario(gerenteDpto1);
        gestor.adicionarFuncionario(colaborador1);
        gestor.adicionarFuncionario(lider1);
        gerenteDpto1.definirLiderTecnico(colaborador1, lider1.getNome());
        Departamento dptoMkt = new Departamento("Marketing");
        Empresa.alocarDepartamento(dptoMkt, colaborador1);
        System.out.println(gestor.listarFuncionarios().toString());
*/
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
                    break;
                case 5:
                    // listar funcionarios
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

