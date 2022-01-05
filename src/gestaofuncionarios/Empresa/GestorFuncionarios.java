package gestaofuncionarios.Empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorFuncionarios implements RH {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    public boolean adicionarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
            funcionario.setAtivo(true);
            funcionario.setDataAdmissao(LocalDate.now());
            return true;
        }
        return false;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public Funcionario procurarFuncionario(String matricula) {
        for(Funcionario func : funcionarios) {
            if(func.getMatricula().equals(matricula)) {
                return func;
            }
        }
        return null;
    }

    public List<Gerente> listarGerentesAtivos() {
        List<Gerente> gerentes = new ArrayList<>();
        for(Funcionario func : funcionarios) {
            if(func instanceof GerenteDepartamento || func instanceof GerenteGeral) {
                if(func.isAtivo()) {
                    gerentes.add((Gerente) func);
                }
            }
        }
        return gerentes;
    }

    public List<Funcionario> listarFuncionariosAtivos() {
        List<Funcionario> funcionariosAtivos = new ArrayList<>();
        for(Funcionario func: funcionarios) {
            if(func.isAtivo()){
                funcionariosAtivos.add(func);
            }
        }
        return funcionariosAtivos;
    }

    public List<Funcionario> listarFuncionariosInativos() {
        List<Funcionario> funcionariosInativos = new ArrayList<>();
        for(Funcionario func: funcionarios) {
            if(!func.isAtivo()){
                funcionariosInativos.add(func);
            }
        }
        return funcionariosInativos;
    }

    public boolean alterarDadosFuncionario(Funcionario funcionario, String email, String endereco) {
        if(funcionario != null) {
            funcionario.setEmail(email);
            funcionario.setEndereco(endereco);
            return true;
        }
        return false;
    }

    public boolean aumentarSalario(Funcionario funcionario, double aumento) {
        if(funcionario != null) {
            funcionario.setSalarioBase(funcionario.getSalarioBase() + aumento);
            return true;
        }
        return false;
    }
}
