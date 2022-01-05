package gestaofuncionarios.InterfaceUsuario;

import java.util.Scanner;

public class CommandLineUtils {

    public enum ListaFuncionariosEnum {
        TODOS,
        ATIVOS,
        DEMITIDOS
    }

    public static void limpaTela() {
        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
    }

    public static void pulaLinha() {
        System.out.printf("%n");
    }

    public static int lerEntradaInt() {
        Scanner entrada = new Scanner(System.in);
        String parser = entrada.nextLine();
        parser = parser.replaceAll( "[^0-9]","0");
        return Integer.parseInt(parser);
    }

    public static double lerEntradaDouble() {
        Scanner entrada = new Scanner(System.in);
        String parser = entrada.nextLine().replaceAll("," ,".");
        parser = parser.replaceAll("[^0-9|.]","");
        return Double.parseDouble(parser);
    }

    public static String lerEntradaString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

}
