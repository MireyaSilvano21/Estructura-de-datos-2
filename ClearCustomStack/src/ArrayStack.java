import java.util.Arrays;

public class ArrayStack <T> implements MyStack<T>{
    
    private Object[] data;
    private int top;

    public ArrayStack(){//Constructor 1, este invoca al constructor 2 pasandole un 10
        this(10);
    }
    public ArrayStack(int initialCapacity){//Constructor 2, inicializa el arreglo
        this.data = new Object[initialCapacity];
    }

    @Override
    public void push(T value) {
        //Top vale o
         this.data[top++] = value;
         //top vale top+1;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("No hay elementos en la stack");
            return null;
        }
        T value = (T) data[--top];//obteniendo el ultimo elemento de la stack
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia no puedes obtener ningun elemnto");
        }
        return(T) data[top];
    }

    @Override
    public boolean isEmpty() {
         return top == 0;

    }

    @Override
    public int size() {
       return top;
    }

    @Override
    public void clear() {
        for( int u = data.length-1; u>=0; u--){
            if (data[u] != null) {
                data[u] =  null;
            }
        }
        
    }

    public void addCpacity(){
        if (top == data.length) {//Si el arreglo esta lleno vamos aumentar la capacidad
            int newCap = data.length*2;
            //vamos a crear un nuevo arreglo y pasarle los datos que estan actualmente al nuevo arreglo
            data = Arrays.copyOf(data, newCap);
            
        }
    }
    @Override
    public void printStack() {
        
       for(int u = data.length-1;  u>=0; u --){
        if(data[u] != null){
            System.out.println(data[u]);
        }
            
    
       }
    }

    
}
