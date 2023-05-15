
package EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioThree {

    //Arbol de navidad con asteriscos y con tronco usando bucles (for)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa altura del arbol: ");
        int altura = sc.nextInt();
       mostrarAsteriscos(altura);
    }
    
    public static void mostrarAsteriscos(int altura){ //altura
        for (int i = 0; i <altura; i++) {
            // espacios vacios
            for (int j = 0; j < (altura-i)-1; j++) {
                System.out.print(" ");
            }
            //los asteriscos
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        int largoTronco=altura-(altura/2);
        for (int i = 0; i < largoTronco; i++) {
            //espacios en blanco
            for (int j = 0; j < altura-2; j++) {
                System.out.print(" ");
            }
            //barras
            for (int j = 0; j < 3; j++) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    
}
