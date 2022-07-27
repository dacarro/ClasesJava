/*////////////////////////////////////////////////////////
             EJERCICIO DE AUTOS
////////////////////////////////////////////////////////
En la ciudad de Buenos Aires suceden muchos accidentes de transito, se realizo un estudio indicando
las marcas de autos mas propensas a participar de dichos accidentes, las cuales son las siguientes:
- Audi
- Alfa Romeo
- Ferrari
- Ford
Para cada una de estas marcas, se esta realizando un analisis que nos permita entender cuales son
los modelos que mas participaron.
Se nos pidio desarrollar un programa que almacene y muestre lo siguiente:
- De cada marca de autos, informar los modelos que participaron de los siniestros
- Informar tambien la velocidad maxima de cada uno de los modelos
DESARROLLAR un txt que muestre, ordenado alfabeticamente, las marcas y sus respectivos modelos y
sus velocidades maximas permitidas.
Almacenarlo en el branch de Desarrollo.
"Los modelos son los siguientes:"
..
..*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Auto {

    public static void main(String[] args) throws IOException {
        Car c1 = new Car("Audi","A1",270);
        Car c2 = new Car("Audi","A2",280);
        Car c3 = new Car("Audi","A3",290);
        Car c4 = new Car("Audi","A5",300);
        Car c5 = new Car("Audi","A8",310);
        Car c6 = new Car("Alfa Romeo","AA",300);
        Car c7 = new Car("Alfa Romeo","BB",310);
        Car c8 = new Car("Alfa Romeo","CC",300);
        Car c9 = new Car("Ferrari","Roja",450);
        Car c10 = new Car("Ford","Mustang",330);

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);
        PrintWriter printWriter = new PrintWriter("Marcas_y_modelos.txt");
        printWriter.println("En este txt se muestra información de coches implicados en siniestros");
        cars = cars.stream().sorted(Comparator.comparing(Car::getBrand)).collect(Collectors.toList());
        String lastBrand = cars.get(0).getBrand();
        printWriter.println("Marca " + lastBrand);
        for(Car car: cars){
            if(!car.getBrand().equals(lastBrand)){
                printWriter.println("Marca " + car.getBrand());
                lastBrand=car.getBrand();
            }
            printWriter.println("La velocidad máxima para el modelo " + car.getModel()
            + " es " + car.getSpeed());
        }
        printWriter.close();
    }
}
