public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("one and only", 150);
        list.add("eres", 120);
        list.add("rock with you", 190);
        list.add("after last night",200);

        list.printSong();
        list.removeSong("eres");
        list.getduracionTotal();

    }
}
