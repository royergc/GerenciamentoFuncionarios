package gestaofuncionarios.Empresa;

import java.util.List;

public interface RH {

    boolean adicionarFuncionario(Funcionario funcionario);
    boolean alterarDadosFuncionario(Funcionario funcionario, String email, String endereco);
    boolean aumentarSalario(Funcionario funcionario, double aumento);
    List<Funcionario> listarFuncionarios();
    List<Funcionario> listarFuncionariosAtivos();
    List<Funcionario> listarFuncionariosInativos();

}
