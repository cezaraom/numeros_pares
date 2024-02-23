package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        int cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                cont++;
                System.out.print(vect[i] + " ");

            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", cont);

    }
}