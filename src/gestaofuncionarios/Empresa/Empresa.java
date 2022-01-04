package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Departamento> departamentos;
    private GerenteGeral gerenteGeral;

    public Empresa(Pessoa gerente) {

        departamentos = new ArrayList<>();
        gerenteGeral = new GerenteGeral(gerente,"2022/001", "joaodasilva@gmail.com",25000);
        Departamento dptoGerencia = new Departamento("Gerencia");

        GestorFuncionarios gestorFuncionarios = new GestorFuncionarios();
        gestorFuncionarios.adicionarFuncionario(gerenteGeral);
        gerenteGeral.alocarDepartamento(dptoGerencia,gerenteGeral);
    }

    public boolean criaNovoDepartamento(Departamento departamento) {
        if(departamento!= null) {
            for(Departamento dpto : departamentos) {
                if(dpto.getNomeDepartamento().equals(departamento.getNomeDepartamento())) {
                    return false; // departamento ja existe
                }
            }
            departamentos.add(departamento);
            return true;
        }
        return false;
    }

    public List<Departamento> listaDepartamentos() {
        return departamentos;
    }

    public GerenteGeral getGerenteGeral() {
        return gerenteGeral;
    }

    public boolean setGerenteGeral(GerenteGeral gerenteGeral) {
        if(gerenteGeral != null ) {
            this.gerenteGeral = gerenteGeral;
            return true;
        }
        return false;
    }

    public boolean setGerenteDepartamento(GerenteDepartamento gerente, Departamento departamento) {
        if(gerente != null && departamento != null) {
            return departamento.setGerenteDepartamento(gerente);
        }
        return false;
    }
}
