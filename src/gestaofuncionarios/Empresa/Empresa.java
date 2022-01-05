package gestaofuncionarios.Empresa;

import gestaofuncionarios.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private static List<Departamento> departamentos = new ArrayList<>();
    private static GerenteGeral gerenteGeral;

/*    public Empresa(Pessoa gerente) {

        departamentos = new ArrayList<>();
        gerenteGeral = new GerenteGeral(gerente,"2022/001", "joaodasilva@gmail.com",25000);
        Departamento dptoGerencia = new Departamento("Gerencia");

        GestorFuncionarios gestorFuncionarios = new GestorFuncionarios();
        gestorFuncionarios.adicionarFuncionario(gerenteGeral);
        gerenteGeral.alocarDepartamento(dptoGerencia,gerenteGeral);
    }*/

    public static boolean alocarDepartamento(Departamento departamento, Funcionario funcionario) {
    if(departamento !=  null) {
        return departamento.addFuncionario(funcionario);
    }
    return false;
}

    public static boolean remanejarDepartamento(Departamento dptoOrigem, Departamento dptoDestino, Funcionario funcionario) {
        if(dptoOrigem != null && dptoDestino != null) {
            if (dptoOrigem.removeFuncionario(funcionario)) {
                return dptoDestino.addFuncionario(funcionario);
            }
        }
        return false;
    }

    public static Departamento criaNovoDepartamento(String departamento) {
        for(Departamento dpto : departamentos) {
            if(dpto.getNomeDepartamento().equals(departamento)) {
                return dpto; // departamento ja existe
            }
        }
        Departamento depto = new Departamento(departamento);
        departamentos.add(depto);
        return depto;
    }

    public static List<Departamento> listaDepartamentos() {
        return departamentos;
    }

    public static GerenteGeral getGerenteGeral() {
        return gerenteGeral;
    }

    public static boolean setGerenteGeral(GerenteGeral gg) {
        if(gg != null ) {
            gerenteGeral = gg;
            return true;
        }
        return false;
    }

    public static boolean setGerenteDepartamento(GerenteDepartamento gerente, Departamento departamento) {
        if(gerente != null && departamento != null) {
            return departamento.setGerenteDepartamento(gerente);
        }
        return false;
    }
}
