package com.company;

import java.util.HashSet;

public abstract class Vehiculo {

  private HashSet<Pasajero> pasajeros;
  private Integer asientos;

  public Vehiculo(Integer asientos) {
    this.asientos = asientos;
    this.pasajeros = new HashSet<Pasajero>();
  }

  public void subirPasajero(Pasajero unPasajero){
    //todo
  }

  public void bajarPasajero(){
    //todo
  }

  public void subirGrupo(GrupoPasajeros unGrupo){
    //todo
  }

}
