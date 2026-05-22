

import java.util.Scanner;

public class CompararDosNúmeros  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {

            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);

        } else if (num2 > num1) {

            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);

        } else {

            System.out.println("Ambos números son iguales");

        }

    }
}