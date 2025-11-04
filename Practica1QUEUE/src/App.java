public class App {
    public static void main(String[] args) throws Exception {
        int antes,  despues;
       ArrayQueue <Customer> fila = new ArrayQueue<>();
       fila.offer(new Customer(1, "Usiel"));
       fila.offer(new Customer(2, "Mariana"));
       fila.offer(new Customer(3, "Mireya"));
       fila.offer(new Customer(4, "Fernado"));
       fila.offer(new Customer(5, "Leo"));
        System.out.println("----------Antes de invertir----------");
        fila.print();
        antes = fila.size();
        System.out.println("----------Despues de invertir----------");
        fila.reverse();
        despues = fila.size();
        fila.print();
        System.out.println("Elementos antes: "+ antes + ", elementos despues: "+ despues);

       

    }
}
