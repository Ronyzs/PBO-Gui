
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ronyzs
 */
public class ASDOS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        String pass;
        System.out.println("Selamat Datang di Bank Angga");
        System.out.println("Silahkan login");
        System.out.print("Username : ");
        username = input.nextLine();
        System.out.print("Password : ");
        pass = input.nextLine();
        if (username.equalsIgnoreCase("akbar") && pass.equalsIgnoreCase("2011016310006")) {
            System.out.println("Login berhasil");
            int saldo = 100000;
            System.out.println("Pilih menu:");
            System.out.println("1. Cek saldo");
            System.out.println("2. Simpan uang");
            System.out.println("3. Ambil uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("Saldo anda: Rp." + saldo);
            } 
            else if (pilih == 2) {
                System.out.print("Simpan uang : Rp.");
                int simpan = input.nextInt();
                float total = saldo + simpan;
                System.out.println("Saldo anda: RP." + total);
            } 
            else if (pilih == 3) {
                System.out.print("Ambil uang : Rp.");
                int ambil = input.nextInt();

                if (saldo > ambil) {
                    float total = saldo - ambil;
                    System.out.println("Sisa saldo anda: Rp." + total);
                } 
                else {
                    System.out.print("Saldo anda tidak mencukupi");
                }
            } 
            else if (pilih == 4) {
              System.out.println("Terima Kasih");
            }
            else
                System.out.println("Harap perhatikan angka yang anda masukan!");
        } 
        else {
            System.out.println("Mohon maaf Username atau Password yang anda masukan salah!");
        }
    }

}
