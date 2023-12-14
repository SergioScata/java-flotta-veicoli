package org.lessons.java.flottaveicoli;

import java.util.List;

public class GestoreFlotta {
    private List<FlottaVeicoli> veicoli;


    public List<FlottaVeicoli> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(List<FlottaVeicoli> veicoli) {
        this.veicoli = veicoli;
    }


    public void addVeicolo(FlottaVeicoli veicolo){
        veicoli.add(veicolo);
    }


}
