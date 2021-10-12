/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class SortList {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

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

        SortList sList = new SortList();

        sList.head = new Node(2);
        Node sec = new Node(1);
        Node thr = new Node(5);

        sList.head.next = sec;
        sec.next = thr;

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
