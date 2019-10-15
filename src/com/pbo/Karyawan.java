package com.pbo;

public class Karyawan {

    public static double gaji;
    public static double tunjangan;
    public static String status;

    public static double hitungTunjangan(String status, double gaji) {
        return (status.equals("menikah")) ? gaji * 35 / 100 : 0;
    }

    public static void hitungGaji() {
        tunjangan = hitungTunjangan(status, gaji);
        System.out.println("\n===== Hasil Perhitungan Gaji =====");
        System.out.println("Gaji Pokok\t\t: Rp " + gaji);
        System.out.println("Tunjangan\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + (gaji + tunjangan));
    }

}
