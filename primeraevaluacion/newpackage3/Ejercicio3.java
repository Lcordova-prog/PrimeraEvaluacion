
package com.mycompany.primeraevaluacion.newpackage3;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
       int[][] mat = {{0,0,0,0,},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             mat [i][i] = 1;   
                System.out.print(mat [i][j]);
            }
            System.out.println("");
            
           
        }
          System.out.print("La matriz si es identidad!!");   
            
    
        
        
   
   
       
    }
    
}

