/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Ronyzs
 */
public class latihan4 {

    public static void quickSort(int a[], int idxDwn, int idxUp) {
        int i = idxDwn, j = idxUp, x;
        int pivot = a[idxDwn];
        do {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                x = a[i];
                a[i] = a[j];
                a[j] = x;//tukar
                i++;
                j--;
            }
        } while (i <= j);
        if (idxDwn < j) {
            quickSort(a, idxDwn, j);
        }
        if (i < idxDwn) {
            quickSort(a, i, idxDwn);
        }
    }

    public static void cetak(int a[]) {
//        int tabInt[] = a;
        int i;
        System.out.println("\nSebelum Diurutkan : ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        quickSort(a, 0, a.length - 1);
        System.out.println("Sesudah Diurutkan : ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(char data) {
            this.data = data;
        }
    }
    public static TreeNode createBinaryTree() {
        TreeNode rootNode = new TreeNode('A');
        TreeNode nodeB = new TreeNode('B');
        TreeNode nodeC = new TreeNode('C');
        TreeNode nodeD = new TreeNode('D');
        TreeNode nodeE = new TreeNode('E');
        TreeNode nodeF = new TreeNode('F');
        TreeNode nodeG = new TreeNode('G');
        TreeNode nodeH = new TreeNode('H');
        TreeNode nodeI = new TreeNode('I');
        TreeNode nodeJ = new TreeNode('J');

        rootNode.left = nodeB;
        rootNode.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.left = nodeF;
        nodeD.left = nodeG;
        nodeD.right = nodeH;
        nodeE.left = nodeI;
        nodeF.right = nodeJ;
        return rootNode;
    }
    
    // Recursive Solution
    public void preorder(TreeNode root) {
        if (root != null) {
            //Visit the node-Printing the node data  
            System.out.printf("%c ", root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Recursive Solution
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            //Visit the node by Printing the node data  
            System.out.printf("%c ", root.data);
        }
    }

    // Recursive Solution
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            //Visit the node by Printing the node data  
            System.out.printf("%c ", root.data);
            inOrder(root.right);
        }
    }


}
