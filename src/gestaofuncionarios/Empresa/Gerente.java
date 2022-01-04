package gestaofuncionarios.Empresa;

public interface Gerente  {
    boolean alocarDepartamento(Departamento departamento, Funcionario funcionario);
    boolean remanejarDepartamento(Departamento dptoOrigem, Departamento dptoDestino, Funcionario funcionario);
    boolean definirLiderTecnico(Funcionario funcionario, LiderTecnico liderTecnico);
    boolean demitirFuncionario(Funcionario funcionario);
}
