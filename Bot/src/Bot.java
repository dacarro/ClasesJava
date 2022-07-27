import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int animo = 0;
        System.out.println("¿Cómo te llamas?");
        String n = scanner.nextLine();
        System.out.println(n);
        System.out.println("Hoy es " + LocalDate.now());
        System.out.println("¿Cómo te encuentras?");
        System.out.println("Pulsa 1 si estás triste, 2 si estás alegre o 3 si estás nervioso:");
        animo = scanner.nextInt();

        switch(animo){
            case 1: tellJoke();
                break;
            case 2: System.out.println("Enhorabuena");
                break;
            case 3: System.out.println("Don't worry, be happy");
                break;
        }
    }

    public static void tellJoke(){
        List<String> jokes = new ArrayList<>();
        jokes.add("¿Qué hace un músico en una habitación? Dar la nota");
        jokes.add("¿Por qué cruzó el pollo la carretera? Para llegar al otro lado");
        jokes.add("Hombre 1: Ayer el médico me dijo que me estoy quedando calvo. "
                + "Hombre 2: Vaya tío, qué calvario. "
                + "Hombre 1: No tiene gracia. "
                + "Hombre 2: Ya, ni un pelo.");
        int random = new Random().nextInt(jokes.size());
        String joke = jokes.get(random);
        System.out.println(joke);
    }
}
