 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class UKL1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        int bilangan;
        System.out.println("Masukkan bilangan : ");
        bilangan = masukan.nextInt();
        
        boolean prima = true;
        
        if(bilangan < 0){//jika bilangan yang diinput user  adalah negatif
            System.out.println(bilangan + "ini bukan bilangan prima (bilangan negatif)");
            return;
        }
        
        if(bilangan > 10){//jika bilangan yang diinput user lebih dari 10 maka outputnya berupa "bilangan ini salah"
            System.out.println( bilangan + "input anda salah");
            return;
        }
        
        if(bilangan <2){
            prima = false;
        }else{
            for(int i = 2; i<= Math.sqrt(bilangan) ; i++){
                if(bilangan % i == 0){
                    prima = false;
                    break;
                }
            }
        }      
        if(prima){
            System.out.println(bilangan + "adalah bilangan prima");
        }else{
            System.out.println(bilangan + "bukan bilangan prima");
        }
    }
}
