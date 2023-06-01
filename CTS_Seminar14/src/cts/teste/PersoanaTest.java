package cts.teste;

import cts.model.ExceptieCNPInexistent;
import cts.model.ExceptieVarsta;
import cts.model.IPersoana;
import cts.model.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {


    @Test
    void getVarsta() {
        IPersoana persoana = new Persoana("Adi", "5010512415523");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryNouNascut() {
        IPersoana persoana = new Persoana("Marcel", "5230523551122");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void testGetVarstaBoundaryAn2000() {
        IPersoana persoana = new Persoana("Bia", "6000101442233");
        assertEquals(23, persoana.getVarsta());
    }
    @Test
    void testGetVarstaBoundaryAn1999() {
        IPersoana persoana = new Persoana("Bia", "2991231284551");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void testGetVarstaError() {
        IPersoana persoana = new Persoana("Bia", "6230724661122");
        assertThrows(ExceptieVarsta.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @Test
    void testGetVarstaPerformance() {
        IPersoana persoana = new Persoana("Bia", "62305024284551");
        assertTimeout(Duration.ofMillis(1000), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @Test
    void testConstructorPersoanaConformance() {
        Persoana persoana = new Persoana("Bia", "6230502428451");
        assertEquals(13, persoana.CNP.length());
    }

    @Test
    void testGetVarstaOrder() {
        Persoana persoana = new Persoana("Bia", "5010212667788");
        Persoana persoana2 = new Persoana("Bia", "5020309558899");
        assertTrue(persoana.getVarsta() > persoana2.getVarsta());
    }

    @Test
    void testGetVarstaNoCNP() {
        IPersoana persoana = new Persoana(null, null);
        assertThrows(ExceptieCNPInexistent.class, () -> persoana.getVarsta());
    }

    //CARDINALITATE
    @Test
    void testGetVarstaCardinality() {
        IPersoana persoana = new Persoana("Gabi", "52205235596967");
        assertEquals(1, persoana.getVarsta());
    }


}