

public class Main {
    public static void AplicacionConsola(String[] args) {
        // Crear instancias de diferentes tipos de vehículos
        Vehiculo vehiculo = new Vehiculo("Toyota", "Camry", 2022);
        VehiculoMotorizado vehiculoMotorizado = new VehiculoMotorizado("Honda", "Civic", 2021, "Gasolina");
        Automovil automovil = new Automovil("Ford", "Focus", 2020, "Gasolina", 4);
        Motocicleta motocicleta = new Motocicleta("Harley-Davidson", "Sportster", 2019, "Gasolina", "Deportiva");

        // Llamar al método mostrarDetalles() para imprimir los detalles de cada vehículo
        vehiculo.mostrarDetalles();
        System.out.println("---------------------");
        vehiculoMotorizado.mostrarDetalles();
        System.out.println("---------------------");
        automovil.mostrarDetalles();
        System.out.println("---------------------");
        motocicleta.mostrarDetalles();
    }
}

