public class Clase01_Automovil {
    public static void main (String[] args) {
        /*Se pueden iniciar las variables por defecto desde la clase o se pueden modificar en el main
         * También se pueden crear diferentes instancias de la clase
         */
        Clase01_01_Automovil auto = new Clase01_01_Automovil();
        Clase01_01_Automovil mazda = new Clase01_01_Automovil();

        auto.anio = "2019";
        auto.cilindraje = 1.4;
        auto.color = "Negro";
        auto.marca = "Chevrolet";
        auto.modelo = "SAIL LTZ";

        mazda.anio = "2019";
        mazda.cilindraje = 1.6;
        mazda.color = "Negro";
        mazda.marca = "Mazda";
        mazda.modelo = "6";

        System.out.println();

        System.out.println(auto.detalle());
        System.out.println(auto.acelerando(3000));
        System.out.println(auto.frenar());
        System.out.println("Kilometros por galón " + auto.consumo(300, 0.60f));
        System.out.println("Kilometros por galón " + auto.consumo(300, 60));

        System.out.println();

        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerando(3500));
        System.out.println(mazda.frenar());
        System.out.println("Kilometros por galón " + mazda.consumo(300, 0.75f));
        System.out.println("Kilometros por galón " + mazda.consumo(300, 75));

        System.out.println();
    }
}
