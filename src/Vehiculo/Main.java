package Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi("Ford", "Escort", "1234567890qwyrtyu", 4, Asiento.CALEFFACCION, 25.5, 10.0);
        Taxi taxi2 = new Taxi("Renault", "Megane", "1234567890qwertuy", 5, Asiento.RECLINABLE, 20, 30.5);

        Particular particula1 = new Particular("Lancia", "Delta", "1234567890poiuytr", 4, Asiento.CUERO, "Maradona",
                true);
        Particular particula2 = new Particular("Peugeot", "308", "1234567890poiuyte", 4, Asiento.RECLINABLE, "Messi",
                false);

        Autobus autobus1 = new Autobus("Mercedes", "Actros", "1234567890asdfghj", 3, 123, 5);

        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        listaVehiculos.add(taxi1);
        listaVehiculos.add(taxi2);
        listaVehiculos.add(particula1);
        listaVehiculos.add(particula2);
        listaVehiculos.add(autobus1);

        System.out.println("El Taxi 1 es: " + taxi1);
        System.out.println("El vehiculo 1 de la lista es: " + listaVehiculos.get(0));

        Vehiculo[] arrayVehiculos = new Vehiculo[5];

        for (int i = 0; i < arrayVehiculos.length; i++) {
            arrayVehiculos[i] = listaVehiculos.get(i);
        }

        System.out.println("El Taxi 1 es: " + taxi1);
        System.out.println("El vehiculo 1 del array : " + arrayVehiculos[0]);

        System.out.println("******************");
        mostrarVehiculos("taxi", listaVehiculos);
        mostrarVehiculos("particular", listaVehiculos);
        mostrarVehiculos("autobus", listaVehiculos);

        System.out.println("Comparamos los dos taxis");
        System.out.println(taxi1.compareTo(taxi2) != taxi2.compareTo(taxi1));
    }

    public static void mostrarVehiculos(String tipoVehiculo, List<Vehiculo> listaVehiculos) {
        for (int i = 0; i < listaVehiculos.size(); i++) {

            switch (tipoVehiculo) {
                case "taxi":
                    if (listaVehiculos.get(i).getClass() == Taxi.class) {
                        System.out.println(listaVehiculos.get(i));
                    }
                    break;
                case "particular":
                    if (listaVehiculos.get(i).getClass() == Particular.class) {
                        System.out.println(listaVehiculos.get(i));
                    }
                    break;

                case "autobus":
                    if (listaVehiculos.get(i).getClass() == Autobus.class) {
                        System.out.println(listaVehiculos.get(i));
                    }
                    break;

                default:
                    System.out.println("Error en tipo de vehículo introducido");
                    break;
            }

        }
    }

}
