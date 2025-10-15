public class App {
    public static void main(String[] args) throws Exception {
        SinglyLikedList singlyList = new SinglyLikedList();

        singlyList.add(2);
        singlyList.add(3);
        singlyList.add(3);
        singlyList.add(4);
        singlyList.add(5);

        System.out.println("-----OCURRENCIAS---");
        singlyList.Buscador(3);
        System.out.println("-----LISTA---");
        singlyList.printList();
    }
}
