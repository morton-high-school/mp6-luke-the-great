public class Stack{
    private LinkedList balls = new LinkedList();
    public Stack(){
        balls = new LinkedList();
    }// - default constructor
    public void push(Node item){
        balls.append(item);
    }// - adds an item to the top of the stack
    public Node pop(){
        Node balk = new Node(LinkedListUtil.getNode(balls, LinkedListUtil.length(balls)-1).getData());
        balls.remove(LinkedListUtil.length(balls)-1);
        return balk;
    }// - removes and returns the item from the top of the stack
    public Node peek(){
        Node balk = new Node(LinkedListUtil.getNode(balls, LinkedListUtil.length(balls)-1).getData());
        return balk;
    }// - returns the item from the top of the stack
    public boolean empty(){
        if(LinkedListUtil.length(balls) == 0){
            return true;
        }else{
            return false;
        }
    }// - returns true if the stack is empty and false otherwise
    public int search(Node item){
        if(LinkedListUtil.search(balls, item.getData()) == -1){
            return -1;
        }else{
            return LinkedListUtil.length(balls) - LinkedListUtil.search(balls, item.getData()) - 1;
        }
    }// - returns the location of the item on the stack, -1 otherwise
}