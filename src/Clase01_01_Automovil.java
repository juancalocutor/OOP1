public class Clase01_01_Automovil {

    private String marca, modelo, anio, color;
    private double cilindraje;
    private int tanque;

    /* Primero hicimos un Get y Set y al final se diseñó un constructor 
     * la idea es que sean menos líneas de código
    */

    public Clase01_01_Automovil(String marca, String modelo, String anio, String color, double cilindraje, int tanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.cilindraje = cilindraje;
        this.tanque = tanque;
    }

    public String detalle() {
        return "Fabricante = " + this.marca + "\nModelo = " + this.modelo +
                "\nAño = " + this.anio + "\nCilindraje = " + this.cilindraje +
                "\nColor = " + this.color;
    }

    public String acelerando(int rpm) {
        return "El auto " + this.marca + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return "El auto " + this.marca + " " + " ha frenado";
    }

    // sobre carga de método

    public float consumo(int km, float gasolina) {
        return km / (this.tanque * gasolina);
    }

    public float consumo(int km, int gasolina) {
        return km / (this.tanque * (gasolina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        // Con el siguiente código se compara si los dos objetos son iguales por referencia
        if (this == obj) {
            return true;
        }
        // con el siguiente código se compara si los objetos son de la misma instancia
        if (!(obj instanceof Clase01_01_Automovil)) {
            return false;
        }
        // TODO Auto-generated method stub
        Clase01_01_Automovil a = (Clase01_01_Automovil) obj;
        // Al comparar el objeto de la clase con uno sin atributos retornaría excepción por eso el siguiente código
        return (this.anio != null && this.color != null && this.anio.equals(a.anio) && this.color.equals(a.color));
    }

    
}
