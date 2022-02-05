package com.mycompany.primeraevaluacion;

import java.util.Scanner;


public class Examen {
    
    
    

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
  
    
        int[][] matriz1 = new int [3][3];
        int[][] matriz2 = new int [3][3];
       int[][] matriz3 = new int [3][3];
       int [][] matrizresultante = new int [3][3];
      int [][] multiplicacion = new int [3][3];

       
        
       // Se llena la primera matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * 5);
            }
        }
        
        // Se llena la segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int)(Math.random()* 5);
            }
        }
         // Se llena la tercera matriz
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j] = (int)(Math.random()* 5);
            }
        }
        
        
        
        // Suma o resta de matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizresultante[i][j] = matriz1[i][j] + matriz2[i][j];
             
            }
        }
        
        // Se llena la tercera matriz
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matrizresultante.length; j++) {
         multiplicacion[i][j] = matrizresultante[i][j] * matriz3[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            // Se imprime la matriz1
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + matriz1 [i][j] + "]");
                
            }
            if (i == 1){
            System.out.print(" + ");
            }else{
                System.out.print("   ");
            }
            
            

            // Se imprime la matriz2
           
           

            for (int j = 0; j < matriz2.length; j++) {
                 System.out.print("[" + matriz2 [i][j] + "]");
                
            }
              if (i == 1){
            System.out.print(" = ");
            }else{
                System.out.print("   ");
            }
              // Matriz resultante
               for (int j = 0; j < matrizresultante.length; j++) {
                 System.out.print("[" + matrizresultante [i][j] + "]");
             }
                 if (i == 1){
            System.out.print(" * ");
            }else{
                System.out.print("   ");
            }

                // Matriz 3
               for (int j = 0; j < matriz3.length; j++) {
                 System.out.print("[" + matriz3 [i][j] + "]");
                
            }
                if (i == 1){
            System.out.print(" = ");
            }else{
                System.out.print("   ");
            }
                  for (int j = 0; j < multiplicacion.length; j++) {
                 System.out.print("[" + multiplicacion [i][j] + "]");
                
            }
                
               
               
            
            System.out.println("");
            
        }
        
        
    }
       
       
    }
    
     
    
   
    


    

