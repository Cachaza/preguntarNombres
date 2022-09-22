import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dime tu Nombre y tu dia de nacimiento:");
        System.out.println("- Nombre: ");

        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("- Dia de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.println("Año de nacimiento: ");
        int ano = scanner.nextInt();
        System.out.println("Te llamas " + nombre + " y naciste el " + dia + "/" + mes + "/" + ano);

        

    }
}