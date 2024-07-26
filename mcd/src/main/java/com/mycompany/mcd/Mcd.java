/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mcd;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class Mcd{
    // Método para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    public static int cd(int a, int b) {
        while (b != 0) {
            int comun = b;
            b = a%b;
            a = comun;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);        
        System.out.print("dame un numero para sacarle el mcd ");
        int mac1 = a.nextInt();
        System.out.print("dame otro numero ");
        int mcd2 = a.nextInt();
        int m = cd(mac1, mcd2);
        System.out.println("dl maximo comun divisor de los numeros es " + m);
    }
}
