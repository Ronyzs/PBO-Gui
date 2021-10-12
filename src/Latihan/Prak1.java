/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Ronyzs
 */
public class Prak1 {

    private static void nama(String a) {
        System.out.println("Nama    : " + a);
    }

    void alamat(String a) {
        System.out.println("Alamat  : " + a);
    }

    void umur(int a) {
        System.out.println("Umur    : " + a);
    }

    public static void main(String[] args) {
        nama("Bagas Rony Hidayat");
        
        Prak1 as = new Prak1();
        as.alamat("Jln. Karang Anyar");
        as.umur(18);
    }
}
