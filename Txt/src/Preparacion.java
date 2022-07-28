public class Preparacion {
    String plato;
    String dificultad;
    String tiempoElaboracion;
    String tiempoCoccion;
    String tiempoReposo;

    public Preparacion(String plato, String dificultad, String tiempoElaboracion,
            String tiempoCoccion, String tiempoReposo) {
        this.plato = plato;
        this.dificultad = dificultad;
        this.tiempoElaboracion = tiempoElaboracion;
        this.tiempoCoccion = tiempoCoccion;
        this.tiempoReposo = tiempoReposo;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getTiempoElaboracion() {
        return tiempoElaboracion;
    }

    public void setTiempoElaboracion(String tiempoElaboracion) {
        this.tiempoElaboracion = tiempoElaboracion;
    }

    public String getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(String tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getTiempoReposo() {
        return tiempoReposo;
    }

    public void setTiempoReposo(String tiempoReposo) {
        this.tiempoReposo = tiempoReposo;
    }
}
