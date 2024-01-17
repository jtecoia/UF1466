package com.ceica.modelos;

class Vehiculo {
    // Atributos
    String marca;
    String modelo;
    int anoFabricacion;

    // Constructor
    public Vehiculo(String marca, String modelo, int anoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
    }

    // Método mostrarDetalles
    public void mostrarDetalles() {
        System.out.println("Detalles del vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + anoFabricacion);
    }
}
