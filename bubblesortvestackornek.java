
import java.util.*;


public class bubblesortvestackornek {

    // Bubble Sort algoritması kullanarak sıralama ve çift-tek sayıları yığınlara ekleme işlemleri
    static void bubbleSort_ex1(int arr[], int n, Stack tek, Stack cift) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (arr[i] % 2 == 1) {
                tek.push(arr[i]); // Tek sayı ise "tek" yığına ekle
            } else {
                cift.push(arr[i]); // Çift sayı ise "çift" yığına ekle
            }
        }
    }

    public static void main(String[] args) {
        int dizi[] = {3, 2, 1, 5, 6, 4, 9, 7, 8};
        int n = dizi.length;

        // Diziyi ekrana yazdır
        for (int ii = 0; ii < n; ii++) {
            System.out.print(dizi[ii] + " ");
        }
        System.out.println("");

        // Çift ve tek sayıları tutacak iki adet Stack (yığın) oluştur
        Stack yigin_tek = new Stack();
        Stack yigin_cift = new Stack();

        // Bubble Sort'u ve çift-tek sayıları yığınlara ekleme işlemlerini uygula
        bubbleSort_ex1(dizi, n, yigin_tek, yigin_cift);

        // Tek sayıları ekrana yazdır
        System.out.println("Tek Sayılar");
        while (!yigin_tek.isEmpty()) {
            System.out.print(yigin_tek.pop() + " ");
        }

        System.out.println("");
        // Çift sayıları ekrana yazdır
        System.out.println("Çift Sayılar");
        while (!yigin_cift.isEmpty()) {
            System.out.print(yigin_cift.pop() + " ");
        }
    }
}

