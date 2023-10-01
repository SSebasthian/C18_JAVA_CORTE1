package B4;

import java.util.Scanner;
public class EjercicioB4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(entrada);
        int num1 = 0;
        int num2 = 0;
        int resultado;


        do{

            System.out.print("Ingresa el Primer Numero: ");
            num1 = entrada.nextInt();

            System.out.print("Ingresa el Segundo Numero: ");
            num2 = entrada.nextInt();

            try {
                resultado = (num1*num2);
                logger.log(Level.INFO, "Resultado de la multiplicación: " + resultado);

                if (resultado <= 100) {
                    logger.log(Level.INFO, "La multiplicación no supera 100. Ingresa números nuevamente.");
                }
            } catch (ArithmeticException e) {
                logger.log(Level.SEVERE, "Error: División por cero", e);
                resultado = 0;
            }




        }while (resultado <= 100);
    }

}
