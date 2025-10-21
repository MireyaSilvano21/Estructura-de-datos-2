public class SinglyLinkedList {
    private Node head;

    public void add(String nombre,int duracion){
        //creación de un nodo
        Node newNode = new Node(nombre,duracion);
        //Verificando si la lista esta vacia, entonces el nuevo nodo es el head
        if(head == null){
            head = newNode;
            return;
        }
        //En caso de que no este vacia la lista
        //vamos a recorrer todos los nodos hasta encontrar la referecia (next) en null
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        //se agrega el nuevo nodo en la referencia del ultimo nodo
        current.next = newNode;
    }
    
    public boolean contains(String nombre){

        Node current = head;
        while (current != null) {
            if (current.nombre == nombre) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeSong(String nombre){
        if (head== null) {
            return;  
        }if (head.nombre==nombre) {
            head=head.next;
        }
           Node current = head;
           while (current.next != null && current.next.nombre != nombre) {
                current = current.next;
           }
           if (current.next != null) {
             current.next = current.next.next;
           }
           
    }
    public void printSong(){
        Node current = head;
        while (current != null) {
            System.out.println(current.nombre +"("+current.duracion+"s)" );
            current = current.next;
        }
        
    }

    public void getduracionTotal(){
        int duracionTotal  = 0;
        Node current = head;
        while (current != null) {
           duracionTotal  += current.duracion;
            current = current.next;
        }
         System.out.println("Duracion total:"+duracionTotal);

    
    }


}
