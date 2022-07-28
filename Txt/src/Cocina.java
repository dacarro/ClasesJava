import java.io.FileNotFoundException;
import java.util.List;

public interface Cocina {
    void generaSalida(List<Ingrediente> ingredientes, List<Preparacion> preparaciones)
            throws FileNotFoundException;
}
