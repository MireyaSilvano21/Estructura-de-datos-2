import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
         int[][] arregloEntrada = { 
            {1},           // impar -> agrega 0
            {6,3,1},       // impar -> agrega 0
            {1,2,3,4},     // par   -> agrega (1+4)=5
            {0,5,3,0},     // par   -> agrega (0+0)=0
            {2,5,9},       // impar -> agrega 0
            {2,4,8,9,10}   // impar -> agrega 0};
        };

        int arr2 [][] = new int[arregloEntrada.length][];

        for(int u = 0; u<arregloEntrada.length; u++){
            if (arregloEntrada[u].length%2 == 0 ) {
                arr2[u] = Arrays.copyOf(arregloEntrada[u], arregloEntrada[u].length+1);
               int  primero= arregloEntrada[u][0];
               int  ultimo = arregloEntrada[u][arregloEntrada[u].length-1];
               int suma = primero + ultimo;

               arr2[u][arr2[u].length-1] = suma;
            }else{
                arr2[u] = Arrays.copyOf(arregloEntrada[u], arregloEntrada[u].length+1);

            }
        }

        for(int u = 0; u<arr2.length; u++){
            
            for(int m = 0; m < arr2[u].length;m++){
                System.out.print(arr2[u][m]+",");

            }
            System.out.println();

        }
        

    }
}
