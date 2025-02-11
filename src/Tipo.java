public enum Tipo {

    SEDAN("Sedán", "Automovil", 4),
    CAMIONETA("Camioneta", "Utilitario", 4),
    DEPORTIVO("Deportivo", "Auto de lujo", 2),
    CAMPERO("Campero", "Utilitario", 4),
    HATCHBACK("HatchBack", "Familiar", 4);

    private final String nombre;
    private final String descrip;
    private final int puertas;
    
    private Tipo(String nombre, String descrip, int puertas) {
        this.nombre = nombre;
        this.descrip = descrip;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombre + ", " + this.descrip + ", " + this.puertas + " puertas";
    }

    

}
