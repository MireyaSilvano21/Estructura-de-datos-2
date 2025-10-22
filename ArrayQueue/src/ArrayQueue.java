import java.lang.reflect.Array;

public class ArrayQueue <T> implements IQueue <T> {

    private Object [] data;
    private int front; //Primero en la fila
    private int rear; // para saber en que posicion va el siguiente dato
    private int size; //tamaño de la queue

    

   public  ArrayQueue(){
    this(10);
   }

   public ArrayQueue(int tam){
    this.data = new Object[tam];
    this.front = 0;
    this.rear = 0;
    this.size = 0;
   }
    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La queue esta vacia");
        }
        T result =(T) data [front]; //Elemento a retirar
        data[front] = null; //Limpiamos elemento en la posicion de front
        front = (front+1)%data.length; //calculamos el nuevo frente
        size --; //redicimos el tamano de la queue
        return null; //devolver el elemento eliminado
    }
        

    @Override
    public void offer(T eleement) {
        //validar si el arreglo esta lleno, lo vamos a incrementar
        this.data[rear] = eleement; //agregar un nuevo elemento en rear (posicionb)
        this.rear = (rear+1)%data.length; //Calculo rear, si llega al final, se reinicia a 0
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La queue esta vacia");

            return null;
        }
        return (T) data [front];
        
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int u = 0; u<size; u++){
            sb.append(data[(front + u)%data.length]);
            sb.append("--");
            
        }
        sb.append("]");
        System.out.println(sb.toString());

    }

    @Override
    public boolean isEmpty() {
        return size == 0;

    
    }

    @Override
    public int size() {
        return this.size;
        
    }

}
