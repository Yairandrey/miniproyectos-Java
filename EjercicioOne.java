package EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioOne {

    //EL ejercicip consiste en pedir una palabra hasta que se digite "Salir"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        do {
            System.out.print("Ingresa palabra: ");
            palabra = sc.next();
        } while (!palabra.equalsIgnoreCase("salir"));

    }

}
