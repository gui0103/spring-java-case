package br.com.confidencecambio.javabasico.service;

import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;
import java.util.Optional;
import static org.junit.Assert.*;

class IMCServiceTest {

    IMCService service = new IMCService();

    @Test
    void whenIPut2DoublesIWantItToRun() {
        final DecimalFormat df = new DecimalFormat("0.00");
        var weight = 70.0;
        var height = 1.76;
        var imc = 22.60;
        var validReturn = service.getIMC(weight, height);
        assertEquals(Optional.of(df.format(imc)), Optional.of(df.format(validReturn)));
    }

    @Test
    void whenIPutTheWrongResultIWantItNotToBeEqual() {
        final DecimalFormat df = new DecimalFormat("0.00");
        var weight = 50.0;
        var height = 1.72;
        var imc = 20.00;
        var validReturn = service.getIMC(weight, height);
        assertNotEquals(Optional.of(df.format(imc)), Optional.of(df.format(validReturn)));
    }
}