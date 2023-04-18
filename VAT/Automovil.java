package VAT;

public class Automovil {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTransnmición("Estandar");
        vehiculo.setTipo("Terrestre");
        vehiculo.setToneladas("Pesa 4 toneladas");

        vehiculo.Funciona();
        vehiculo.Enciende();
        System.out.println(vehiculo);
        Taxi taxi = new Taxi("Ilegal", "No tanto", "No es electrico"    );
        System.out.println(taxi);

        taxi.Funciona();
        taxi.Enciende();
        taxi.Acelerar();
        taxi.Servicio();
        taxi.Manipulado();

        System.out.println();
        Vehiculo elvehiculo = new Taxi();
        vehiculo.Funciona();

    }
}