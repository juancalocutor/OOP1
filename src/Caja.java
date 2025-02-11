public enum Caja {
    MECANICA("Mecánica"), AUTOMATICA("Automática"), ASISTIDA("Asistida"), PENTATONICA("Pentatónica");

    private final String caja;

    private Caja(String caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.caja;
    }

}
