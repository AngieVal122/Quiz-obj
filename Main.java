
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre");
        Scanner sc = new Scanner(System.in);
        String nombre= sc.nextLine();
        System.out.println("Ingrese la edad ");
        int anos = sc.nextInt();

        Animal perro = new Animal(nombre, anos);

        perro.mensaje();
    }
}
