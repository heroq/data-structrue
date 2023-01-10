public class SinglyLinkedList {
    public class Node(){
        private Node next;
        private String value;

        Node(String value){
            this.value = value;
            next = null;
        }

        public String toString(){
            return String.valueof(this.value);
        }
    }
}