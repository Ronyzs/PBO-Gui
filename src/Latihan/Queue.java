/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class Queue {

    Mahasiswa head, tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void Enqueue() {
        Mahasiswa baru = new Mahasiswa();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void Dequeue() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Keluarkan Data Dengan Id : " + head.id);
            head = head.next;
        }
    }

    public void viewQueue() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            for (Mahasiswa a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }

    public void clearQueue() {
        head = null;
        tail = null;
        System.out.println("Antrian Dihapus");
    }

    public class Mahasiswa {

        int id;
        String nama, nim;
        Mahasiswa next;
        Scanner inputInt = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        public void input() {
            System.out.print("Masukkan ID : ");
            id = inputInt.nextInt();
            System.out.print("Masukkan Nama : ");
            nama = input.nextLine();
            next = null;
        }

        public void read() {
            System.out.println("ID = " + id + "\nNama = " + nama + "\n=======================");
        }
    }

    public static void main(String[] args) {
        int menu = 0;
        Queue que = new Queue();
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        int status = 0;
        while (status != 1) {
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Lihat data");
            System.out.println("4. Kosongkan data");
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
