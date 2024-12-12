
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Coche> coches = new LinkedList<>();
        System.out.println("¿Cuantas coches quieres que crear?");
        int iteraciones = 0;

        iteraciones = sc.nextInt();

        Coche coche = null;

        for (int i = 0; i < iteraciones; i++) {
            System.out.println("Ingrese el nombre del coche: ("+ (i+1) + ")");
            coche = new Coche(sc.next());
            coches.add(coche);
        }

        for(Coche c : coches) {
            c.start();
        }

    }


}