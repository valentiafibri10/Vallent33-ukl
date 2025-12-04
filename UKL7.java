/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl7;

/**
 *
 * @author Valen
 */
import java.util.ArrayList;
import java.util.Scanner;
public class UKL7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> namaCookies = new ArrayList<>();
        ArrayList<Integer> totalBiaya = new ArrayList<>();
        ArrayList<Integer> totalPendapatan = new ArrayList<>();
        ArrayList<Integer> labaRugi = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        System.out.print("Masukkan jumlah jenis cookies: ");
        int jumlahJenis = input.nextInt();
        input.nextLine(); // buang newline

        int totalKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String namaLabaTertinggi = "";

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.println("\nCookies ke-" + (i + 1) + ":");
            
            System.out.print("Nama cookies: ");
            String nama = input.nextLine();
            namaCookies.add(nama);

            System.out.print("Harga produksi per bungkus: ");
            int hargaProduksi = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            int hargaJual = input.nextInt();

            System.out.print("Jumlah terjual: ");
            int jumlahTerjual = input.nextInt();
            input.nextLine(); // buang newline

            int biaya = hargaProduksi * jumlahTerjual;
            int pendapatan = hargaJual * jumlahTerjual;
            int hasil = pendapatan - biaya;

            totalBiaya.add(biaya);
            totalPendapatan.add(pendapatan);
            labaRugi.add(hasil);

            if (hasil > 0) status.add("Laba");
            else if (hasil < 0) status.add("Rugi");
            else status.add("Impas");

            totalKeseluruhan += hasil;

            if (hasil > labaTertinggi) {
                labaTertinggi = hasil;
                namaLabaTertinggi = nama;
            }
        }

        // OUTPUT
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.printf("%-15s | Rp%,d | Rp%,d | Rp%,d | %s\n",
                namaCookies.get(i),
                totalBiaya.get(i),
                totalPendapatan.get(i),
                labaRugi.get(i),
                status.get(i)
            );
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalKeseluruhan);
        System.out.printf("Cookies dengan Laba Tertinggi: %s (Rp%,d)\n", namaLabaTertinggi, labaTertinggi);
    }
}

