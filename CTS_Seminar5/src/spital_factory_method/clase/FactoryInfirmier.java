package spital_factory_method.clase;

public class FactoryInfirmier implements Factory{

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Infirmier(nume, 0);
    }
}
