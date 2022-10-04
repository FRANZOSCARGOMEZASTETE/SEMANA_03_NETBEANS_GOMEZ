/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios_semana_03_gomez;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO03 {

public static void main(String[] args) {
        int[][] num = new int[3][3];
        Scanner numero = new Scanner (System.in);
        System.out.println("Ingrese los numeros: ");
        for (int i = 0; i<num.length; i++){
            for(int j = 0; j<num.length; j++){
                num[i][i]=numero.nextInt();
            }
        }
        System.out.println("Imprimiendo Tabla");
        for (int i = 0; i<num.length; i++){
            System.out.println();
        
            for(int j = 0; j<num.length; j++){
                System.out.print(num[i][j]+"");
            }
            }
    
    System.out.println("nSuma Fila");
    int suma=0;
    for (int i = 0; i<num.length; i++){
            for(int j = 0; j<num.length; j++){
                suma += num[i][j];
            }
            System.out.println("Columna" + i+ " = " + suma);
            suma=0;
            }
}
}