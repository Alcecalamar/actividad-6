/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numprimo;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Numprimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        
        if (esPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

