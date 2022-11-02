package br.com.confidencecambio.javabasico.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    Cliente cliente = new Cliente("Guilherme de Carvalho Costa");
    Gerente gerente = new Gerente("João Soares Silva");
    Robo robo = new Robo("Alexa Siri Cortana GPT-3");

    @Test
    void getFirstNameHaveToRun() {
        var methodReturn = cliente.getFirstName();
        assertEquals("Guilherme", methodReturn);
    }

    @Test
    void getLastNamesHaveToRun() {
        var methodReturn = cliente.getLastNames();
        assertEquals("de Carvalho Costa", methodReturn);
    }

    @Test
    void getUpperCasedNameHaveToRun() {
        var methodReturn = cliente.getUpperCasedName();
        assertEquals("GUILHERME DE CARVALHO COSTA", methodReturn);
    }

    @Test
    void getShortNameHaveToRun() {
        var methodReturn = cliente.getShortName();
        assertEquals("Guilherme de C. Costa", methodReturn);
    }

    @Test
    void getShortNameWithNoMiddleLowerCaseWordHaveToRun() {
        var methodReturn = gerente.getShortName();
        assertEquals("João S. Silva", methodReturn);
    }

    @Test
    void removeWordsHaveToRun() {
        var methodReturn = cliente.removeFirstThreeWords();
        assertEquals(" Costa", methodReturn);
    }

    @Test
    void getNameHaveToRun() {
        var methodReturn = cliente.getName();
        assertEquals("Guilherme de Carvalho Costa", methodReturn);
    }

    @Test
    void getFirstNameHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.getFirstName();
        assertEquals("Alexa", methodReturn);
    }

    @Test
    void getLastNamesHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.getLastNames();
        assertEquals("Siri Cortana GPT-3", methodReturn);
    }

    @Test
    void getUpperCasedNameHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.getUpperCasedName();
        assertEquals("ALEXA SIRI CORTANA GPT-3", methodReturn);
    }

    @Test
    void getShortNameHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.getShortName();
        assertEquals("Alexa S. Cortana GPT-3", methodReturn);
    }

    @Test
    void removeWordsHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.removeFirstThreeWords();
        assertEquals(" GPT-3", methodReturn);
    }

    @Test
    void removeWordsHaveToRunWithASmallerNameAlso() {
        var methodReturn = gerente.removeFirstThreeWords();
        assertEquals("", methodReturn);
    }

    @Test
    void getNameHaveToRunWithAnotherNameAlso() {
        var methodReturn = robo.getName();
        assertEquals("Alexa Siri Cortana GPT-3", methodReturn);
    }
}