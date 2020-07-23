package aulas.oo.part03.heranca.exemplo003;

public class Funcionarios {

    private double salario;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.salario;
    }

}
