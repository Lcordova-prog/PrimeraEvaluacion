
package com.mycompany.primeraevaluacion.newpackage4;

import java.util.Scanner;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese orden de la matriz");
        int n = leer.nextInt();
        
        
        //Proceso
       
          int[][] mat = new int[n][n];
        

        //Llenar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = i + j;
                System.out.print(mat [i][j] + "\t");
                
                
            }
            System.out.println();
            
        }
        // Imprime el triangulo inferior
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(mat [i][j] + "\t");
                
            }
            
            System.out.println("");
            
        }
        
 
        
        
    }
    
}
