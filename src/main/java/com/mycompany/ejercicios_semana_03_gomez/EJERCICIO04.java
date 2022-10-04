/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana_03_gomez;

import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO04 {

public static void main(String[] args) {
        int [] [] matriz = new int [7][7];
        int f;
         matriz [0][0] = matriz[1][1] = matriz[2][2] = matriz[3][3] = matriz[4][4] = matriz[5][5] = matriz[6][6] = 1;
                 for (f=0 ; f<matriz.length; f++){
                     matriz[f][f]=1;
                 }
                 for (f=0 ; f<matriz.length ; f++){
                     System.out.println(Arrays.toString(matriz[f]));
                 }
    }
}