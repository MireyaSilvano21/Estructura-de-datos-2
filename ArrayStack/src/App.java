public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Integer> mysStack = new ArrayStack<>();
        mysStack.push(2);
        mysStack.push(3);
        mysStack.push(4);
        
        mysStack.printStack();
        System.out.println("------------------------");
        mysStack.pop();
        mysStack.printStack();
    }
}
