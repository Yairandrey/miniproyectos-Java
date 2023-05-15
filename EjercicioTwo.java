package EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioTwo {
    //planilla de inscripcion con identificacion de categoria
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**************Inscripciones********************");
        String dni, nombre;
        int edad;
        do {
            System.out.print("Ingresa dni: ");
            dni = sc.next();
            System.out.print("Ingresa nombre: ");
            nombre = sc.next();
            if (!dni.equals("0") && !nombre.equals("fin")) {
                System.out.print("Ingresa edad: ");
                edad = sc.nextInt();
                if (edad < 6) {
                    System.out.println("No se permiten menores de 6 años");
                } else if (edad >= 6 && edad <= 10) {
                    System.out.println("Categoria MENORES A");
                } else if (edad >= 11 && edad <= 17) {
                    System.out.println("Categoria MENORES B");
                } else if (edad >= 18 && edad <= 30) {
                    System.out.println("Categoria JUVENILES");
                } else if (edad >= 31 && edad <= 50) {
                    System.out.println("Categoria ADULTOS");
                } else {
                    System.out.println("Categoria ADULTOS MAYORES");
                }
            }
             if (!dni.equals("0") && !nombre.equals("fin")){
                 System.out.println("Para salir marca din:0 y/o nombre:fin");
             }

        } while (!dni.equals("0") && !nombre.equals("fin"));
    }

}
