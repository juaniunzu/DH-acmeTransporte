package com.company;

public class Pasajero implements Registrable {

  private Boolean vaParado;
  private String nombre;

  public Pasajero(Boolean vaParado, String nombre) {
    this.vaParado = vaParado;
    this.nombre = nombre;
  }

  @Override
  public void registrar() {
    System.out.println("Se ha registrado al pasajero");
  }

  public Boolean getVaParado() {
    return vaParado;
  }

  public String getNombre() {
    return nombre;
  }
}
