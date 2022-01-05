package gestaofuncionarios.InterfaceUsuario;

import gestaofuncionarios.Empresa.*;
import gestaofuncionarios.Pessoa;

import static gestaofuncionarios.InterfaceUsuario.CommandLineUtils.*;

public class AdicionaFuncionario {

    public enum tipoFuncionarioEnum {
        COLABORADOR,
        LIDERTECNICO,
        GERENTEDEPARTAMENTO,
        GERENTEGERAL
    }

    public static void exibeMenuAdicionarFuncionario() {
        limpaTela();
        System.out.println("======================");
        System.out.println("Adicionar Funcionario");
        System.out.println("======================");
        pulaLinha();
        Pessoa pessoa = coletaDadosPessoais();
        Funcionario funcionario = coletaDadosFuncionario(pessoa,tipoFuncionarioEnum.COLABORADOR);

    }

    public static Pessoa coletaDadosPessoais() {
        pulaLinha();
        System.out.println("Por favor, insira o nome da pessoa: ");
        String nome = lerEntradaString();
        pulaLinha();
        System.out.println("Por favor, insira o CPF da pessoa: ");
        String cpf = lerEntradaString();
        pulaLinha();
        System.out.println("Por favor, insira o RG da pessoa: ");
        String rg = lerEntradaString();
        pulaLinha();
        System.out.printf("Por favor, insira o endereco da pessoa: ");
        String endereco = lerEntradaString();
        pulaLinha();
        System.out.printf("Por favor, insira a data de nascimento da pessoa no formato dd/MM/AAAA: ");
        String dataNasc = lerEntradaString();
        Pessoa pessoa = new Pessoa(nome,cpf,rg,endereco,dataNasc);
        return pessoa;
    }

    public static Funcionario coletaDadosFuncionario(Pessoa pessoa,tipoFuncionarioEnum cargo) {
        Funcionario funcionario;
        pulaLinha();
        System.out.println("Por favor, insira a Matricula do funcionario: ");
        String matricula = lerEntradaString();
        pulaLinha();
        System.out.println("Por favor, insira o email do funcionario: ");
        String email = lerEntradaString();
        pulaLinha();
        System.out.println("Por favor, insira o salario do funcionario: ");
        double salario = lerEntradaDouble();
        switch(cargo) {
            case COLABORADOR -> funcionario = new Colaborador(pessoa,matricula,email,salario);
            case LIDERTECNICO -> funcionario = new LiderTecnico(pessoa,matricula,email,salario);
            case GERENTEDEPARTAMENTO -> funcionario = new GerenteDepartamento(pessoa,matricula,email,salario);
            case GERENTEGERAL -> funcionario = new GerenteGeral(pessoa,matricula,email,salario);
            default -> funcionario = null;
        }
        return funcionario;
    }
}
