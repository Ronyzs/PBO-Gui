/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class Mahasiswa {

    int id;
    String nama, nim;
    Mahasiswa next;
    static Scanner inputInt = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan ID : ");
        id = inputInt.nextInt();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        next = null;
    }

    public void read() {
        System.out.println("|| " + id + "    || " + nama + "        || " + nim + " \t||");
    }

    public static void main(String[] args) {
        int menu = 0;
        Queue que = new Queue();

        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int status = 0;

        while (status != 1) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View Queue");
            System.out.println("4. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Menu : ");
            int mn = input.nextInt();
            if (mn == 1) {
                que.Enqueue();
            } else if (mn == 2) {
                que.Dequeue();
            } else if (mn == 3) {
                que.viewQueue();
            } else if (mn == 4) {
                que.clearQueue();
            } else if (mn == 0) {
                status = 1;
            }
        }
    }
}
