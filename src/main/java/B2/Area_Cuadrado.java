package B2;

import java.util.Scanner;

public class Area_Cuadrado {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int dato1 = 0;

        System.out.print("Ingresa el lado del cuadrado: ");
        dato1 = entrada.nextInt();

        System.out.println("El area del cuadrado es: " + (dato1 * dato1));
    }
}
