package com.company;

import java.util.ArrayList;

public class GrupoPasajeros implements Registrable {

  private ArrayList<Pasajero> pasajerosEnGrupo;

  public GrupoPasajeros() {
    this.pasajerosEnGrupo = new ArrayList<Pasajero>();
  }

  public ArrayList<Pasajero> getPasajerosEnGrupo() {
    return pasajerosEnGrupo;
  }

  public void agregarAlGrupo(Pasajero unPasajero){
    this.pasajerosEnGrupo.add(unPasajero);
  }

  public void sacarDelGrupo(Pasajero unPasajero){
    this.pasajerosEnGrupo.remove(unPasajero);
  }

  @Override
  public void registrar() {
    for (Pasajero pasajero : pasajerosEnGrupo) {
      System.out.println("Se ha registrado al pasajero del grupo");
    }
  }
}
