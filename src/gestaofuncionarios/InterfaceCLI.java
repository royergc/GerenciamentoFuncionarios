package gestaofuncionarios;

import gestaofuncionarios.Empresa.*;

import java.time.LocalDate;
import java.util.Scanner;

public class InterfaceCLI {

    public static void main(String[] args) {
        GestorFuncionarios gestor = new GestorFuncionarios();
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
        gerenteDpto1.definirLiderTecnico(colaborador1, lider1);
        Departamento dptoMkt = new Departamento("Marketing");
        gerenteDpto1.alocarDepartamento(dptoMkt, colaborador1);
        System.out.println(gestor.listarFuncionarios().toString());

        mensagemBemVindo();
        exibeMenuPrincipal();


    }

    public static void mensagemBemVindo() {
        limpaPagina();
        System.out.println(" ======================================================");
        System.out.println(" Bem vindo ao sistema de Gerenciamento de Funcionarios ");
        System.out.println(" ======================================================");
    }

    public static void exibeMenuPrincipal() {
        pulaLinha();
        System.out.println("Escolha a opcao desejada: ");
        System.out.println(" 1 - Adicionar funcionario");
        System.out.println(" 2 - Ver detalhes de um funcionario");
        System.out.println(" 3 - Demitir funcionario");
        System.out.println(" 4 - Atualizar informações de um funcionário");
        System.out.println(" 5 - Listar todos os funcionarios do sistema");
        System.out.println(" 6 - Listar somente os funcionarios trabalhando (ativos)");
        System.out.println(" 7 - Listar somente os funcionarios demitidos");
        System.out.println(" 8 - Sair");
    }

    public static void limpaPagina() {
        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
    }

    public static void pulaLinha() {
        System.out.printf("%n");
    }

    public static int lerEntradaInt() {
        Scanner entrada = new Scanner(System.in);
        String parser = entrada.nextLine();
//            parser.replaceAll()
        return Integer.parseInt(parser);
    }
}

