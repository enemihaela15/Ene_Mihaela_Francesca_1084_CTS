package cts.teste_mock;

import cts.categorii.Categorie1;
import cts.categorii.Categorie2;
import cts.mocks.PersoanaFake;
import cts.mocks.PersoanaStub;
import cts.mocks.PersoanaStubMinora;
import cts.model.IPersoana;
import cts.model.PachetTuristic;
import cts.model.Persoana;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {

    @Tag("tag2")
    @Test
    void poateRezervaPachet() {
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Altfel", 200.5);
        assertTrue(pachetTuristic.poateRezerva());
    }
    @Tag("tag2")
    @Test
    void nuPoateRezervaPachet() {
        IPersoana persoanaStub = new PersoanaStubMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Altfel", 200.5);
        assertFalse(pachetTuristic.poateRezerva());

    }
    @Tag("tag1")
    @Test
    void poatePrimiDiscount() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setGetVarstaValue(65);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Altfel", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(800,pachetTuristic.getPret());
    }

    @Test
    void nuPoatePrimiDiscount() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setGetVarstaValue(25);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Altfel", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(1000,pachetTuristic.getPret());
    }


}