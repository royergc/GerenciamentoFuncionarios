package gestaofuncionarios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String rg, String endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getNome() { return nome; }

    public String getCpf() { return cpf; }

    public String getRg() { return rg; }

    public String getEndereco() {
        return endereco;
    }

    public String getDataNascimento() { return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); }

    public void setNome(String nome) { this.nome = nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setRg(String rg) { this.rg = rg; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void setDataNascimento(String dataNascimento) { this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")); }

}
