package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk melakukan perhitungan gaji dan tunjangan dari karyawan
 *
 */

public class Latihan35ProgramTunjangan {

    public static void main(String[] args) {
	    Karyawan karyawan = new Karyawan();
        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa gaji pokok Anda perbulan?\t: ");
        Scanner scanner = new Scanner(System.in);
        Karyawan.gaji = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Scanner scanner1 = new Scanner(System.in);
        karyawan.status = scanner1.next().toLowerCase();
        karyawan.hitungGaji();
    }
}
