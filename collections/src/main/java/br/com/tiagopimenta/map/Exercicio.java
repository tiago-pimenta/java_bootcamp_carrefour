package br.com.tiagopimenta.map;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main (String[] args) {

        // Crie um Map

        Map<String, String> estados = new HashMap<>();

        // Adiconar os 26 estados

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapa");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceara");
        estados.put("ES", "Espirito Santo");
        estados.put("GO", "Goias");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Groso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Para");
        estados.put("PB", "Paraiba");
        estados.put("PR", "Parana");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piaui");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondonia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        // Remova o estado de Minas

        estados.remove("MG");

        // Adicione o Distrito Federal

        estados.put("DF", "Distrito Federal");

        // Verifique o tamanho do mapa

        System.out.println(estados.size());

        // Remova o Estado de Mato Grosso do Sul usando o nome

        estados.remove("MS", "Mato Grosso do Sul");

        // Navegue em todos os registros do map: Nome (Sigla)

        for (Map.Entry<String, String> entry: estados.entrySet()) {

            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");

        }

        // Verifique se o estado de Santa Catarina existe no map pela sigla

        System.out.println(estados.containsKey("SC"));

        // Verifique se o estado do Maranhão existe no map buscando pelo nome

        System.out.println(estados.containsValue("Maranhão"));

    }

}
