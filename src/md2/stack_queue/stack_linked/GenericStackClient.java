package md2.stack_queue.stack_linked;

public class GenericStackClient {
    private static void stackofStrings() {
        MyGerericStack<String> stack = new MyGerericStack<>();
        stack.push("Five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println("1.1 Size of stack after push operations:" +stack.size());
        System.out.println("1.2 Pop elements from stack:");
        while (!stack.isEmpty()){
            System.out.printf("%s",stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations:" +stack.size());

    }
  private static void stackofInterfaces() {
      MyGerericStack<Integer> stack = new MyGerericStack<>();
      stack.push(5);
      stack.push(4);
      stack.push(3);
      stack.push(2);
      stack.push(1);
      System.out.println("2.1 Size of stack after push operations:" + stack.size());
      System.out.println("2.2 Pop elements from stack");
      while (!stack.isEmpty()) {
          System.out.printf("%d", stack.pop());
      }
      System.out.println("\n2.3 Size of stack after pop operations:" + stack.size());
  }

    public static void main(String[] args) {
        System.out.println("1.Stack of interger");
        stackofInterfaces();
        System.out.println("2. Stack of String");
        stackofStrings();
    }
}
