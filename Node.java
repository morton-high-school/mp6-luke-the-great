// the Nodes
public class Node{

    private int data;
    private Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    } //- Constructor that takes an int value to be stored as its data

    public int getData(){
        return data;
    } //- returns the data element of the node

    public Node getNext(){
        return this.next;
    } //- returns the next linked node or null otherwise
    public void setNext(Node next){
        this.next = next;
        if(next != null){
            next.setNext(null);
        }
        
    } //- sets the next linked node
}