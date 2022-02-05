
package com.mycompany.primeraevaluacion.newpackage;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz;
        int datos;
        // Se introduce el tamaño de dicha matriz
        System.out.println("Introduzca el tamaño de la matriz");
        datos = leer.nextInt();
        matriz = new int[datos][datos];
        // Se arma la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if(fila/2 == 0) {
                    matriz[fila][columna]=2;
                    
                    
                }
                else {
                matriz[fila][columna]=1;

                }
            }
            
            
        }
        // Se imprime la matriz
         for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                System.out.print( matriz[fila][columna]+"\t");
               
               
       
    }
             System.out.println();
    
            }
         }
    }

         
