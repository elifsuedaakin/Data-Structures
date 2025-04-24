import java.util.Scanner;

/**
 *
 * @author elifs
 */
public class quicksort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi gireceksiniz? ");
        int n = input.nextInt();

        int[] A = new int[n];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        quickSort(A, 0, n - 1);

        System.out.println("Sıralanmış dizi:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    // Quicksort algoritması
    static void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(A, low, high);
            quickSort(A, low, pivotIndex - 1);  // Sol tarafı sırala
            quickSort(A, pivotIndex + 1, high); // Sağ tarafı sırala
        }
    }

    // Pivot'u yerine yerleştirme ve diziyi ayırma işlemi
    static int partition(int[] A, int low, int high) {
        int pivot = A[high]; // Son elemanı pivot seç
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                // swap A[i] and A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        // Pivot'u yerine koy
        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;

        return i + 1; // Pivot'un doğru yeri
    }
}
