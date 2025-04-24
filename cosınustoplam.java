
import java.util.*;
/**
 *
 * @author elifs
 */
public class cosınustoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        double x = 2.0; // x değerini istediğiniz bir sayıyla değiştirebilirsiniz
        int n = 10; // Seriyi kaç terime kadar hesaplamak istediğinizi belirleyebilirsiniz

        double result = calculateSeries(x, n);
        System.out.println("e^" + x + " = " + result);
    }

    public static double calculateSeries(double x, int n) {
        double sum = 1.0; // Başlangıç değeri, k=0 terimi

        for (int k = 1; k <= n; k++) {
            double term = Math.pow(-1, k) * Math.pow(x, 2 * k) / factorial(2 * k);
            sum += term;
        }

        return sum;
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
    
    

