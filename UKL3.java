/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
import java.util.Random;
public class UKL3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        while(true){
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(9) + 1;
            
            System.out.println("anda mau kuis memakai operator apa ? ");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Modulus");
            System.out.println("4. Pengurangan");
            System.out.println("Pilihan (1-4) : ");
            int pilihan = input.nextInt();
            
            String op = "";
            int hasilBenar = 0;
            
            switch (pilihan){
                case 1 : 
                    op = "*";
                    hasilBenar = a*b;
                    break;
                case 2: 
                    op = "/";
                    hasilBenar = a/b;
                    break;
                case 3:
                    op = "%";
                    hasilBenar =  a%b;
                    break;
                case 4:
                    op = "-";
                    hasilBenar = a-b;
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Ketik : Perkalian // Pembagian // Modulus");
                    continue;
            }
            
            System.out.print(a + " " + op + " " + b + " = ");
            int jawabanUser = input.nextInt();
            
            if (jawabanUser == hasilBenar){
                System.out.println("Jawaban anda benar");
            }else{
                System.out.println("Jawaban anda salah");
            }
            
            System.out.println("Hasil yang benar adalah : " + hasilBenar);
            
            char lanjut;
            System.out.print("Lanjut kuis? (y/n): ");
            lanjut = input.next().charAt(0);
            
            if (lanjut == 'n' || lanjut == 'N'){
                System.out.println("Kuis selesai. Terima kasih!");
                break;
            }
            System.out.println("----------------------------------");
        }
    }
}
