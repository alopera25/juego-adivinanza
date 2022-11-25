/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.juego2;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Juego2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0; // Es el número que hay que adivinar.
        int n1 = 0; // Variable para ver si se introduce número por pantalla o de forma aleatoria.
        int n2 = 0; // Número que introducimos por pantalla para adivinar el numero secreto.

        
        //Inicio del juego.
        System.out.println("Tienes 3 intentos para adivinar un número entre el 1 y el 9.");
        System.out.println("Si quieres elegirlo escribe '1'." + "\nSi quieres que se genere aleatoriamente escribe '2'.");
        n1 = teclado.nextInt();

        // Proceso para ver si introducimos un número por pantalla o de forma aleatoria.
        while (n1 > 2) {
            System.out.println("El número no es ni '1' ni '2'.");
            n1 = teclado.nextInt();
        }
        if (n1 == 1) {
            System.out.println("Introduce el numero del 1 al 9 que deseas adivinar:");
            numero = teclado.nextInt();
            while (numero <= 0 || numero >= 10) {
                System.out.println("No es una opción, introduce un número de 1 al 9.");
                numero = teclado.nextInt();
            }
        }
        if (n1 == 2) {
            System.out.println("El numero se ha generado de forma aleatoria.");
            numero = (int) (Math.random() * 9) + 1;
        }

        //System.out.println(numero); // Imprimimos el número para hacer pruebas.
        
        //Proceso de 3 intentos para adivinar el número.
        for (int i = 1; i < 5; i++) {
            System.out.println("\nEs el " + i + "º intento. Introduce un número:");
            n2 = teclado.nextInt();
            if (n2 == numero) {
                System.out.println("!Enhorabuena¡ Has ganado.");
                i = 4;
            } else if (i == 3) {
                System.out.println("Has perdido, el número secreto era " + numero + ".");
                i = 4;
            } else if (n2 <= 0 || n2 >= 10) {
                System.out.println("El " + n2 +" no es válido, por favor introduce un número del 1 al 9.");
            } else if (n2 < numero) {
                System.out.println("El número por adivinar es mayor.");
            } else if (n2 > numero) {
                System.out.println("El número por adivinar es menor.");
            }
        }
    }
}
