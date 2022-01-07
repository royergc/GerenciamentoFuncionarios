package gestaofuncionarios.interfaceusuario;

import gestaofuncionarios.empresa.*;
import gestaofuncionarios.Pessoa;

import static gestaofuncionarios.interfaceusuario.CommandLineUtils.*;

public class MenuAdicionaFuncionario {

    public enum tipoFuncionarioEnum {
        COLABORADOR,
        LIDERTECNICO,
        GERENTEDEPARTAMENTO,
        GERENTEGERAL
    }

    public static void criaFuncionario() {
        limpaTela();
        System.out.println("======================");
        System.out.println("Adicionar Funcionario");
        System.out.println("======================");
        pulaLinha();
        Pessoa pessoa = coletaDadosPessoais();
        tipoFuncionarioEnum cargo = escolheTipoFuncionario();
        Funcionario funcionario = coletaDadosFuncionario(pessoa,cargo);
        GestorFuncionarios gestor = new GestorFuncionarios();
        gestor.adicionarFuncionario(funcionario);
        Departamento departamento = escolheDepartamento();
        Empresa.alocarDepartamento(departamento, funcionario);
        pulaLinha();
        System.out.println("========================================================");
        System.out.println("Funcionario criado com sucesso - Matricula = " + funcionario.getMatricula());
        System.out.println("========================================================");
        pulaLinha();
        for(String linha : funcionario.getDadosFuncionario()) {
            System.out.println(linha);
        }
        pulaLinha();
    }

    public static Departamento escolheDepartamento() {
        System.out.println("Por favor, selecione em qual Departamento o funcionario será alocado: ");
        String nomeDepartamento = lerEntradaString();
        Departamento departamento = Empresa.criaNovoDepartamento(nomeDepartamento);
        return departamento;
    }

    public static tipoFuncionarioEnum escolheTipoFuncionario() {
        tipoFuncionarioEnum cargo;
        pulaLinha();
        System.out.println("Por favor, escolha o cargo desejado para o funcionario: ");
        System.out.println(" 1 - Colaborador");
        System.out.println(" 2 - Lider Tecnico");
        System.out.println(" 3 - Gerente Departamento");
        System.out.println(" 4 - Gerente Geral");
        pulaLinha();
        int escolha = lerEntradaInt();
        switch(escolha) {
            case 1 -> cargo = tipoFuncionarioEnum.COLABORADOR;
            case 2 -> cargo = tipoFuncionarioEnum.LIDERTECNICO;
            case 3 -> cargo = tipoFuncionarioEnum.GERENTEDEPARTAMENTO;
            case 4 -> cargo = tipoFuncionarioEnum.GERENTEGERAL;
            default -> cargo = tipoFuncionarioEnum.COLABORADOR;
        }
        return cargo;
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
        System.out.println("Por favor, insira o email do funcionario: ");
        String email = lerEntradaString();
        pulaLinha();
        System.out.println("Por favor, insira o salario do funcionario: ");
        double salario = lerEntradaDouble();
        switch(cargo) {
            case COLABORADOR -> funcionario = new Colaborador(pessoa,email,salario);
            case LIDERTECNICO -> funcionario = new LiderTecnico(pessoa,email,salario);
            case GERENTEDEPARTAMENTO -> funcionario = new GerenteDepartamento(pessoa,email,salario);
            case GERENTEGERAL -> funcionario = new GerenteGeral(pessoa,email,salario);
            default -> funcionario = null;
        }
        return funcionario;
    }
}
