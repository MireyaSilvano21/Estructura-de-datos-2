import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         BubbleSort sorting = new BubbleSort();

        Scanner sc = new Scanner(System.in);
       
        System.out.println("¡Cuantas calificaciones deseas ingresar?");
        int  num = sc.nextInt();
        int[]arr= new int[num];
       
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa la calificacion " + (i+1));
             arr[i] = sc.nextInt();
        }
        sorting.sort(arr);
        
    }
}
