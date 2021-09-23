package com.company;

import java.util.ArrayList;
import java.util.List;

public class agenda {

    protected ArrayList<tache> listTache = new ArrayList<>();

    public agenda() {

    }

    public ArrayList<tache> getListTache() {
        return listTache;
    }
    public ArrayList<tache> tachesFaites(ArrayList<tache> listTache) {
        ArrayList<tache> listFait = new ArrayList<>();
        for (com.company.tache tache : listTache) {
            if (tache.getFait()) {
                listFait.add(tache);
            }
        }
        return listFait;
    }

    public ArrayList<tache> getListTacheByDate(int jour) {
        ArrayList<tache> listByDate = new ArrayList<>();
        for (com.company.tache tache : listTache) {
            if (tache.getDate() == jour) {
                listByDate.add(tache);
            }
        }
        return listByDate;
    }

    public tache addTache(int jour, int priorite, String libelle) {
        return new tache(jour, priorite, libelle);
    }
}
