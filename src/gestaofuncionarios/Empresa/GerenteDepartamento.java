package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.time.LocalDate;

public class GerenteDepartamento extends Funcionario implements Gerente {

    public GerenteDepartamento(String nome, String cpf, String rg, String endereco, String dataNascimento,
                               String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public GerenteDepartamento(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    public boolean alocarDepartamento(Departamento departamento, Funcionario funcionario) {
        if(departamento !=  null) {
            return departamento.addFuncionario(funcionario);
        }
        return false;
    }

    public boolean remanejarDepartamento(Departamento dptoOrigem, Departamento dptoDestino, Funcionario funcionario) {
        if(dptoOrigem != null && dptoDestino != null) {
            if (dptoOrigem.removeFuncionario(funcionario)) {
                return dptoDestino.addFuncionario(funcionario);
            }
        }
        return false;
    }

    public boolean definirLiderTecnico(Funcionario funcionario, LiderTecnico liderTecnico) {
        if(funcionario instanceof Colaborador) {
            ((Colaborador) funcionario).setLiderTecnico(liderTecnico);
            return true;
        }
        return false;
    }

    public boolean demitirFuncionario(Funcionario funcionario) {
        GestorFuncionarios gestor = new GestorFuncionarios();
        for(Funcionario func : gestor.listarFuncionarios()) {
            if(func.equals(funcionario)) {
                func.setAtivo(false);
                return true;
            }
        }
        return false;
    }
}
