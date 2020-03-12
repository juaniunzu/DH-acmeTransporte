package com.company;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pasajero pepe = new Pasajero(true, "pepe");
        Pasajero juani = new Pasajero(true, "juani");
        Pasajero lopi = new Pasajero(true, "lopi");
        Pasajero edu = new Pasajero(false, "edu");
        Pasajero seba = new Pasajero(false, "seba");
        Pasajero lucia = new Pasajero(false, "lucia");
        Pasajero juan = new Pasajero(true, "juan");
        Pasajero luis = new Pasajero(false, "luis");
        Pasajero richar = new Pasajero(true, "richar");
        Pasajero lula = new Pasajero(false, "lula");
        Pasajero mateo = new Pasajero(true, "mateo");
        Pasajero lucas = new Pasajero(false, "lucas");
        Pasajero ana = new Pasajero(true, "ana");

        GrupoPasajeros unGrupo = new GrupoPasajeros();

        unGrupo.agregarAlGrupo(pepe);
        unGrupo.agregarAlGrupo(lopi);
        unGrupo.agregarAlGrupo(richar);
        unGrupo.agregarAlGrupo(lucas);
        unGrupo.agregarAlGrupo(lucia);
        unGrupo.agregarAlGrupo(mateo);
        unGrupo.agregarAlGrupo(juan);

        Micro bondi = new Micro(4, 4);
        Combi combi = new Combi(4);
        Auto auto = new Auto(2);

        /*
        bondi.subirPasajero(seba);
        bondi.subirPasajero(lula);
        bondi.subirPasajero(pepe);
        bondi.subirPasajero(juani);
        bondi.subirPasajero(richar);

         */

        bondi.subirGrupo(unGrupo);






    }
}
