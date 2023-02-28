package seminar1;

public class Papagal extends Animal{

	public Papagal(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public void eat(String numeIngrijitor) {
		System.out.println("Papagalul a fost hranit de "+ numeIngrijitor);
		
	}

}
