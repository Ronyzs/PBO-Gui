/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Ronyzs
 */
public class kesehatanAksi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean x = true, y = true, regis = false;
        kesehatan asd = new kesehatan();

        do {
            System.out.println("\nMenu :");
            System.out.println("1. Registrasi Pasien\n2. Antrian\n3. Urutan Nama\n4. Urutan ID\n5. keluar");
            System.out.print("Pilih : ");
            int menu = in.nextInt();
            System.out.println("");

            do {
                if (menu == 1) {
                    if (regis == false) {
                        System.out.print("Masukan nama pasien : ");
                        String namaPasien = in.next();
                        asd.addNama(namaPasien);
                        System.out.print("Masukan ID : ");
                        int idPasien = in.nextInt();
                        asd.addID(idPasien);
                        System.out.print("Lanjutkan? [Y/N] : ");
                        String cons = in.next();
                        if (cons.equalsIgnoreCase("y")) {
                            regis = false;
                        } else {
                            x = false;
                            regis = true;
                        }
                    } else if (regis == true) {
                        System.out.println("\nAnda sudah registrasi!");
                    }
                } else if (menu == 2) {
                    if (asd.nama.size() > 0) {
                        System.out.print("\nMasukan nama pasien : ");
                        String namaAntrian = in.next();
                        asd.tampilkanAntrian(namaAntrian);
                        System.out.println("");
                    } else {
                        System.out.println("Belum resgitrasi");
                        x = false;
                    }
                } else if (menu == 3) {
                    if (asd.nama.size() > 0) {
                        asd.urutNama();
                        x = false;
                    } else {
                        System.out.println("Belum resgitrasi");
                        x = false;
                    }
                } else if (menu == 4) {
                    if (asd.nama.size() > 0) {
                        asd.urutID(asd.idPasien, 0, asd.idPasien.size() - 1);
                        asd.tampilkanID();
                    } else {
                        System.out.println("Belum resgitrasi");
                        x = false;
                    }
                } else if (menu == 5) {
                    x = false;
                    y = false;
                    System.out.println("SAMPAI JUMPA!");
                }
            } while (x);
        } while (y);
    }
}
