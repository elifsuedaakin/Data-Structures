
import java.util.*;

public class insertionsortornek {
    // Insertion sort algoritmasını Stack kullanarak gerçekleştiren fonksiyon
    static int[] Insertionsort_ex1(int a[], int size) {
        // Geçici olarak kullanılacak bir Stack oluşturuluyor
        Stack<Integer> s1 = new Stack<Integer>();
        
        // Dizi boyunca döngü başlatılıyor
        for (int i = 1; i < size; i++) {
            // Mevcut eleman bir önceki elemandan küçük mü diye kontrol ediliyor
            if (a[i] < a[i - 1]) {
                // İndis değişkeni ve geçici değişken tanımlanıyor
                int indis = i;
                int temp = a[i];
                
                // İndis, 0'dan büyük olduğu ve bir önceki elemandan büyük olduğu sürece devam eden bir döngü başlatılıyor
                while (indis > 0 && a[indis - 1] > temp) {
                    // Yığına bir önceki eleman ekleniyor ve indis azaltılıyor
                    s1.push(a[indis - 1]);
                    indis--;
                }
                
                // Mevcut elemanın uygun pozisyona yerleştirilmesi
                a[indis] = temp;
                indis++;
                
                // Yığındaki elemanlar, uygun konuma yerleştirilmek için döngü başlatılıyor
                while (!s1.empty()) {
                    a[indis] = s1.pop();
                    indis++;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // Sıralanacak dizi tanımlanıyor
        int dizi[] = {3, 2, 1, 5, 6, 4, 9, 7, 8};
        int n = dizi.length; // Dizinin boyutu
        
        // Dizi önce ekrana yazdırılıyor
        for (int ii = 0; ii < n; ii++) {
            System.out.print(dizi[ii] + " ");
        }
        
        // Insertion sort fonksiyonu çağrılıyor
        Insertionsort_ex1(dizi, n);
        
        System.out.println(); // Satır atlayarak ayrım yapılıyor
        
        // Sıralanmış dizi ekrana yazdırılıyor
        for (int ii = 0; ii < n; ii++) {
            System.out.print(dizi[ii] + " ");
        }
        System.out.println(); // Satır atlayarak ayrım yapılıyor
    }
}


