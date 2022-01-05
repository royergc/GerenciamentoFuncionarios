package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class LiderTecnico extends Funcionario {

    public LiderTecnico(String nome, String cpf, String rg, String endereco, String dataNascimento,
                        String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public LiderTecnico(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    @Override
    public List<String> getDadosFuncionario() {
        List<String> dadosFuncionario = new ArrayList<>();
        dadosFuncionario = super.getDadosFuncionario();
        dadosFuncionario.add("Cargo atual: Lider Tecnico");
        return dadosFuncionario;
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
