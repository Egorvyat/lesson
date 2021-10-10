/**
 * Java.Homework2
 *
 * @author Egor
 * version 10.10.2021
 */
public class lesson2 {
    public static void main(String[] args) {
		summa (33, 6);
		dz2 (100);
		dz3 (10);
		dz4 ("egor student", 5);
    }	
	    static boolean summa(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
        }
        static void dz2 (int a) {
        if (a >= 0) System.out.println("plus");
        else System.out.println("minus");
        }
	    static boolean dz3(int a) {
        if (a < 0) return true;
        return false;
        }
	    static void dz4 (String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println ("[" + i + "]" + " " + str);
        }
    }
}
