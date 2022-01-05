package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class GerenteGeral extends Funcionario implements Gerente {

    public GerenteGeral(String nome, String cpf, String rg, String endereco, String dataNascimento,
                        String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento, matricula, email, salarioBase);
    }

    public GerenteGeral(Pessoa pessoa, String matricula, String email, double salarioBase) {
        super(pessoa, matricula, email, salarioBase);
    }

    public boolean definirLiderTecnico(Funcionario funcionario, String nomeLiderTecnico) {
        if(funcionario instanceof Colaborador) {
            ((Colaborador) funcionario).setLiderTecnico(nomeLiderTecnico);
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

    @Override
    public List<String> getDadosFuncionario() {
        List<String> dadosFuncionario = super.getDadosFuncionario();
        if(isAtivo()){
            dadosFuncionario.add("Cargo atual: Gerente Geral");
        }
        else {
            dadosFuncionario.add("Cargo atual: Demitido");
        }
        return dadosFuncionario;
    }
}
