/*// Desarrollar un programa que genere N txts de salida conteniendo la siguiente
información:
// Un TXT que informe los ingredientes que son los siguientes:
//Arroz bomba
//1500 g
//Pollo de corral 1
//Conejo 0.5
//Judía verde plana 500 g
//Garrofó 500 g
//Alcachofa (opcional) 500 g
//Aceite de oliva virgen extra
//Pimentón dulce
//Tomate triturado
//Azafrán
//Romero fresco
//Sal
//Otro TXT que genere las instrucciones:
// Dificultad: Media
// Tiempo total 1 h 25 m
// Elaboración 10 m
// Cocción 1 h 15 m
// Reposo 5 m
// Estructura del programa:
// Una clase de Ingredientes
// Una clase de preparacion
// Una interfaz que implemente el metodo abstracto generaSalida
//Una vez generado el archivo txt subirlo a traves de la consola a nuestro repositorio remoto de GitHub
// Entregables:
// Captura del CMD (consola)
// LINK del Repositorio */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Txt{
    public static void main(String[] args) throws FileNotFoundException {
        List<Ingrediente> ingredientes = new ArrayList<>();
        List<Preparacion> preparaciones = new ArrayList<>();

        ingredientes.add(new Ingrediente("Arroz bomba",1500));
        ingredientes.add(new Ingrediente("Pollo",1));
        ingredientes.add(new Ingrediente("Conejo",0.5));
        ingredientes.add(new Ingrediente("Judía verde plana",500));
        ingredientes.add(new Ingrediente("Garrofó",500));
        ingredientes.add(new Ingrediente("Alcachofa (opcional)",500));
        ingredientes.add(new Ingrediente("Aceite de oliva virgen extra",1));
        ingredientes.add(new Ingrediente("Pimentón dulce",1));
        ingredientes.add(new Ingrediente("Tomate triturado",1));
        ingredientes.add(new Ingrediente("Azafrán",1));
        ingredientes.add(new Ingrediente("Romero fresco",1));
        ingredientes.add(new Ingrediente("Sal",1));

        preparaciones.add(new Preparacion("Paella","Media","10 min",
                "1 h 15 min",
                "5 min"));

        Generar generar = new Generar();
        generar.generaSalida(ingredientes, preparaciones);
    }
}
