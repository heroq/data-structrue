public class Stack <E> {
    // Last In First out (LIFO)
    // 가장 최근에 넣은게 제거 대상

    private E[] arr;
    private int point = 0;

    public Stack(int size){
        this.arr = (E[]) new Object[size];
    }

    // 스택 맨위 삭제
    public void pop(){
        arr[point] = null;
        point --;
    }

    // 스택 맨위 추가
    public void push(E push){
        arr[point] = push;
        point ++;
    }

    // 스택 맨위 반환
    public E peek(){
        // push에서 point를 더 해줘서 -1 필요
        return (E) arr[point-1];
    }

    // 비었는지
    public boolean isEmpty(){
        return point == 0 ? true : false;
    }
}
