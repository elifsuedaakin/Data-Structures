import java.util.*;
import java.util.Hashtable;
public class Hastable2 {
    public static void main(String[] args)
	{
		Hashtable<String, Integer> ht = new Hashtable<>();
                
		ht.put("mehmet", 10);
		ht.put("hasan", 30);
		ht.put("ahmet", 20);

		System.out.println("Size of map is: " + ht.size());
		System.out.println(ht);

		if (ht.containsKey("hasan")){//containsKey("hasan"): Tablo içerisinde "hasan" anahtarı olup olmadığını kontrol eder.Eğer "hasan" anahtarı varsa, blok çalışır.
			Integer a = ht.get("hasan");
			System.out.println("value for key"+ " \"hasan\" is: " + a);
		}
	}
} //Not: Anahtarlar sırasız şekilde listelenebilir, çünkü Hashtable sıralı bir yapı değildir.
