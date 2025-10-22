public class App {
    public static void main(String[] args) throws Exception {
      ArrayQueue<Character> fila = new ArrayQueue<>();
      fila.print();
      fila.offer('A');
      fila.offer('B');
      fila.poll();
      System.out.println("--------------");
      fila.print();
      
      fila.offer('C');
      fila.offer('D');
      fila.offer('E');
      fila.offer('F');
      System.out.println("--------------");
      fila.print();

    }
}
