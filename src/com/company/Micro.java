package com.company;

import java.util.ArrayList;

public class Micro extends Vehiculo {

  private Integer plazasParados;
  private ArrayList<Pasajero> pasajerosParados;

  public Micro(Integer asientos, Integer plazasParados) {
    super(asientos);
    this.plazasParados = plazasParados;
    this.pasajerosParados = new ArrayList<Pasajero>();
  }


  private boolean pasajeroParado(Pasajero unPasajero){
    return pasajerosParados.contains(unPasajero);
  }

  private boolean pasajeroSentado(Pasajero unPasajero){
    return pasajeros.contains(unPasajero);
  }

  @Override
  public void bajarPasajero(Pasajero unPasajero) {
    if(pasajeroSentado(unPasajero)){
      bajarPasajero(unPasajero);
    } else if(pasajeroParado((unPasajero))){
      if(this.plazasParados > 0){
        pasajerosParados.remove(unPasajero);
        plazasParados++;
      }
    }
  }

  @Override
  public void subirPasajero(Pasajero unPasajero) {
    if(this.asientos > 0){
      this.pasajeros.add(unPasajero);
      this.asientos--;
      System.out.println("Se sube " + unPasajero.getNombre() + " al micro y se sienta");
    } else {
      if(unPasajero.getVaParado() && this.plazasParados > 0){
        this.pasajerosParados.add(unPasajero);
        this.plazasParados--;
        System.out.println("Se sube parado el pasajero " + unPasajero.getNombre());
      } else {
        System.out.println("El colectivo no tiene asientos");
      }
    }

  }

  @Override
  public void subirGrupo(GrupoPasajeros unGrupo) {
    ArrayList<Pasajero> pasajeroQueSubeAlMicro = new ArrayList<Pasajero>();
    for (Pasajero pasajero : unGrupo.getPasajerosEnGrupo()) {

      subirPasajero(pasajero);
      pasajeroQueSubeAlMicro.add(pasajero);

    }

    for (Pasajero pasajero : pasajeroQueSubeAlMicro) {
      unGrupo.sacarDelGrupo(pasajero);
    }



  }

  public Integer getPlazasParados() {
    return plazasParados;
  }

}
