public class Clase01_Automovil {
    public static void main (String[] args) {
        /*Se pueden iniciar las variables por defecto desde la clase o se pueden modificar en el main
         * También se pueden crear diferentes instancias de la clase
         */
        Clase01_01_Automovil auto = new Clase01_01_Automovil("Chevrolet", "SAIL LTZ",
         "2019", "Negro", 1.4, 40);
        Clase01_01_Automovil mazda = new Clase01_01_Automovil("Mazda", "6", 
        "2019", "Negro", 1.6, 50);
        Clase01_01_Automovil nissan = new Clase01_01_Automovil("Nissan", "Navara", 
        "2019", "Negro", 3.0, 60);

        // Creamos un objeto sin atributos para compararlo y que de false sin excepción que termine la app
        Clase01_01_Automovil carro = new Clase01_01_Automovil(null, null, 
        null, null, 0, 0);

        System.out.println();

        System.out.println(auto.detalle() + "\n" + auto.acelerando(3000) + "\n" + 
        auto.frenar() + "\nKilometros por galón " + auto.consumo(300, 0.60f) + "\nKilometros por galón " + 
        auto.consumo(300, 60));
    
        System.out.println();

        System.out.println(mazda.detalle() + "\n" + mazda.acelerando(3500) + "\n" + 
        mazda.frenar() + "\nKilometros por galón " + mazda.consumo(300, 0.75f) + "\nKilometros por galón " + 
        mazda.consumo(300, 75));

        System.out.println();

        System.out.println(nissan.detalle() + "\n" + nissan.acelerando(3000) + "\n" + 
        nissan.frenar() + "\nKilometros por galón " + nissan.consumo(300, 0.60f) + "\nKilometros por galón " + 
        nissan.consumo(300, 60));

        System.out.println();

        System.out.println("El Mazda y el Nissan ¿Son iguales? " + (mazda == nissan));
        System.out.println("El año y el color del Mazda y el Nissan ¿Son iguales? " + (mazda.equals(nissan)));
        System.out.println("El Mazda y el carro tienen el mismo color y son del mismo año? " + (mazda.equals(carro)));

        System.out.println();
    }
}
