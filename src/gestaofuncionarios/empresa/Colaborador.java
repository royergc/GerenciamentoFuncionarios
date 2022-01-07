package gestaofuncionarios.empresa;

import gestaofuncionarios.Pessoa;

import java.util.List;

public class Colaborador extends Funcionario {

    private String liderTecnico;

    public Colaborador(String nome, String cpf, String rg, String endereco, String dataNascimento,
                       String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, email, salarioBase);
        liderTecnico = "Lider Tecnico a definir";
    }

    public Colaborador(Pessoa pessoa, String email, double salarioBase) {
        super(pessoa, email, salarioBase);
        liderTecnico = "Lider Tecnico a definir";
    }

    public String getLiderTecnico() { return liderTecnico; }

    protected void setLiderTecnico(String lider) {
        this.liderTecnico = lider;
    }

    @Override
    public List<String> getDadosFuncionario() {
        List<String> dadosFuncionario = super.getDadosFuncionario();
        if(isAtivo()){
            dadosFuncionario.add("Cargo atual: Colaborador");
        }
        else {
            dadosFuncionario.add("Cargo atual: Demitido");
        }
        return dadosFuncionario;
    }

    @Override
    public String toString() {
        return "===============  Colaborador ============= \n" +
                "Nome: " + this.getNome()  + "\n " +
                "Matricula: " + this.getMatricula() + "\n " +
                "Data admissao: " + this.getDataAdmissao();
    }
}
