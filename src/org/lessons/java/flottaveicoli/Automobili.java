package org.lessons.java.flottaveicoli;

public class Automobili extends FlottaVeicoli {
    private int numPorte;

    public Automobili(String targa, int annoImmatricolazione, int numPorte) {
        super(targa, annoImmatricolazione);
        this.numPorte = numPorte;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {
        return super.toString() + " Numero di porte: " + getNumPorte();
    }
}
