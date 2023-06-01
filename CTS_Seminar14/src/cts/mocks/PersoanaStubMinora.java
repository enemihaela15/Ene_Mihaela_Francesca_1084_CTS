package cts.mocks;

import cts.model.IPersoana;

public class PersoanaStubMinora implements IPersoana {

    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 16;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
