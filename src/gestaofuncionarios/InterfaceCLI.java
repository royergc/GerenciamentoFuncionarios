package gestaofuncionarios;

import gestaofuncionarios.Empresa.*;

import java.time.LocalDate;

public class InterfaceCLI {


    public static void main(String[] args) {
        GestorFuncionarios gestor = new GestorFuncionarios();


        LocalDate dataNasc = LocalDate.of(1981,9,14);

        Pessoa pessoa1 = new Pessoa("Joao da Silva","06706746991","2004692","Rua Lages, 268",dataNasc);

        GerenteDepartamento gerenteDpto1 = new GerenteDepartamento(pessoa1,"005/01","joaodasilva@gmail.com",25000);

        Colaborador colaborador1 = new Colaborador("Guilherme", "03596463955", "2004692" ,"Rua Coronel Santiago, 859", dataNasc,
                "001/21", "guilherme.royer@gmail.com",4500.00);

        LiderTecnico lider1 =  new LiderTecnico("Thiago", "03596463955", "2004692" ,"Rua Coronel Santiago, 859", dataNasc,
                "003/21", "lider.tecnico@gmail.com",12500.00);

        gestor.adicionarFuncionario(gerenteDpto1);
        gestor.adicionarFuncionario(colaborador1);
        gestor.adicionarFuncionario(lider1);
        gerenteDpto1.definirLiderTecnico(colaborador1,lider1);
        Departamento dptoMkt = new Departamento("Marketing");

        gerenteDpto1.alocarDepartamento(dptoMkt,colaborador1);

        System.out.println(gestor.listarFuncionarios().toString());



    }

    // adicionar Funcionario
    // ver detalhes de um funcionario
    // demitir funcionario (manter o funcionario na base de dados, mas demitir)
    // atualizar informações do funcionario
    // listar todos os funcionarios
    // listar somente os funcionarios trabalhando
    // listar somente os funcionarios demitidos
    // sair
}
