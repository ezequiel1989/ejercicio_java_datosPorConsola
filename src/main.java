import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = escaner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = escaner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = escaner.nextInt();
        String vacio = escaner.nextLine(); // lo hago xq me toma el enter luego de edad como el siguiente string y me saltea hobbie
        System.out.println("Ingrese su hobbie preferido: ");
        String hobbie = escaner.nextLine();
        System.out.println("Ingrese su editor de código: ");
        String ide_preferido = escaner.nextLine();
        System.out.println("Ingrese el Sistema Operativo con que opera: ");
        String so = escaner.nextLine();

        System.out.println("Hola " + nombre + " " + apellido + " de " + edad + " años de edad. Su hobie es " + hobbie + " y codea con " + ide_preferido + " en SO " + so);

    }
}
