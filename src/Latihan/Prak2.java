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
public class Prak2 {

    static void rekursif(String a, int b) {
        if (1 < b) {
            rekursif(a, b - 1);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kata              : ");
        String a = in.nextLine();
        System.out.print("Masukan jumlah rekursif   : ");
        int b = in.nextInt();
        rekursif(a, b);
    }
}
