public class Queue{
    private LinkedList balkan = new LinkedList();
    public Queue(){
        balkan = new LinkedList();
    }// - default constructor
    public void add(Node item){
        balkan.insert(item, 0);
    }// - adds an item to the back of the queue
    public Node remove(){
        Node rage = new Node(LinkedListUtil.getNode(balkan, LinkedListUtil.length(balkan)-1).getData());
        balkan.remove(LinkedListUtil.length(balkan)-1);
        return rage;
    } //- removes and returns the item from the front of the queue
    public Node peek(){
        Node balk = new Node(LinkedListUtil.getNode(balkan, LinkedListUtil.length(balkan)-1).getData());
        return balk;
    }// - returns the item from the front of the queue
    public boolean empty(){
        if(LinkedListUtil.length(balkan) == 0){
            return true;
        }else{
            return false;
        }
    }// - returns true if the queue is empty and false otherwise
    public int search(Node item){
        if(LinkedListUtil.search(balkan, item.getData()) == -1){
            return -1;
        }else{
            return LinkedListUtil.length(balkan) - LinkedListUtil.search(balkan, item.getData()) - 1;
        }
    }// - returns the location of the item in the queue
}