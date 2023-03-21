package spital_factory_method;

public class FactoryAnestezist implements Factory{
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Anestezist(nume);
    }
}
