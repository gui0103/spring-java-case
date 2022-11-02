package br.com.confidencecambio.javabasico.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    Cliente cliente = new Cliente("Guilherme de Carvalho Costa");

    @Test
    void getFirstName() {
        var methodReturn = cliente.getFirstName();
        assertEquals("Guilherme", methodReturn);
    }

    @Test
    void getLastNames() {
        var methodReturn = cliente.getLastNames();
        assertEquals("de Carvalho Costa", methodReturn);
    }

    @Test
    void getUpperCasedName() {
    }

    @Test
    void getShortName() {
    }

    @Test
    void removeWords() {
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }
}