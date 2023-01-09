public class Queue <T> {
    private T[] arr;
    private int tail=0, head=0;

    // 생성자 주입
    public Queue(int size){
        // Object인 이유는 T[]가 알수없는 형이기 때문임
        // 런타임시에 파악이 안되니깐 모든 형을 담을수 있는 Object로 생성
        this.arr = (T[]) new Object[size];
    }

    // push
    public void push(T obj){
        if(!isPull()) {
            this.arr[this.head++] = obj;
        }
    }

    // pop
    public T pop(){
        if(isEmpty()){
            return null;
        }
        T data = this.arr[tail];
        this.arr[tail++] = null;
        return data;
    }

    // peek
    public T peek(){
        return this.arr[this.head-1];
    }

    // isEmpty
    public boolean isEmpty(){
        return head == tail;
    }

    public boolean isPull(){
        return tail >= head && head != 0;
    }
}
