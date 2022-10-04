/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana_03_gomez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO05 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int i;
        int sumDiagS = 0;
        int[][] matriz = new int[10][10];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                /* System.out.print("Ingrese el valor de celda [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt(); (esto se usa cuando importal "Scanner") */
                matriz[i][j] = rd.nextInt(99 - 10 + 1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Suma de Diagonal secundaria de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == (matriz.length - 1)) {
                    sumDiagS += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal secundaria es: " + sumDiagS);
        }
    }