package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.time.LocalDate;

public class Colaborador extends Funcionario {

    private LiderTecnico liderTecnico;

    public Colaborador(String nome, String cpf, String rg, String endereco, String dataNascimento,
                       String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public Colaborador(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    public String getLiderTecnico() { return liderTecnico.getNome(); }

    protected boolean setLiderTecnico(LiderTecnico lider) {
        if(lider != null) {
            this.liderTecnico = lider;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "===============  Colaborador ============= \n" +
                "Nome: " + this.getNome()  + "\n " +
                "Matricula: " + this.getMatricula() + "\n " +
                "Data admissao: " + this.getDataAdmissao() + "\n" +
                "Lider Tecnico: " + liderTecnico.getNome() + "\n";
    }
}
