package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Funcionario {

    private String liderTecnico;

    public Colaborador(String nome, String cpf, String rg, String endereco, String dataNascimento,
                       String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public Colaborador(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    public String getLiderTecnico() { return liderTecnico; }

    protected void setLiderTecnico(String lider) {
        this.liderTecnico = lider;
    }

    @Override
    public List<String> getDadosFuncionario() {
        List<String> dadosFuncionario = new ArrayList<>();
        dadosFuncionario = super.getDadosFuncionario();
        dadosFuncionario.add("Cargo atual: Colaborador");
        return dadosFuncionario;
    }

    @Override
    public String toString() {
        return "===============  Colaborador ============= \n" +
                "Nome: " + this.getNome()  + "\n " +
                "Matricula: " + this.getMatricula() + "\n " +
                "Data admissao: " + this.getDataAdmissao() + "\n" /*+
                "Lider Tecnico: " + liderTecnico.getNome() + "\n"*/;
    }
}
