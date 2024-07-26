/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cabiopalabras;

import java.util.Scanner;

/**
 *
 * @author cabal
 */
public class Cabiopalabras {

    public static void main(String[] args) {
        cambletra();
    }
    public static void cambletra(){
        Scanner palabra = new Scanner(System.in);
        System.out.println("Ingrese alguna a la cual le quiera cambiar palabras:");
        String pal = palabra.nextLine();  
        System.out.println("que letra quiere remplasar");
        String pa = palabra.nextLine();  
        System.out.println("por cual letra");
        String p = palabra.nextLine(); 
        
        System.out.println(pal.replace(pa,p));
        }
}
