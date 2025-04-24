
import java.util.Stack;
/**
 *
 * @author elifs
 */
public class hanoikulesi {

    
    public static void main(String[] args) {
        int diskSayisi = 3; // Disk sayısı
        
        // Üç iğne oluşturuluyor
        Stack<Integer> i1 = new Stack<>();
        Stack<Integer> i2 = new Stack<>();
        Stack<Integer> i3 = new Stack<>();
        
        // İlk iğneye diskler ekleniyor (en küçük disk en üstte olacak şekilde)
        for (int i = diskSayisi; i >= 1; i--) {
            i1.push(i);
        }
        
        // Hanoi kulelerinin çözümü için rekürsif metodu çağırıyoruz
        hanoi(diskSayisi, i1, i3, i2);
    }
    
    // Hanoi kulelerinin çözümü için yardımcı rekürsif metot
    public static void hanoi(int n, Stack<Integer> kaynak, Stack<Integer> hedef, Stack<Integer> ara) {
        if (n > 0) {
            // Önce ara iğneye diskleri taşıyoruz (kaynak -> ara)
            hanoi(n - 1, kaynak, ara, hedef);
            
            // Kaynaktan hedefe en üstteki diski taşıyoruz
            int disk = kaynak.pop();
            hedef.push(disk);
            System.out.println("Disk " + disk + " kaynaktan hedefe taşındı.");
            
            // Ardından ara iğneden hedefe diskleri taşıyoruz (ara -> hedef)
            hanoi(n - 1, ara, hedef, kaynak);
        }
    }
}