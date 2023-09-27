package B3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_Clase_Arreglo {
    public static void main(String args[]) {

        String nombre = "";
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Por favor ingresa el primer nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Hola "+ nombre);
        }

    }

}
