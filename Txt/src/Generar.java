import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Generar implements Cocina{

    public Generar() {
    }

    @Override
    public void generaSalida(List<Ingrediente> ingredientes, List<Preparacion> preparaciones)
            throws FileNotFoundException {
        PrintWriter printWriter1 = new PrintWriter("ingredientes.txt");
        PrintWriter printWriter2 = new PrintWriter("instrucciones.txt");
        printWriter1.println("Ingredientes de la receta: ");

        for(Ingrediente ingrediente: ingredientes){
            printWriter1.println("Ingrediente: " + ingrediente.getNombre() +
                    " Peso/Cuantía: " + ingrediente.getPeso());
        }

        printWriter2.println("Instrucciones receta:");

        for(Preparacion preparacion: preparaciones){
            printWriter2.println("Plato: " + preparacion.getPlato());
            printWriter2.println("Dificultad: " + preparacion.getDificultad());
            printWriter2.println("Tiempo de elaboración: " + preparacion.getTiempoElaboracion());
            printWriter2.println("Tiempo de cocción: " + preparacion.getTiempoCoccion());
            printWriter2.println("Tiempo de reposo: " + preparacion.getTiempoReposo());
        }
        printWriter1.close();
        printWriter2.close();
    }
}
