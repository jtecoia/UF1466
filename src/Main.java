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

public class Main {
    public static void main(String[] args) {
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
