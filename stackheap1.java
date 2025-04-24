/*
 * 
 */
import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class stackheap1 {
            public static void print(String s, Object o)
	{
            System.out.println(s);
            System.out.println(o);
	}	
	public static void main(String[] args)
	{
		int i = 5;
		String s = "str";
		Object o = new Object();
		print(s, o);
	}

}
/*print metodu: Bu metot, bir dize ve bir nesne alarak bunları ekrana yazdırmak için kullanılır.
İki parametre alır: bir dize (String s) ve bir nesne (Object o). 
İlk olarak, verilen dizeyi (s) ve nesneyi (o) ekrana yazdırır.

main metodu: Bu metot, programın giriş noktasıdır
. İlk olarak, bir tamsayı (int i), bir dize (String s),
ve bir nesne (Object o) tanımlar ve başlatır. Ardından,
print metodunu çağırarak bu dize ve nesneyi ekrana yazdırır.

Programın çıktısı aşağıdaki gibi olacaktır:
Burada, "str" dizesi, print metodu çağrılırken s parametresine geçirilen değeri temsil eder.
Ardından, Object sınıfından bir nesne oluşturulur ve bu nesne print metodu çağrılırken o parametresine geçirilir. 
Nesnenin çıktıda gösterilen java.lang.Object@<nesne kimliği> şeklindeki temsil ettiği değer,
nesnenin kimliğini (ID) ifade eder. Bu kimlik,
nesnenin bellekteki adresini temsil eder.*/
