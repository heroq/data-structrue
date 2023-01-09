import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        Queue a = new Queue<Integer>(10);
        a.push(10);
        System.out.println(a.peek());
        a.push(20);
        System.out.println(a.peek());
        a.pop();
        System.out.println(a.peek());
        a.pop();
        System.out.println(a.peek());
        System.out.println(a.isEmpty());
    }
}
