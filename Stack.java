public class Stack{

    private static int size;
    private Node top;
    public Stack(){
        size = 0;
        top = null;
    } //- default constructor
    public void push(Node item){
        top = item;
        size++;
    } //- adds an item to the top of the stack
    public Node pop(){
        Node temp = top;
        top = null;
        size--;
        return temp;
    } //- removes and returns the item from the top of the stack
    public Node peek(){
        return top;
    } //- returns the item from the top of the stack
    public boolean empty(){
        if(size == 0){
            return true;
        }
        return false;
    } //- returns true if the stack is empty and false otherwise
    public int search(Node item){
        for(int i=0; i<size; i++){
            if(Stack[i].equals(item)){
                return i;
            }
        }
        return -1;
    } //- returns the location of the item on the stack, -1 otherwise

}