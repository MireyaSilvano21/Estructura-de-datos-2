
public class BubbleSort {

    public void sort(int [] arr){
        int n= arr.length;
        boolean swapped=false;
        for (int i = 0; i < n-1; i++) {
            
        //Recorrer hasta el penultimo
            swapped=false;
            for (int j = 0; j < n-1-i; j++) {
                if( arr[j] >  arr[j+1] ){
                    //Se realiza el intercambio
                    int temp =  arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                  
                    swapped=true;
                }
                 
            }

            if(!swapped){
                break;
            }
        }

        for (int s = 0; s < arr.length; s++) { // Recorre las filas
            System.out.print(arr[s]+" ");
       }
        System.out.println();

        
         
    }
    
}