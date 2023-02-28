package seminar1;

public class Lion extends Animal{

	public Lion(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Leul " + this.getNume() + " are " + this.getVarsta() 
		+ " ani si a fost hranit de catre ingrijitorul " + numeIngrijitor);
	}

}
