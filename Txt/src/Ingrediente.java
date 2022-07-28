public class Ingrediente {
    String nombre;
    double peso;

    public Ingrediente(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "nombre='" + nombre + '\'' + ", peso=" + peso + '}';
    }
}
