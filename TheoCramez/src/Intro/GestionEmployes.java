package Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class GestionEmployes implements Runnable {

    private ArrayList<Employé> employees;
    private int nombreEmployee;

    public void setNombreEmployee(int nombreEmployee) {
        this.nombreEmployee = nombreEmployee;
    }

    public int getNombreEmployee() {
        return nombreEmployee;
    }

    public void setEmployees(ArrayList<Employé> employees) {
        this.employees = employees;
    }

    public ArrayList<Employé> getEmployees() {
        return employees;
    }

    public GestionEmployes(int nombreEmployee) {
        setNombreEmployee(nombreEmployee);
        setEmployees(new ArrayList<Employé>());
    }

    @Override
    public void run() {
        short compteur = 0;
        while(compteur < nombreEmployee) {
            employees.add(new Employé(new Agenda(new ArrayList<Tache>(
                Arrays.asList(
                    new Tache("tache 1", compteur),
                    new Tache("tache 2", (short)(compteur + 1)),
                    new Tache("tache 3", (short)(compteur + 2))
                )
            ))));
            System.out.println(
                this.employees.toString() + "\ncompteur: " + compteur + " - " + Thread.currentThread().getName()
            );
            compteur++;
            try {
                Thread.sleep(300);
            }
            catch(InterruptedException e) {
                System.out.println("Erreur thread sleep : " + e.getMessage());
            }
        }
    }
}
