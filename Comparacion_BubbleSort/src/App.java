import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort sorting = new BubbleSort();
        int [] arr = {11,1,2,3,4,5};
        System.out.println("Arreglo original");
        int[]orginal = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(orginal));
        sorting.sort(arr);

        int max = arr[0];
        int min = arr[arr.length-1];
        int diferencia = min -  max;
        System.out.println("Valor Maximo:"+ max);
        System.out.println("Valor Minimo:"+ min);
        System.out.println("Diferencia:"+diferencia);
    }
}
