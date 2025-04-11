public class Queue{
    private int size;
    private Node first;
    public Queue(){
        size = 0;
        first = null;
    } //- default constructor
    public void add(Node item){
        if(first == null){
            first = item;
        }
        first.next = item;

    } //- adds an item to the back of the queue
    public Node remove(){
        Node temp = first;
        for(int i=0; i<size; i++){
            first = first.next;
        }
        return temp;

    } //- removes and returns the item from the front of the queue
    public Node peek(){
        return first;

    } //- returns the item from the front of the queue
    public boolean empty(){
        if(size == 0){
            return true;
        }
        return false;
    } //- returns true if the queue is empty and false otherwise
    public int search(Node item){
        for(int i=0; i<size; i++){
            if(Stack[i].equals(item)){
                return i;
            }
        }
        return -1;
    } //- returns the location of the item in the queue

}