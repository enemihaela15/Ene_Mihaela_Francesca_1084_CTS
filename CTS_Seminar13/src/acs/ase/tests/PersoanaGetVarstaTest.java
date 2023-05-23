package acs.ase.tests;

import acs.ase.clase.MyException;
import acs.ase.clase.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaGetVarstaTest {
    @Test
    public void getVarstaRightTest() {
        Persoana persoana = new Persoana("Miki", "6020215284551");
        assertEquals(21,persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryNouNascutTest() {
        Persoana persoana = new Persoana("Miki", "6230521284551");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryAnul2000Test() {
        Persoana persoana = new Persoana("Miki", "6000101284551");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryAnul1999Test() {
        Persoana persoana = new Persoana("Miki", "2991231284551");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    public void getVarstaExceptionTest() {
        Persoana persoana = new Persoana("Miki", "62305024284551");
        assertThrows(MyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @Test
    public void testGetVarstaPerformance(){
        Persoana persoana = new Persoana("Miki", "62305024284551");
        assertTimeout(Duration.ofMillis(1000), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

}