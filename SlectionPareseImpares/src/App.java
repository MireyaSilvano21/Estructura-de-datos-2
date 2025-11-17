import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        SelectionSort sorting = new SelectionSort();

        Scanner sc = new Scanner(System.in);
       
        System.out.print("¡Cuantas numeros deseas ingresar?: ");
        int  num = sc.nextInt();
        int[]arr= new int[num];
        int[]par = new int[num];
        int[]impar = new int [num];
        int contPar = 0;
        int contImpar = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingresa el numero " + (i+1)+": ");
            
             arr[i] = sc.nextInt();
             if((arr[i] % 2)==0){
                par[contPar++] = arr[i];
            }else{
                impar[contImpar++] = arr[i];
            }
        }

        int[] pares = Arrays.copyOf(par, contPar);
        int [] impares =Arrays.copyOf(impar, contImpar);


        System.out.println("-----------Arreglo original---------------");
        sorting.sort(arr);
        System.out.println("-----------Arreglo Pares---------------");
        sorting.sort(pares);
        System.out.println("-----------Arreglo Impares---------------");
        sorting.sort(impares);
    }   
}
