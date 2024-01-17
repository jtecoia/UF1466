package com.ceica.modelos;


class VehiculoMotorizado extends Vehiculo {
    // Atributo adicional
    String tipoCombustible;

    // Constructor
    public VehiculoMotorizado(String marca, String modelo, int anoFabricacion, String tipoCombustible) {
        super(marca, modelo, anoFabricacion);
        this.tipoCombustible = tipoCombustible;
    }

    // Método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
}