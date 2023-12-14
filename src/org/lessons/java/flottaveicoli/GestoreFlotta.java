package org.lessons.java.flottaveicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    private List<FlottaVeicoli> veicoli = new ArrayList<>();


    public List<FlottaVeicoli> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(List<FlottaVeicoli> veicoli) {
        this.veicoli = veicoli;
    }


    public void addNewVeicolo (FlottaVeicoli newVeicolo){

        for (FlottaVeicoli veicolo : veicoli){
            if (veicolo.getTarga().equals(newVeicolo.getTarga())){
                System.out.println("Esiste gia un veicolo con questa targa!!");
                return;
            }
        }
        veicoli.add(newVeicolo);

    }

    public String getAutoEMoto(){
        int counterAuto = 0;
        int counterMoto = 0;
        for (FlottaVeicoli veicolo : veicoli){
            if (veicolo instanceof Automobili){
                counterAuto++;
            } else if (veicolo instanceof Motociclette) {
                counterMoto++;
            }
        }
        return "Il numero di automobili è: " + counterAuto + ", il numero di moto è: " + counterMoto;
    }

    public FlottaVeicoli findVehicle (String targa){
        FlottaVeicoli found = null;
        for (FlottaVeicoli veicolo : veicoli){
            if (veicolo.getTarga().equals(targa)){
                found = veicolo;
            }
        }
        return found;
    }
    }



