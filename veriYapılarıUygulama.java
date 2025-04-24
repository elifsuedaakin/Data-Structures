import java.util.Scanner;
import java.util.*;
   // Basit Binary Tree Node sınıfı
class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}
 
public class veriYapılarıUygulama {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Binary Search Testi
        int[] A = {2, 4, 6, 8, 10, 12, 14};
        int index = binarySearch(A, A.length, 10);
        System.out.println("Binary Search sonucu: " + index); // 4

        // Binary Tree Arama Testi
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);

        Node bulunan = agacAra(root, 10);
        if (bulunan != null) {
            System.out.println("Ağaçta bulunan düğüm: " + bulunan.value);
        } else {
            System.out.println("Ağaçta bulunamadı.");
        }
    }

    // Binary Search fonksiyonu
    static int binarySearch(int[] A, int n, int sayi) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int orta = (left + right) / 2;
            if (A[orta] == sayi) {
                return orta;
            } else if (sayi < A[orta]) {
                right = orta - 1;
            } else {
                left = orta + 1;
            }
        }
        return -1;
    }

    // Ağaçta arama fonksiyonu
    static Node agacAra(Node kok, int deger) {
        while (kok != null) {
            if (deger == kok.value) {
                return kok;
            } else if (deger < kok.value) {
                kok = kok.left;
            } else {
                kok = kok.right;
            }
        }
        return null;
    }
}

