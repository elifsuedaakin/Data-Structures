import java.io.*;
import java.util.Hashtable;

class JavaHashTable {
	public static void main(String args[])
	{	Hashtable<Integer, String> ht1 = new Hashtable<>();
		Hashtable<Integer, String> ht2= new Hashtable<Integer, String>();

		ht1.put(1, "bir");
		ht1.put(2, "iki");
		ht1.put(3, "uc");

		ht2.put(4, "dort");
		ht2.put(5, "bes");
		ht2.put(6, "alti");

		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
/*çıktısı : Mappings of ht1 : {3=uc, 2=iki, 1=bir}
Mappings of ht2 : {6=alti, 5=bes, 4=dort} */ 
//Not: Anahtarlar sırasız şekilde listelenebilir, çünkü Hashtable sıralı bir yapı değildir.