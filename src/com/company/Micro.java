package com.company;

public class Micro extends Vehiculo {

  private Integer plazasParados;

  public Micro(Integer asientos, Integer plazasParados) {
    super(asientos);
    this.plazasParados = plazasParados;
  }

  public Integer getPlazasParados() {
    return plazasParados;
  }

}
