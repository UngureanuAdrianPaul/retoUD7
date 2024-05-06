package Vehiculo;

public class Main {
    public static void main(String[] args) {


        Taxi taxi1 = new Taxi("Ford", "Escort", "1234567890qwyrtyu", 4, Asiento.CALEFFACCION, 25.5, 50.5);
        Taxi taxi2 = new Taxi("Renault", "Megane", "1234567890qwertuy", 5, Asiento.RECLINABLE, 20, 30.5);

        Particular particula1 = new Particular("Lancia", "Delta", "1234567890poiuytr", 4, Asiento.CUERO, "Maradona", true);
        Particular particula2 = new Particular("Peugeot", "308", "1234567890poiuyte", 4, Asiento.RECLINABLE, "Messi", false);
    
        Autobus autobus1 = new Autobus("Mercedes", "Actros", "1234567890asdfghj", 3, 123, 5);
    

        System.out.println("**Primer Taxi** \n");
        System.out.println(taxi1.toString() + "\n");

        System.out.println("**Segundo Taxi** \n");
        System.out.println(taxi2.toString() + "\n");

        System.out.println("**Primer Particular** \n");
        System.out.println(particula1.toString() + "\n");

        System.out.println("**Segundo Particular** \n");
        System.out.println(particula2.toString() + "\n");

        System.out.println("**Primer Autobús** \n");
        System.out.println(autobus1.toString() + "\n");

        System.out.println("Total de vehículos alquilados o funcionando: " + Vehiculo.getCantVehiculos() + " vehículos \n");

        taxi1.reiniciarContador(25000.00);
        System.out.println("---Se procede a reiniciar kilometraje del primer taxi con un total de " + taxi1.getKmRecorridos() + " km. \n");
        System.out.println("---Kilometraje del primer taxi reiniciando \n");
       
        System.out.println( "---El coste del trayecto para el primer taxi es de: " + taxi1.calcularCosteTrayecto() + "\n");

        System.out.println("**Informacion actualizada para el primer taxi**");
        System.out.println(taxi1.toString() + "\n");

        System.out.println("**Informacion actualizada para el primer particular** ");
        particula1.reiniciarContador(10000.00);
        System.out.println(particula1.toString() + "\n");

        System.out.println("**Informacion actualizada para el segundo particular**");
        particula2.setPropietario("Norris");
        System.out.println(particula2.toString());

        
    
    
    
    }
}
