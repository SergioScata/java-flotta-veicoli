package org.lessons.java.flottaveicoli;

public class Motociclette extends FlottaVeicoli {
    private boolean cavalletto;

    public Motociclette(String targa, int annoImmatricolazione, boolean cavalletto) {
        super(targa, annoImmatricolazione);
        this.cavalletto= cavalletto;
    }

    public boolean isCavalletto() {
        return cavalletto;
    }

    public void setCavalletto(boolean cavalletto) {
        this.cavalletto = cavalletto;
    }







}
