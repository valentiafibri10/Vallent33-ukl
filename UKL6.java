/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl6;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
public class UKL6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama Peminjam : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Judul Buku    : ");
        String judul = input.nextLine();

        System.out.print("Masukkan Kategori Buku (A/B/C): ");
        char kategori = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan Lama Peminjaman (hari): ");
        int lamaPinjam = input.nextInt();

        int tarifPerHari = 0;

        // Menentukan tarif berdasarkan kategori
        if (kategori == 'A') {
            tarifPerHari = 2000;
        } else if (kategori == 'B') {
            tarifPerHari = 1500;
        } else if (kategori == 'C') {
            tarifPerHari = 1000;
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }

        // Menghitung biaya awal
        int biayaAwal = tarifPerHari * lamaPinjam;

        // Menghitung denda
        int denda = 0;
        if (lamaPinjam > 7) {
            int hariTerlambat = lamaPinjam - 7;
            denda = hariTerlambat * 500;
        }

        // Total biaya akhir
        int totalBiaya = biayaAwal + denda;

        // Output
        System.out.println("STRUK PEMINJAMAN BUKU");
        System.out.println("Nama Peminjam           : " + nama);
        System.out.println("Judul Buku              : " + judul);
        System.out.println("Kategori Buku           : " + kategori);
        System.out.println("Lama Peminjaman         : " + lamaPinjam + " hari");
        System.out.println("Biaya Peminjaman Awal   : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan     : Rp " + denda);
        System.out.println("Total Biaya Akhir       : Rp " + totalBiaya);
    }
}

