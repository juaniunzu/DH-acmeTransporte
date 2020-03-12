package com.company;

public class Micro extends Vehiculo {

  private Integer plazasParados;

  public Micro(Integer asientos, Integer plazasParados) {
    super(asientos);
    this.plazasParados = plazasParados;
  }

  @Override
  public void subirGrupo(GrupoPasajeros unGrupo) {
    //todo
  }

  @Override
  public void bajarPasajero(Pasajero unPasajero) {
    //todo
  }

  @Override
  public void subirPasajero(Pasajero unPasajero) {
    //todo
  }

  public Integer getPlazasParados() {
    return plazasParados;
  }

}
