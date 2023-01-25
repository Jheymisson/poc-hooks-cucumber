package org.example;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void executarAntesDeCadaCenario() {
        System.out.println("=========> Iniciado Cenário de Teste <=========");
    }

    @BeforeStep
    public void executaAntesDeCadaCenario() {
        System.out.println("===>  Antes de cada Step  <===");
    }

    @AfterStep
    public void executaDepoisDeCadaCenario() {
        System.out.println("===>  Depois de cada Step  <===");
    }

    @After
    public void depoisDeCadaCenario() {
        System.out.println("=========> Finalizado Cenário de Teste <=========");
    }


}
