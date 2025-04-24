/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author elifs
 */
public class binarytree_example {


    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    static void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    static Node Agac_Ara(Node kok, int deger) {
        int toplam = 0; // Toplamı saklamak için bir değişken

        while (kok != null) {
            if (deger == kok.value) {
                System.out.println("Toplam geçilen elemanlar: " + toplam);
                return kok;
            } else if (deger < kok.value) {
                kok = kok.left;
                System.out.print("sol-");
            } else {
                kok = kok.right;
                System.out.print("sag-");
            }

            // Her adımda geçilen elemanın değerini toplama ekleyin
            toplam += kok.value;
        }

        System.out.println("Toplam geçilen elemanlar: " + toplam);
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(35);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);

        insert(root, 28);
        insert(root, 43);
        insert(root, 14);
        insert(root, 38);
        insert(root, 55);
        insert(root, 17);
        insert(root, 36);
        insert(root, 40);

        int aranan = 40;
        Node sonuc = Agac_Ara(root, aranan);

        if (sonuc != null)
            System.out.println("Aranan deger bulundu=" + sonuc.value);
        else
            System.out.println("Aranan bulunamadi");
    }
}

