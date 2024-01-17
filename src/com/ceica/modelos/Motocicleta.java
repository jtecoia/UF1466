package com.ceica.modelos;

class Motocicleta extends VehiculoMotorizado {
    // Atributo adicional
    String tipoMotocicleta;

    // Constructor
    public Motocicleta(String marca, String modelo, int anoFabricacion, String tipoCombustible, String tipoMotocicleta) {
        super(marca, modelo, anoFabricacion, tipoCombustible);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    // Método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de motocicleta: " + tipoMotocicleta);
    }
}
