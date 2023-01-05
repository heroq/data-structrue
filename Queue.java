public class Queue <T> {
    private T[] arr;
    private int pointer=0, deletePointer=0;

    // 생성자 주입
    public Queue(int size){
        // Object인 이유는 T[]가 알수없는 형이기 때문임
        // 런타임시에 파악이 안되니깐 모든 형을 담을수 있는 Object로 생성
        this.arr = (T[]) new Object[size];
    }

    // push
    public void push(T obj){
        if(this.arr.length-1 < pointer)
            pointer = 0;

        this.arr[pointer] = obj;
        pointer ++;
    }

    // pop
    public T pop(){
        if(this.arr.length-1 < deletePointer)
            deletePointer = 0;

        T data = this.arr[deletePointer];

        this.arr[deletePointer] = null;
        deletePointer ++;
        return data;
    }

    // peek
    public T peek(){
        return this.arr[pointer];
    }

    // isEmpty
    public boolean isEmpty(){
        return pointer == deletePointer;
    }
}
