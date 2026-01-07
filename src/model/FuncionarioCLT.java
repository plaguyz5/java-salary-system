package model;

public class FuncionarioCLT extends Funcionario {
    private double salarioBase;
    private double descontoINSS;

    public FuncionarioCLT(String nome, double salarioBase, double descontoINSS) {
        super(nome);
        this.salarioBase = salarioBase;
        this.descontoINSS = descontoINSS;
    }

    @Override
    public double calcularSalario() {
        return salarioBase - descontoINSS;
    }
}
