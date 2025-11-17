import java.util.Arrays;

public class InsertionSort {
    
    public void sort(double [] arr){
        int n = arr.length;
        for (int u = 1; u < n; u++) {//Comenzamos desde el segundo elemento
            double key = arr[u];//Elemento que vamo a insertar en la parte ordenada
            int s = u -1;
            while (s >= 0 && arr[s] > key) { //Recorrer la parte ordenada e insertar key en su posicion
               arr[s+1] = arr[s];
               s--;
            }
            arr[s+1] = key; //Inserción del elemento key dentro de la posicion indicada de la parte ordenada
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}
