import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Dime tu nombre y Edad:");
        System.out.println("- Nombre: ");

        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("- Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " anyos.");
        

    }
}