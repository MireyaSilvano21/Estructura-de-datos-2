public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort s = new BubbleSort();
        
        
        int[][] arr = { {5, 2, 3,9}, {4, 5, 6,1},{9,5,10,6},{3,8,6,2} };
        System.out.println("Arreglo antes de ordenar");

        for (int i = 0; i < arr.length; i++) { // Recorre las filas
       
        for (int j = 0; j < arr[i].length; j++) { // Recorre las columnas de la fila actual
        
        System.out.print(arr[i][j] + " ");
       }
      System.out.println(); // Nueva línea después de cada fila
     } 

        System.out.println("Arreglo ordenado por filas");
        for (int i = 0; i < arr.length; i++) { // Recorre las filas
            s.sort(arr[i]);
        
       }
       
        
    }
}
