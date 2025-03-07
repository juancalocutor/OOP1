public class Clase01_01_Automovil {

    // Aquí vienen los atributos del objeto como variables.
    // Pueden ser publicas, estáticas, privadas.
    private int id;
    private String marca, modelo, anio;
    private Clase01_01_AutomovilEnum color = Clase01_01_AutomovilEnum.GRIS;
    private Caja caja = Caja.ASISTIDA;
    private Tipo tipo;
    private static String colorPatente = "Naranja"; // la variable estática pertenece a la clase no al objeto ***
    private double cilindraje;
    private int tanque;
    private static int ultimoId; // Pertenece a la clase no al objeto y almacena el valor anterior del ID y lo
                                 // suma según el número de objetos de la misma instancia

    /*
     * Primero hicimos un Get y Set y al final se diseñó un constructor
     * la idea es que sean menos líneas de código
     */

    public Clase01_01_Automovil() {
        this.id = ++ultimoId;
    }

    // Para acceder desde la clase a la variable privada y estática se hace por un
    // Getter & Setter NO POR CONSTRUCTOR
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clase01_01_Automovil(String marca, String modelo, String anio, Tipo tipo, Clase01_01_AutomovilEnum color,
            double cilindraje, Caja caja, int tanque) {
        this();
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.color = color;
        this.caja = caja;
        this.cilindraje = cilindraje;
        this.tanque = tanque;
    }

    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Clase01_01_Automovil.colorPatente = colorPatente;
    }

    public String detalle() {
        return "Auto Id = " + this.id +
                "\nFabricante = " + this.marca + "\nModelo = " + this.modelo +
                "\nAño = " + this.anio +
                "\nTipo de auto = " + this.tipo +
                "\nColor Patente = " + Clase01_01_Automovil.colorPatente + // *** Se accede a la variable estática a
                                                                           // través de la clase
                "\nCilindraje = " + this.cilindraje +
                "\nCaja de cambios = " + this.caja +
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
        // Con el siguiente código se compara si los dos objetos son iguales por
        // referencia
        if (this == obj) {
            return true;
        }
        // con el siguiente código se compara si los objetos son de la misma instancia
        if (!(obj instanceof Clase01_01_Automovil)) {
            return false;
        }
        // TODO Auto-generated method stub
        Clase01_01_Automovil a = (Clase01_01_Automovil) obj;
        // Al comparar el objeto de la clase con uno sin atributos retornaría excepción
        // por eso el siguiente código
        return (this.anio != null && this.color != null && this.anio.equals(a.anio) && this.color.equals(a.color));
    }

}
