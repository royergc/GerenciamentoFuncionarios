package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.time.LocalDate;

public class LiderTecnico extends Funcionario {

    public LiderTecnico(String nome, String cpf, String rg, String endereco, String dataNascimento,
                        String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public LiderTecnico(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    @Override
    public String toString() {
        return "===============  LiderTecnico ============= \n" +
                "Nome: " + this.getNome() + "\n " +
                "Matricula: " + this.getMatricula() + "\n " +
                "Data admissao: " + this.getDataAdmissao() + "\n " +
                "Data nascimento: " + this.getDataNascimento();
    }
}
