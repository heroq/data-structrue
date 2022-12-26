import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        System.out.println("hello");
        Stack<String> b = new Stack<>(10);
        b.push("String1");
        b.push("String2");
        b.pop();
        System.out.println(b.peek());
        b.push("String3");
        System.out.println(b.peek());
        b.pop();
        b.pop();
        System.out.println(b.isEmpty());
    }
}
