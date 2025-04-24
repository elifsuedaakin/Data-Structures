
import java.util.Scanner;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    public void addNode(double data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;

        System.out.println("Vize Notları:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList vizeNotlari = new LinkedList();

        System.out.print("Kaç adet vize notu gireceksiniz? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Vize Notu " + i + ": ");
            double vizeNotu = scanner.nextDouble();
            vizeNotlari.addNode(vizeNotu);
        }

        vizeNotlari.displayList();
    }
}