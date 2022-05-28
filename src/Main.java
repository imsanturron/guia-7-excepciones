import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* ej 1)
        Exception es padre de todas las excepciones, por lo tanto, el catch despues de ella
        no tiene sentido, ya que captara todas, y ademas es una mala practica
         */

        /* ej 2)
             abajo
         */
        Colegio col = new Colegio();
        System.out.println("essssssssss  " + col.prueba(1)); ///da siempre 3, xq??

        //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////PARTE 3/////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);
        int suerte = (int) (Math.random() * 500) + 1;
        int intentos = 0;
        int numeroUser = 0;

        System.out.println("bienvenido al juego de la suerte, introduce un numero entre 1 y 500");
        do {
            try {
                intentos++;
                numeroUser = scanner.nextInt();
                if (numeroUser > suerte)
                    System.out.println("el numero es menor! Ingresa otro...");
                else if (numeroUser < suerte)
                    System.out.println("el numero es mas grande! Ingresa otro...");
                else
                    System.out.println("--GANASTE!--   te tomo " + intentos + " intento/s");

            } catch (InputMismatchException e) {
                System.out.println("debiste ingresar un entero! ingresa nuevamente...");
                scanner.nextLine();///sino infinito catch
            }
        }
        while (numeroUser != suerte);

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////PARTE 4////////////////////////////////////////////////////

    }
}