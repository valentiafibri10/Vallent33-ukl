/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno2;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class UKLNO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] pecahan = {100000,50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
        
        System.out.print("Masukkan jumlah uang : ");
        int jumlah = input.nextInt();
        
        for (int p : pecahan){
            int banyak = jumlah / p;
            if(banyak > 0){
                if(p>= 1000){
                    System.out.println(banyak + " lembar " + p);
                }else{
                    System.out.println(banyak + " koin " + p);
                }
            }
            jumlah = jumlah % p;
        }
    }
}
