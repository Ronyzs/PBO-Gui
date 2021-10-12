/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class Prak4 {

    public static void main(String[] args) {
        //Dengan ketentuan f(x)=x^2+4x-3;
        //a=1;b=2;
        Scanner input = new Scanner(System.in);
        float f1, f2, f3, a, b, c = 0, iterasi = 0;
        //Menginputkan nilai a;
        System.out.print("Nilai A : ");
        a = input.nextFloat();
        //Menginputkan nilai b;
        System.out.print("Nilai B : ");
        b = input.nextFloat();
        //Menginputkan jumlah iterasi
        System.out.print("Jumlah Iterasi yang Diinginkan : ");
        iterasi = input.nextFloat();
        //Melakukan iterasi
        for (int i = 0; i < iterasi; i++) {
            //f(a)
            f1 = (a * a) + (4 * a) - 3;
            System.out.println("f(" + a + ")= " + f1);
            //f(b)
            f2 = (b * b) + (4 * b) - 3;
            System.out.println("f(" + b + ")= " + f2);
            //Mencari nilai c
            c = (f2 * a) - (f1 * b) / (f2 - f1);
            //f(c)
            System.out.println("NIlai c = " + c);
            f3 = (c * c) + (4 * c) - 3;
            System.out.println("f(" + c + ")=" + f3 + "\n");
            if ((f1 * f3) < 0) {
                b = c;
            } else {
                a = c;
            }

        }

    }

}
