public class Node {
    int duracion;
    String nombre;
    Node next;
    public Node(String nombre,int duracion){
        this.nombre = nombre;
        this.duracion=duracion;

        this.next=null; //opcional, pero no esta mal que se ponga, para que no se olvide la referencia al instalncialo es null
        
    }

}