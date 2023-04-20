package spital_factory_method.clase;

public class FactoryMedic implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
