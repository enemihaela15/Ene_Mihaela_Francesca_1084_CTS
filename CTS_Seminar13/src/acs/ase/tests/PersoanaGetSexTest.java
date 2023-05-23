package acs.ase.tests;

import acs.ase.clase.MyException;
import acs.ase.clase.Persoana;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaGetSexTest {
    @Test
    public void testGetRightSexMasculin() {
        Persoana persoana2 = new Persoana("Mihai", "5020215284551");
        assertEquals("M", persoana2.getSex());
    }
    @Test
    public void testGetRightSexFeminin() {
        Persoana persoana = new Persoana("Miki","6020215284551");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testFemininGetBoundary() {
        Persoana persoana = new Persoana("Miki", "6020215284551");
        assertEquals("F", persoana.getSex());
    }

    public String verificaImpar(String CNP) {
        int n = Integer.parseInt(CNP.charAt(0)+"");
        if(n%2!=0) {
            return "M";
        }
        return "F";
    }

    @Test
    public void testGetSexFemininCrossCheck() {
        Persoana persoana = new Persoana("Miki", "6020215284551");
        assertEquals(verificaImpar(persoana.CNP), persoana.getSex());
    }

    @Test
    public void testGetSexError(){
        Persoana persoana = new Persoana("Miki", "9020215284551");
        assertThrows(MyException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getSex();
            }
        });
    }

    @Test
    public void testGetSexPerformance (){
        Persoana persoana = new Persoana("Miki", "6020215284551");
        assertTimeout(Duration.ofMillis(1000), new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getSex();
            }
        });
    }
}