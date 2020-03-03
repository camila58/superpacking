package cl.ufro.dci.proyecto20.modelo.numertion;

public enum Dia {
    LUNES("lunes"),MARTES("martes"),MIERCOLES("miercoles"),
    JUEVES("jueves"),VIERNES("viernes"),SABADO("sabado"),
    DOMINGO("domingo");
    private final String diaFinal;
    Dia(String diaFinal) {
        this.diaFinal=diaFinal;
    }

    public String getDiaFinal() {
        return diaFinal;
    }

}
