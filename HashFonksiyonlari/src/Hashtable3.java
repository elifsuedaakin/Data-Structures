import java.util.*;
import java.util.Hashtable;
public class Hashtable3 {
    public static void main(String [] args){ 
    Hashtable<Integer,LinkedList<String>> ht = new Hashtable<>();
                Scanner input = new Scanner(System.in);
                
                System.out.print("Key giriniz (Çıkmak için -1): ");
                int key = input.nextInt();
                
                while (key!=-1) {
                    System.out.print("Value giriniz: ");
                    String value = input.next();
                    if (ht.containsKey(key)){//Bu, Hashtable'da belirtilen key (anahtar) değerinin zaten var olup olmadığını kontrol eder. Eğer key mevcutsa, true döner; değilse false.
                        ht.get(key).addFirst(value);//Bu, belirtilen key ile ilişkili olan LinkedList<String>'i döner.ve o linkedlistin başına value(deger)ekler 
                    }
                    else{//Eğer belirtilen key (anahtar) daha önce Hashtable içinde yoksa 
                        LinkedList<String> link1=new LinkedList<>();//yeni bir LinkedList oluşturuluyor ve bu key için Hashtable'a ekleniyor.
                        link1.addFirst(value);// Yeni oluşturulan listeye, başa 'value' ekleniyor.
                        ht.put(key,link1);// 'key' ve liste, Hashtable'a ekleniyor.
                    }
                    
                    System.out.print("Key giriniz (Çıkmak için -1): ");
                    key = input.nextInt();
            }
                input.close(); 
                System.out.println("Size of map is: " + ht.size());
		System.out.println(ht);
} 
} 