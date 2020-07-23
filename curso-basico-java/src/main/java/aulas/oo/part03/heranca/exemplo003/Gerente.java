package aulas.oo.part03.heranca.exemplo003;

public class Gerente extends Funcionarios {

    public double calculaImposto() {

        return this.getSalario() * 0.1;

    }

}
