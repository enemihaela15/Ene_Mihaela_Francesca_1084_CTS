package cts.mocks;

import cts.model.IPersoana;

public class PersoanaStub implements IPersoana {


    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
