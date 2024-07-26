/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        la();
    }

    public static void la() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("cual palabra cerres que es un palindromo ");
        String bra = scanner.nextLine();
        
        if (pal(bra)) {
            System.out.println(bra + " es un palindromo.");
        } else {
            System.out.println(bra + " no es un palindromo.");
        }
    }
    
    public static boolean pal(String bra) {
        int longitud = bra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (bra.charAt(i) != bra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
