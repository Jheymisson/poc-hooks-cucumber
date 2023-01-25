package org.example.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AppTestStep {

    @Dado("que informo o nome {string}")
    public void que_informo_o_nome(String nome) {
        System.out.println(nome);
    }

    @Quando("realizo uma busca pelo nome {string}")
    public void realizo_uma_busca_pelo_nome(String nome) {
        System.out.println(nome);
    }

    @Entao("valido que o nome {string}")
    public void valido_que_o_nome(String nome) {
        System.out.println(nome);
    }

}
