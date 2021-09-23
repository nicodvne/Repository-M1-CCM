package Intro;

import java.util.Date;

public class Tache {

	private String Libelle;
	private int Priorite;
	private Date DateDebut;
	private boolean Effectuee;
	
	public Tache(String libelle, int priorite, Date dateDebut) {
		super();
		setLibelle(libelle);
		setPriorite(priorite);
		setDateDebut(dateDebut);
		setEffectuee(false);
	}
	
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public int getPriorite() {
		return Priorite;
	}
	public void setPriorite(int priorite) {
		Priorite = priorite;
	}
	public Date getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}
	public boolean isEffectuee() {
		return Effectuee;
	}
	public void setEffectuee(boolean effectuee) {
		Effectuee = effectuee;
	}
	
	
	
}
