package com.ceica.modelos;

class Automovil extends VehiculoMotorizado {
    // Atributo adicional
    int numeroPuertas;

    // Constructor
    public Automovil(String marca, String modelo, int anoFabricacion, String tipoCombustible, int numeroPuertas) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }

    // Método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
