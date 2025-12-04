/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl4;

/**
 *
 * @author Valen
 */
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;
public class UKL4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan " + n + " bilangan:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        
        Map<Integer, Integer> frekuensi = new LinkedHashMap<>();

        for (int num : array) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        boolean adaDuplikat = false;

        System.out.println("\nBilangan duplikat dan jumlah kemunculannya:");

        for (Map.Entry<Integer, Integer> item : frekuensi.entrySet()) {
            if (item.getValue() > 1) {
                adaDuplikat = true;
                System.out.println(item.getKey() + " muncul " + item.getValue() + " kali");
            }
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada bilangan duplikat.");
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Tidak ada bilangan duplikat.");
        } else {
            System.out.print("Bilangan duplikat: ");
            for (int d : duplicates) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}
