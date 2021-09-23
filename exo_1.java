package com.company;

public class exo_1 {
    protected int variable = 0;
    public exo_1() {
        System.out.println("Resultat constructeur = " + this.getVariable());
        this.setVariable(10);
        System.out.println("Résultat getVariable après setVariable = " + this.getVariable());
    }


    public void setVariable(int newVariable) {
        variable = newVariable;
    }
    public int getVariable() {
        return variable;
    }
    public void getNotes(int i) {

    }
}
