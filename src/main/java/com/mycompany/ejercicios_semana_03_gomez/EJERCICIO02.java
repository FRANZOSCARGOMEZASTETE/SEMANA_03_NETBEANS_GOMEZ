/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_semana_03_gomez;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO02 {

    public static void main(String[] args) {
        int[] numeros = new int [10];
        int pos = 0, neg = 0;
        int i;
        double sumaPos = 0, sumaNeg = 0;
        
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i< numeros.length; i++){
            if (numeros[i] > 0){ 
                sumaPos += numeros[i];
                pos++;
            }else if (numeros[i] < 0){
                sumaNeg +=numeros[i];
                neg++;
            }
        }
        
        if (pos !=0){
            System.out.println("Media de los valores positivos: "+ sumaPos / pos);
        }else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg !=0){
            System.out.println("Media de los valores negativos: "+ sumaNeg / neg);
        }else {
            System.out.println("No ha introducido numeros negativos");
        }
    }
}  

