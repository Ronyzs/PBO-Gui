/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;
import Praktikum.latihan4.TreeNode;
import static Praktikum.latihan4.createBinaryTree;

/**
 *
 * @author Ronyzs
 */
public class laithan4Aksi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        latihan4 op = new latihan4();

        System.out.println("Pilih menu : ");
        System.out.println("1. Quick Sort\n2. Binary Tree");
        System.out.print("Pilih : ");
        int menu = in.nextInt();

        if (menu == 1) {
            System.out.print("\nJumlah data   : ");
            int jmlData = in.nextInt();
            int[] data = new int[jmlData];

            for (int i = 0; i < jmlData; i++) {
                System.out.print("Data ke-" + (i + 1) + " : ");
                data[i] = in.nextInt();
            }
            op.cetak(data);
        }
        else if(menu==2)
        { 
            TreeNode rootNode = createBinaryTree();
            System.out.println("\nTampilan PreOrder Tree : ");
            op.preorder(rootNode);
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Tampilan PostOrder Tree :");
            op.postOrder(rootNode);
            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Tampilan InOrder Tree:");
            op.inOrder(rootNode);
            System.out.println();
        }
    }
}
