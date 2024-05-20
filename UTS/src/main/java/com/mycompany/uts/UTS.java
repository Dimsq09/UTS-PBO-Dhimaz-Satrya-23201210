/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * @author Heri Prabowo
 */
import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println(" UTS 20 Mei 2024 ");
        System.out.println("yang dilakukan oleh DhimazSatrya");
        System.out.println(" Dengan NIM 23201210 ");
        System.out.println("=================================");

        System.out.println("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.println("=================================");

        System.out.println("Selamat Datang, " + getPanggilan(scanner) + " " + nama);
        System.out.println("Kalkulator");

        char lanjut = 0;
        do {
            System.out.println("Masukkan bilangan 1: ");
            double bil1 = scanner.nextDouble();

            System.out.println("Masukkan bilangan 2: ");
            double bil2 = scanner.nextDouble();

            boolean validOperator = false; // Tambahkan inisialisasi boolean
            do {
                System.out.println("Pilih operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                if (isValidOperator(operator)) {
                    double hasil = hitung(bil1, bil2, operator);
                    System.out.println("Hasil: " + hasil);
                    validOperator = true; // Operator valid, keluar dari loop
                } else {
                    System.out.println("Operator tidak valid. Pilih operator yang valid.");
                }
            } while (!validOperator); // Loop sampai operator yang valid dimasukkan

            System.out.println("Apakah Anda ingin melanjutkan (y/n)? ");
            lanjut = scanner.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }

    private static String getPanggilan(Scanner scanner) {
        System.out.println("Pilih jenis kelamin (1. Laki-laki / 2. Perempuan): ");
        int jenisKelamin = scanner.nextInt();
        scanner.nextLine();
        return (jenisKelamin == 1) ? "Mas" : "Mbak";
    }

    private static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    private static double hitung(double bil1, double bil2, char operator) {
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                hasil = bil1 / bil2;
                break;
        }
        return hasil;
    }
}