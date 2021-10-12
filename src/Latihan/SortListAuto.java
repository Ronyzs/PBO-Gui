/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class SortListAuto {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        //node baru
        Node newNode = new Node(data);

        //memeriksa apakah list kosong
        if (head == null) {
            //jika list kosong maka node Head & Tail akan menuju ke node baru
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortList() {
        Node current = head, index;
        int temp;

        if (head == null) {
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void tampilkan() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SortListAuto sList = new SortListAuto();
        
        
        sList.head=new Node(2);
        Node sec = new Node(3);
        Node thr = new Node(1);
        //menambah data
//        sList.addNode(20);
//        sList.addNode(1);
//        sList.addNode(5);
//        sList.addNode(9);
//        sList.addNode(3);

        //menampilkan data yang di tambahkan
        System.out.println("list awal : ");
        sList.tampilkan();

        //Sorting list  
        sList.sortList();

        //menampilkan data yang telah di sorting 
        System.out.println("Sorted list: ");
        sList.tampilkan();
    }
}