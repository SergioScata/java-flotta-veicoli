package org.lessons.java.flottaveicoli;

import java.time.LocalDate;

public abstract class FlottaVeicoli {
    private String  targa;
    private int annoImmatricolazione;

    public FlottaVeicoli(String targa, int annoImmatricolazione) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getTarga() {
        return targa;
    }

    public void setNumTarga(String targa) {
        this.targa = targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }





}
