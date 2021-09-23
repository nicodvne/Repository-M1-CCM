package Intro;

public class GetSet {

	private int valeur = 0;
	private float[] notes = new float[5];
	
	public GetSet() {
		System.out.println(getValeur());
		setValeur(10);
		System.out.println(getValeur());
	}
	
	private void setValeur(int valeur) {
		this.valeur = valeur;
	}
	private int getValeur() {
		return valeur;
	}
	
	
	
	public void setNote(int i, float note) {
		notes[i] = note;
	}
	public float getNote(int i) {
		return notes[i];
	}
	
}
