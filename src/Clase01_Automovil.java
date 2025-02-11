public class Clase01_Automovil {
    public static void main(String[] args) {
        /*
         * Se pueden iniciar las variables por defecto desde la clase o se pueden
         * modificar en el main
         * También se pueden crear diferentes instancias de la clase
         */
        Clase01_01_Automovil auto = new Clase01_01_Automovil("Chevrolet", "SAIL LTZ",
                "2019", Tipo.SEDAN, Clase01_01_AutomovilEnum.AZUL, 1.4, Caja.ASISTIDA, 40);
        Clase01_01_Automovil mazda = new Clase01_01_Automovil("Mazda", "6",
                "2019", Tipo.HATCHBACK, Clase01_01_AutomovilEnum.NEGRO, 1.6, Caja.MECANICA, 50);
        Clase01_01_Automovil nissan = new Clase01_01_Automovil("Nissan", "Navara",
                "2019", Tipo.CAMPERO, Clase01_01_AutomovilEnum.ROJO, 3.0, Caja.AUTOMATICA, 60);
        Clase01_01_Automovil Toyota = new Clase01_01_Automovil("Toyota", "Hilux",
                "2015", Tipo.CAMIONETA, Clase01_01_AutomovilEnum.GRIS, 4.0, Caja.PENTATONICA, 60);
        Clase01_01_Automovil Ferrari = new Clase01_01_Automovil("Ferrari", "Diavolo",
                "2015", Tipo.DEPORTIVO, Clase01_01_AutomovilEnum.AMARILLO, 4.0, Caja.AUTOMATICA, 60);

        // Creamos un objeto sin atributos para compararlo y que de false sin excepción
        // que termine la app
        Clase01_01_Automovil carro = new Clase01_01_Automovil(null, null,
                null, null, null, 0, null, 0);

        System.out.println();

        // Cambiamos el coloR patente CON GETTER & SETTER NO CON EL CONSTRUCTOR
        Clase01_01_Automovil.setColorPatente("Rojo");

        System.out.println(auto.detalle() +
                "\n" + auto.acelerando(3000) +
                "\n" + auto.frenar() +
                "\nKilometros por galón " + auto.consumo(300, 0.60f) +
                "\nKilometros por galón " + auto.consumo(300, 60));

        System.out.println();

        System.out.println(mazda.detalle() +
                "\n" + mazda.acelerando(3500) +
                "\n" + mazda.frenar() +
                "\nKilometros por galón " + mazda.consumo(300, 0.75f) +
                "\nKilometros por galón " + mazda.consumo(300, 75));

        System.out.println();

        System.out.println(nissan.detalle() +
                "\n" + nissan.acelerando(3000) +
                "\n" + nissan.frenar() +
                "\nKilometros por galón " + nissan.consumo(300, 0.60f) +
                "\nKilometros por galón " + nissan.consumo(300, 60));

        System.out.println();

        System.out.println(Toyota.detalle() +
                "\n" + Toyota.acelerando(3500) +
                "\n" + Toyota.frenar() +
                "\nKilometros por galón " + Toyota.consumo(300, 0.65f) +
                "\nKilometros por galón " + Toyota.consumo(300, 65));

        System.out.println();

        System.out.println(Ferrari.detalle() +
                "\n" + Ferrari.acelerando(4000) +
                "\n" + Ferrari.frenar() +
                "\nKilometros por galón " + Ferrari.consumo(300, 0.70f) +
                "\nKilometros por galón " + Ferrari.consumo(300, 70));

        System.out.println();

        System.out.println("El Mazda y el Nissan ¿Son iguales? " + (mazda == nissan));
        System.out.println("El año y el color del Mazda y el Nissan ¿Son iguales? " + (mazda.equals(nissan)));
        System.out.println("El Mazda y el carro tienen el mismo color y son del mismo año? " + (mazda.equals(carro)));

        System.out.println();

        System.out.println("===== TIPOS DE VEHÍCULOS RELACIONADOS =====");

        System.out.println();

        Tipo[] tipos = Tipo.values();

        for (Tipo tipo : tipos) {
            System.out.print(tipo + " ");
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < tipos.length; i++) {
            System.out.print(tipos[i] + " ");
            System.out.println();
        }

        System.out.println();
    }
}
