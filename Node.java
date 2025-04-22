public class Node{
    private Node next;
    private int data;
    public Node(int data){
        this.next = null;
        this.data = data;
    }//- Constructor that takes an int value to be stored as its data
    public int getData(){
        return data;
    } //- returns the data element of the node
    public Node getNext(){
        return next;
    }//- returns the next linked node or null otherwise
    public void setNext(Node next){
        this.next = next;
    } //- sets the next linked node
}// Done   YIPPEE !!!
