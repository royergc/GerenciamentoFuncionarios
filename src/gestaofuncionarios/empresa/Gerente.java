package gestaofuncionarios.empresa;

public interface Gerente  {
    boolean definirLiderTecnico(Funcionario funcionario, String nomeLiderTecnico);
    boolean demitirFuncionario(Funcionario funcionario);
}
