package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctajObtinut;
	protected int nrProiecte;
	protected String[] denumiriProiect;
	protected static int pragAcceptare = 80;
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctajObtinut = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumiriProiect = denumireProiect;
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public int getPunctaj() {
		return punctajObtinut;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctajObtinut = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public String[] getDenumireProiect() {
		return denumiriProiect;
	}
	
	public void setDenumireProiect(int nrProiecte, String[] denumireProiect) {
		this.nrProiecte = nrProiecte;
		this.denumiriProiect = new String[this.nrProiecte];
		
		for(int i=0;i<this.nrProiecte;i++) {
			this.denumiriProiect[i] = denumireProiect[i];
		}
	}
	
	public int getNr_proiecte() {
		return nrProiecte;
	}
	
	public void setNr_proiecte(int nr_proiecte) {
		this.nrProiecte = nr_proiecte;
	}

	public static int getPragAcceptare() {
		return pragAcceptare;
	}

	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}

	public void afisareStatus(){
		System.out.println("Aplicantul "+ nume + " "+ prenume
				 + (punctajObtinut > pragAcceptare ? "" : " nu") 
				+ " a fost acceptat");
	} 
	
	public abstract void afisareFinantare();

	protected void afisareFinantare(String tipAplicant, int sumaFinantata) { 
		System.out.println(tipAplicant +getNume()+" "+getPrenume()+" primeste "+sumaFinantata+" Euro/zi in proiect.");
	}
	
}
