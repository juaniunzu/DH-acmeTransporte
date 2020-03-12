package com.company;

import java.util.HashSet;
import java.util.*;
import java.util.ArrayList;

public abstract class Vehiculo {

  private ArrayList<Pasajero> pasajeros;
  private Integer asientos;

  public Vehiculo(Integer asientos) {
    this.asientos = asientos;
    this.pasajeros = new ArrayList<Pasajero>();
  }

  public void subirPasajero(Pasajero unPasajero){
    if(this.asientos > 0){
      pasajeros.add(unPasajero);
      this.asientos--;
    } else {
      System.out.println("El vehículo está completo y no puede subir más pasajeros");
    }
  }

  public void bajarPasajero(Pasajero unPasajero){
    if(this.asientos > 0){
      pasajeros.remove(unPasajero);
      this.asientos++;
    } else {
      System.out.println("El vehículo está vacío");
    }

  }

  public void subirGrupo(GrupoPasajeros unGrupo){

    for (Pasajero pasajero : unGrupo.getPasajerosEnGrupo()) {

      while (this.asientos > 0){
        subirPasajero(pasajero);
        unGrupo.sacarDelGrupo(pasajero);
      }

    }

  }

}
