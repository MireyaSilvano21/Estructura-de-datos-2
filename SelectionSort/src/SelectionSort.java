import java.util.Arrays;

public class SelectionSort {
    public void sort(int [] arr){
        int n = arr.length;
        int minIndex;
        for (int i = 0; i <n-1; i++) {//Recorremos el arreglo, evitando el desbordamiento
            minIndex = i; //Suponemos que ell minimo es el primero
            for (int j = i+1; j <n; j++) {
                if (arr[j] < arr [minIndex]) {
                    minIndex = j; //Seleccionamos el indice ddel elemento menor
                }
            }
            int temp = arr[minIndex]; //Guardamos el valor del minimo
            arr[minIndex]=arr[i]; //Intercambio, mandamos el valor del actual a la posicion 
            arr[i] = temp;//en la posicion actual, guarddamos el temporal
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }

}
