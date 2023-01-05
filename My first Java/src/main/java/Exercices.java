import java.util.Scanner;

public class Exercices {
    public static void main(String args[]) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduce un adjetivo: "); // practica 
        String adjective = scanner.nextLine();
        System.out.println("Introduce un estacion: ");
        String season = scanner.nextLine();
        System.out.println("Cuantos cafes te has tomado? ");
        double cafe = scanner.nextDouble();

        System.out.println("On a "+adjective+" "+ season+" day, I drink a minimum of "+cafe+" cups of coffee");

        boolean font =true;
        System.out.println("Y la información es: "+font);

        int raton, gato;
        System.out.println("Introduce el numero de ratones: ");
        raton = scanner.nextInt();
        System.out.println("Introduce el numero de gatos: ");
        gato = scanner.nextInt();
        System.out.print("Restamos: ");
        System.out.println(raton-gato);
        System.out.print("Sumamos: ");
        System.out.println(raton+gato);
        System.out.print("Multiplicamos: ");
        System.out.println(raton*gato);
        System.out.print("Dividimos: ");
        System.out.println(raton/gato);


    }
}
