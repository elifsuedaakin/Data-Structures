
import java.util.Scanner;
/**
 *
 * @author elifs
 */
public class stackHeap2 {

    /**
     * @param args the command line arguments
     */
 

	public static void main(String[] args) { // Line 1
		int i=1; // Line 2
		Object obj = new Object(); // Line 3
		stackHeap2 mem = new stackHeap2(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	private void foo(Object param) { // Line 6
		String str = param.toString(); //// Line 7
		System.out.println(str);
	} // Line 8



    }
    

/*  StackHeap2 sınıfı: Bu sınıf, main metodu ile birlikte gelir. Bu sınıf içinde bir nesnenin örneğini oluşturarak, foo metodu çağrılır ve bir nesne geçirilir.

main metodu: Programın giriş noktasıdır. İlk olarak, bir tamsayı (int i) ve bir nesne (Object obj) tanımlanır ve başlatılır. Ardından, StackHeap2 sınıfından bir nesne (mem) oluşturulur ve başlatılır. Son olarak, foo metodu obj nesnesi ile çağrılır.

foo metodu: Bu metot, bir nesne (param) alır. İlk olarak, param nesnesinin toString metodu çağrılarak bir dize elde edilir (String str). Daha sonra, bu dize ekrana yazdırılır.

Programın akışı şu şekilde gerçekleşir:

main metodu çağrıldığında, i adında bir tamsayı oluşturulur ve başlatılır. Ardından, obj adında bir Object nesnesi oluşturulur ve başlatılır. Daha sonra, StackHeap2 sınıfından bir nesne oluşturulur ve başlatılır (mem). Son olarak, foo metodu obj nesnesi ile çağrılır.
foo metodu çağrıldığında, param adında bir nesne alır. Bu nesnenin toString metodu çağrılarak bir dize elde edilir (str). Sonra, bu dize ekrana yazdırılır.
Programın çıktısı, obj nesnesinin toString metodu tarafından dönüştürülen dizedir. Eğer obj nesnesi varsayılan olarak oluşturulan bir Object nesnesi ise, çıktı java.lang.Object@<nesne kimliği> şeklinde olacaktır.



*/