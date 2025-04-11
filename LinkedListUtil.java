public class LinkedListUtil{

    private static int count;

    public static int length(LinkedList value){
        Node temp = new
        while(i)
        return value;
    } //- returns the length of the linked list

    public static int search(LinkedList value, int data){
        for(int i=0; i<value.length(); i++){
            if(value[i]==data){
                return value[i];
            }
            return -1;
        }
    } //- returns the index of the first node with given data value, -1 otherwise

    public static Node getNode(LinkedList value, int index){
        Node nod = value.getFront();
        for(int i=0; i<index; i++){
            nod = nod.getNext();
        }
        
        return nod;

    } //- returns the node at a given index, null if index out of bounds

    public static int count(LinkedList value, int data){
        Node temp = new Node(value.getData());
        for(int i=0; i<value; i++){
            
            if(value == data){
                count++;
            }
        }
        return count;
    } //- returns the number of times data occurs in the linked list

    public static boolean compare(LinkedList value1, LinkedList value2){
        Node val1 = value1.getFront();
        Node val2 = vlaue2.getFront();
        for(int i=0; i<value1.length(); i++){
            if(val1.equals(val2) == false){
                return false;
            }
            val1 = val1.getNext();
            val2 = val2.getNext();
        }
        if(value1.length().equals(value2.length())){
            return false;
        }
        return true;
    } //- determines if two lists contain the same data values

    public static LinkedList reverse(LinkedList value){
        LinkedList val;
        for(int i=0; i<value.length; i++){
            val += value(value.length - i);
        }
    } //- returns a reversed version of the linked list without changing the original
}
