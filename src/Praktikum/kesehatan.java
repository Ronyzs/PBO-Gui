/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.ArrayList;

/**
 *
 * @author Ronyzs
 */
public class kesehatan {
//  inisialisasi ArrayList dah variable lainnya
    int antrian = 0;
    boolean x = false;
    String[] list; 
    ArrayList nama = new ArrayList();
    ArrayList namaUrut = new ArrayList();
    ArrayList idPasien = new ArrayList();

//  Menambakah element atau data pada ArrayList nama
    void addNama(String data) {
        nama.add(data);
        namaUrut.add(data);
    }
//  Menambakah element atau data pada ArrayList idPasien
    void addID(int data) {
        idPasien.add(data);
    }

    void tampilkanAntrian(String data) {
//      melakukan perulangan untuk mencari data yang sesuai dengan inputan
//      menggunakan Sequintial search;
        for (int i = 0; i < nama.size(); i++) {
            if (nama.get(i).equals(data)) {
                antrian = i + 1;
                x = true;
            }
//            jika antrian ditemukan maka akan melakukan proses dibawah
            if (x == true) {
                System.out.println("No. antrian pasien " + data + " adalah " + antrian);
            }
        }
    }

    //menggunakan algoritma BubbleSort
    public void urutNama() {
        Object temp;
        for (int j = 0; j < namaUrut.size(); j++) {
            for (int i = j + 1; i < namaUrut.size(); i++) {
                if (namaUrut.get(i).toString().compareTo(namaUrut.get(j).toString()) < 0) {
                    temp = namaUrut.get(j).toString();
                    namaUrut.set(j, namaUrut.get(i).toString());
                    namaUrut.set(i, temp);
                }
            }
            System.out.println("Urutan ke-" + (j + 1) + " dengan nama : " + namaUrut.get(j));
        }
    }

    //QuickSort
    public void urutID(ArrayList a, int idxDwn, int idxUp) {
        int i = idxDwn, j = idxUp, o;
        int pivot = (int) a.get(idxDwn);
        do {
            while ((int) a.get(i) < pivot) {
                i++;
            }
            while ((int) a.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                o = (int) a.get(i);
                a.set(i, a.get(j));
                a.set(j, o);
                i++;
                j--;
            }
        } while (i <= j);
        if (idxDwn < j) {
            urutID(a, idxDwn, j);
        }
        if (i < idxDwn) {
            urutID(a, i, idxDwn);
        }
    }
//  melakukan print element ArrayList idPasien

    void tampilkanID() {
        for (int i = 0; i < idPasien.size(); i++) {
            System.out.println("ID : " + idPasien.get(i) + " dengan Nama : " + nama.get(i));
        }
    }
//  melakukan print element ArrayList nama
    void tampilkanNama() {
        for (int i = 0; i < nama.size(); i++) {
            System.out.print(nama.get(i) + "  ");
        }
    }
}
