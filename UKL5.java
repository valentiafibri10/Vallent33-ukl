/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl5;

/**
 *
 * @author Valen
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class UKL5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> historyKomputer = new ArrayList<>();
        ArrayList<Integer> historyPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.println("PERMAINAN LEMPAR DADU");

        while (menangKomputer < 5 && menangPemain < 5) {

            System.out.print("\nTekan tombol apa saja untuk melempar dadu...");
            input.nextLine();

            int daduKomputer = rand.nextInt(6) + 1;
            int daduPemain = rand.nextInt(6) + 1;

            // simpan ke ArrayList
            historyKomputer.add(daduKomputer);
            historyPemain.add(daduPemain);

            System.out.println("Nilai dadu komputer : " + daduKomputer);
            System.out.println("Nilai dadu pemain   : " + daduPemain);

            // menentukan pemenang per ronde
            if (daduPemain > daduKomputer) {
                System.out.println("Pemain menang di ronde ini!");
                menangPemain++;
            } else if (daduKomputer > daduPemain) {
                System.out.println("Komputer menang di ronde ini!");
                menangKomputer++;
            } else {
                System.out.println("Seri!");
            }

            System.out.println("Skor sementara -> Pemain: " + menangPemain + " | Komputer: " + menangKomputer);
        }

        // Menampilkan hasil akhir permainan
        System.out.println("\n=== PERMAINAN SELESAI ===");

        if (menangPemain == 5) {
            System.out.println("Pemenangnya adalah PEMAIN!");
        } else {
            System.out.println("Pemenangnya adalah KOMPUTER!");
        }

        // Rekap lemparan
        System.out.println("\n--- Riwayat Lemparan Komputer ---");
        for (int i = 0; i < historyKomputer.size(); i++) {
            System.out.println("Ronde " + (i+1) + " : " + historyKomputer.get(i));
        }

        System.out.println("\n--- Riwayat Lemparan Pemain ---");
        for (int i = 0; i < historyPemain.size(); i++) {
            System.out.println("Ronde " + (i+1) + " : " + historyPemain.get(i));
        }

        System.out.println("\nTotal kemenangan komputer : " + menangKomputer);
        System.out.println("Total kemenangan pemain   : " + menangPemain);

        input.close();
    }
}
         
