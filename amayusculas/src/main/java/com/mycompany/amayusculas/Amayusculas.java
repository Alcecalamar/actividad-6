/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amayusculas;

/**
 *
 * @author cabal
 */

import java.util.Scanner;
public class Amayusculas {
    public static void main(String[] args) {
        mayusculas();
    }
   public static void mayusculas(){
        Scanner palabra = new Scanner(System.in);
        System.out.println("Ingrese alguna palabra que usted guste para combretirla en mayusculoa:");
        String may = palabra.nextLine();
        while(!may.equals(" ")){
            
            System.out.println(may.toUpperCase());
            return;
            }
            
   }
            
}
    

