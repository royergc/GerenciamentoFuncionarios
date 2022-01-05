package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.*;

import java.util.List;
import java.util.Scanner;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.*;
import static gestaofuncionarios.InterfaceUsuario.MenuMostraDetalhesFuncionario.escolherFuncionario;

public class MenuDemitirFuncionario {

    public static void demitirFuncionario() {
        Scanner entrada = new Scanner(System.in);
        Funcionario funcionario = escolherFuncionario();
        if (funcionario == null) {
            System.out.println("Erro: Funcionario não encontrado");
        }
        else {
            System.out.println("Exibindo dados do funcionario a ser demitido");
            pulaLinha();
            for (String line : funcionario.getDadosFuncionario()) {
                System.out.println(line);
            }
            pulaLinha();
            System.out.println("Tem certeza que gostaria de demitir o funcionario escolhido? ");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            int escolha = lerEntradaInt();
            if (escolha == 1) {
                mostraGerentes(funcionario);
            }
        }
    }

    public static void mostraGerentes(Funcionario funcionario) {
        GestorFuncionarios gestor = new GestorFuncionarios();
        List<Gerente> gerentes = gestor.listarGerentesAtivos();
        if(gerentes.isEmpty()) {
            System.out.println("Nao eh possivel demitir ninguem sem um Gerente ativo para autorizar");
        }
        else {
            System.out.println("Por favor, escolha o gerente que autorizou a demissao: ");
            for(int i = 0 ; i < gerentes.size(); i++) {
                if(gerentes.get(i) instanceof GerenteGeral) {
                    System.out.println(i + " - " + ((GerenteGeral) gerentes.get(i)).getNome());
                }
                else {
                    System.out.println(i + " - " + ((GerenteDepartamento) gerentes.get(i)).getNome());
                }
            }
            int escolha = lerEntradaInt();
            gerentes.get(escolha).demitirFuncionario(funcionario);
            System.out.println("Funcionario demitido!");
        }
    }
}
