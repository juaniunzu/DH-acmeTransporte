package com.company;

import java.util.HashSet;

public class GrupoPasajeros implements Registrable {

  private HashSet<Pasajero> pasajerosEnGrupo;

  public GrupoPasajeros() {
    this.pasajerosEnGrupo = new HashSet<Pasajero>();
  }

  public HashSet<Pasajero> getPasajerosEnGrupo() {
    return pasajerosEnGrupo;
  }

  public void agregarAlGrupo(Pasajero unPasajero){
    //todo
  }

  public void sacarDelGrupo(Pasajero unPasajero){
    //todo
  }

  @Override
  public void registrar() {
    //todo
  }
}
