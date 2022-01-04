package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    private String matricula;
    private String email;
    private double salarioBase;
    private LocalDate dataAdmissao;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String rg, String endereco, LocalDate dataNascimento,
                       String matricula, String email, double salarioBase) {
        super(nome, cpf, rg, endereco, dataNascimento);
        this.matricula = matricula;
        this.email = email;
        this.salarioBase = salarioBase;
        this.dataAdmissao = LocalDate.now();
        this.ativo = true;
    }

    public Funcionario(Pessoa pessoa, String matricula, String email, double salarioBase){
        super(pessoa.getNome(), pessoa.getCpf(), pessoa.getRg(),pessoa.getEndereco(),pessoa.getDataNascimento());
        this.matricula = matricula;
        this.email = email;
        this.salarioBase = salarioBase;
        this.dataAdmissao = LocalDate.now();
        this.ativo = true;
    }

    public String getMatricula() { return matricula; }

    public String getEmail() { return email; }

    public double getSalarioBase() { return salarioBase; }

    public LocalDate getDataAdmissao() { return dataAdmissao; }

    public boolean isAtivo() { return ativo; }

    protected void setAtivo(boolean ativo) { this.ativo = ativo; }

    protected void setSalarioBase(double salario) { this.salarioBase= salario; }

    protected void setEmail(String email) { this.email = email; }

    protected void setMatricula(String matricula) { this.matricula = matricula; }

    protected void setDataAdmissao(LocalDate data) { this.dataAdmissao = data; }

}
