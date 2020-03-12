package com.company;

import java.util.HashSet;

public class Pasajero implements Registrable {

  private Boolean vaParado;

  public Pasajero(Boolean vaParado) {
    this.vaParado = vaParado;
  }

  @Override
  public void registrar() {
    //todo
  }

  public Boolean getVaParado() {
    return vaParado;
  }
}
