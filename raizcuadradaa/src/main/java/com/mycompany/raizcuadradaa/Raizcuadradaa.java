/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizcuadradaa;

import java.util.Scanner;

/**
 *
 * @author cabal
 */
public class Raizcuadradaa {

    public static void main(String[] args) {
        rzcuadrada();
    }
    public static void rzcuadrada(){
    Scanner raiz = new Scanner(System.in);
    System.out.println("cual es el numero al cual le quieres sacar raiz cuadrada");
    double cuadrada = raiz.nextDouble();
    System.out.println(Math.sqrt(cuadrada));
    }
}
