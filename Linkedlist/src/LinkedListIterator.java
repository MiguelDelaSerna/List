public class LinkedListIterator {

    private Node iteratorNode;
    private Node head;

    LinkedListIterator(Node head){
        iteratorNode = head;
    }

    public boolean hasNext(){
        return true;
    }

    public String next(){
        return null;
    }
}
