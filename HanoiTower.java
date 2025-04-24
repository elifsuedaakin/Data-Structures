
import java.util.Scanner;
import java.util.Stack;

public class HanoiTower {
// Bu metot, diskleri taşımak için kullanılır.
  public static void playStack(Stack A, Stack B) {
    int n1 = 0;
    int n2 = 0;
    
    if (!A.isEmpty()) { // Eğer ilk kule boş değilse
      for (Object i : A) {
        n1 = (int) i; // Taşınacak son elemanı bul.
      }

      for (Object i : B) {
        n2 = (int) i; // Karşılaştırmak için son elemanı bul.
      }
      if (n1 < n2 || B.isEmpty()) { // Taşınacak disk, hedef kuledeki diskten küçükse ya da hedef kule boşsa
        B.push(A.pop()); // Diski taşı.
        System.out.println("Disk " + n1 + " taşındı.");
      }
    }
  }

  public static void main(String[] args) {
    Stack X = new Stack();
    Stack Y = new Stack();
    Stack Z = new Stack();
    
    System.out.println("Disk sayısını giriniz:");
    Scanner scanner = new Scanner(System.in);
    int diskSayisi = scanner.nextInt();
    
    // X kulesine diskleri yerleştir.
    for (int i = diskSayisi; i >= 1; i--) {
      X.push(i);
    }

    // Seçeneklerin listesi
    String secenekler = "Kule Seçimi\n" +
                        "1) X'den Y'ye taşı\n" +
                        "2) Y'den X'e taşı\n" +
                        "3) X'den Z'ye taşı\n" +
                        "4) Z'den X'e taşı\n" +
                        "5) Y'den Z'ye taşı\n" +
                        "6) Z'den Y'ye taşı\n";
    System.out.println(secenekler);

    // Kulelerin durumunu yazdır.
    printKule(X, Y, Z);
    
    while (true) {
      System.out.println("Bir seçim yapın:");
      int secim = scanner.nextInt();
      
      // Seçime göre diskleri taşı ve kulelerin durumunu yazdır.
      if (secim == 1) {
        playStack(X, Y); // X'den Y'ye disk taşı
        printKule(X, Y, Z);
      } else if (secim == 2) {
        playStack(Y, X); // Y'den X'e disk taşı
        printKule(X, Y, Z);
      } else if (secim == 3) {
        playStack(X, Z); // X'den Z'ye disk taşı
        printKule(X, Y, Z);
      } else if (secim == 4) {
        playStack(Z, X); // Z'den X'e disk taşı
        printKule(X, Y, Z);
      } else if (secim == 5) {
        playStack(Y, Z); // Y'den Z'ye disk taşı
        printKule(X, Y, Z);
      } else if (secim == 6) {
        playStack(Z, Y); // Z'den Y'ye disk taşı
        printKule(X, Y, Z);
      } else {
        System.out.println("Geçersiz seçim, lütfen 1-6 arası bir değer giriniz.");
      }
    }
  }

  // Kulelerin durumunu yazdırmak için kullanılan metot.
  public static void printKule(Stack X, Stack Y, Stack Z) {
     
    System.out.print("Kule X: ");
    for (Object i : X) {
      System.out.print(i + ",");
    }
    System.out.print("\nKule Y: ");
    for (Object i : Y) {
      System.out.print(i + ",");
    }
    System.out.print("\nKule Z: ");
    for (Object i : Z) {
      System.out.print(i + ",");
    }
    System.out.println();
  }
}
   
   