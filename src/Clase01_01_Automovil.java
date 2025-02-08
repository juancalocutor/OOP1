public class Clase01_01_Automovil {

    String marca;
    String modelo;
    String anio;
    double cilindraje;
    String color;
    int tanque = 40;

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

    public float consumo (int km, float gasolina) {
        return km/(tanque * gasolina);
    }

    public float consumo (int km, int gasolina) {
        return km/(tanque * (gasolina / 100f));
    }
}
