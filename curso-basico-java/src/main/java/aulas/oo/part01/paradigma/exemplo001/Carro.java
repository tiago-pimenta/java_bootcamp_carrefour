package aulas.oo.part01.paradigma.exemplo001;

public class Carro {

    private String modelo = "GM";

    private Integer qtdPassageiros = 5;

    public String getModelo() {

        return modelo;
    }

    public Integer getQtdPassageiros() {

        return qtdPassageiros;
    }

    public String totalPassageiros(){

        return "O total de passageiros do carro é " + getQtdPassageiros();
    }

    public String entrar() {

        return "Entrando passageiro...";
    }

    public String sair() {

        return "Saindo passageiro...";
    }

}
