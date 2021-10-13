/**
 * Java.Homework3
 *
 * @author Egor
 * version 13.10.2021
 */
public class Lesson3 {
	
    public static void one () {
		int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(" ");
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }
	
	public static void two () {
	    int[] array = new int[100];
        int j = 1;
        int fill = array.length;
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < fill; ++i, j = j + 1) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }
	}
	
	public static void three () {
		int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
                for(int i = 0; i < maxMas; i++) {
                    if (mas[i] < 6) mas[i] = mas[i] * 2;
                }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
			System.out.println(" ");
        }
	}
	
	public static void four () {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
            for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                if (i == p) {matrix[i][p] = 1;
                }
                    System.out.print(matrix[i][p] + " ");
                    System.out.println();
                }
             }
    }    
		  
    public static void five (int len, int initialValue) {
	    int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
            }
	}
}
