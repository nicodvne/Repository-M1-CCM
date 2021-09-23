package Intro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {

	private ArrayList<Tache> taches = new ArrayList<Tache>();
	
	public Agenda() {
		taches.add(new Tache("une tache", 1, new Date()));
		taches.add(new Tache("une autre tache", 2, new Date()));
		taches.add(new Tache("une derniere tache", 3, new Date()));
	}

	public List<Tache> TachesRealisees() {
		return taches.stream().filter(Tache::isEffectuee).collect(Collectors.toList());
	}
	
	public List<Tache> TachesAPartirDeDate(Date date){
		return taches.stream().filter(tache -> tache.getDateDebut().equals(date)).collect(Collectors.toList());
	}
	
}
