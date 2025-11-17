import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
         InsertionSort sorting = new InsertionSort();

        double [] arr = {1.0,8.2, 30.1, 21.0, 15.7, 32.4,6.6};
        double[]orginal = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(orginal));
        sorting.sort(arr);

        double minTemp = arr[0];
        double maxTemp = arr[arr.length - 1];
        double rango = maxTemp - minTemp;

        System.out.printf("Temperatura Mínima: %.2f\n", minTemp);
        System.out.printf("Temperatura Máxima: %.2f\n", maxTemp);
        System.out.printf("Rango (Máxima - Mínima): %.2f\n", rango);

        

        System.out.print("Las 3 temperaturas más altas: ");
        if (arr.length >= 3) {
            for (int i = arr.length - 1; i >= arr.length - 3; i--) {
                System.out.print(arr[i]);
                if (i > arr.length - 3) {
                    System.out.print(", ");
                }
            }
        } 
        System.out.println();
        
    
        System.out.print("Las 3 temperaturas más bajas: ");
        if (arr.length >= 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(arr[i]);
                if (i < 2) {
                    System.out.print(", ");
                }
            }
        }
    }
}
