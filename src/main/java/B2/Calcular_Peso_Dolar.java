package B2;

import java.util.Scanner;
public class Calcular_Peso_Dolar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num = 0F;
        float dolar = 4020F;

        System.out.print("Ingresa la cantidad de Dolares que tienes: ");
        num = entrada.nextFloat();

        System.out.println("La cantidad del Dolar Hoy es de: " + dolar);
        System.out.println("Realizando la conversion a Pesos es: "+( dolar * num));
    }
}
