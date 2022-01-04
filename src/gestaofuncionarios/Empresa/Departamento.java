package gestaofuncionarios.Empresa;

import java.util.List;

public class Departamento {

    private String nomeDepartamento;
    private List<Funcionario> membrosDepartamento;
    private GerenteDepartamento gerenteDepartamento;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public boolean setGerenteDepartamento(GerenteDepartamento gerente) {
        if (gerente != null) {
            this.gerenteDepartamento = gerente;
            return true;
        }
        return false;
    }

    public GerenteDepartamento getGerenteDepartamento() {
        return gerenteDepartamento;
    }

    public boolean addFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            membrosDepartamento.add(funcionario);
            return true;
        }
        return false;
    }

    public boolean removeFuncionario(Funcionario funcionario) {
        if(funcionario != null) {
            return membrosDepartamento.remove(funcionario);
        }
        return false;
    }


    public boolean procuraFuncionario(Funcionario funcionario) {
        for(Funcionario func : membrosDepartamento) {
            if (func.equals(funcionario)) {
                return true;
            }
        }
        return false;
    }

    public List<Funcionario> getMembrosDepartamento() {
        return membrosDepartamento;
    }
}
