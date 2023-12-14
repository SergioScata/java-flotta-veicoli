package org.lessons.java.flottaveicoli;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta insiemeVeicoli = new GestoreFlotta();

        Automobili auto = new Automobili("LP4590RT", 2012, 5);
        insiemeVeicoli.addVeicolo(auto);
        Motociclette moto = new Motociclette("VN3789PH",2003, true);
        insiemeVeicoli.addVeicolo(moto);

        System.out.println(insiemeVeicoli.getAutoEMoto());

    }
}
