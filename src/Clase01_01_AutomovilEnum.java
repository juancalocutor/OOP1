public enum Clase01_01_AutomovilEnum {
    // una clase Enum es como un listado de parametros conformado por constantes
    ROJO("Rojo"), NEGRO("Negro"), AZUL("Azul"), AMARILLO("Amarillo"), GRIS("Gris");

    private final String color;

    private Clase01_01_AutomovilEnum(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.color;
    }

}
