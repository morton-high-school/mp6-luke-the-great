public class LinkedList{
    private Node Cecil_INeedYouCecil;
    public LinkedList(){
        this.Cecil_INeedYouCecil = null;
    } //- default constructor
    public Node getFront(){
        return this.Cecil_INeedYouCecil;
    }// - returns the head of the linked list
    public void append(Node node){
        Node cecil = Cecil_INeedYouCecil;
        if(Cecil_INeedYouCecil == null){
            Cecil_INeedYouCecil = node;
        }else if(Cecil_INeedYouCecil.getNext() == null){
            Cecil_INeedYouCecil.setNext(node);
        }else{
            while(cecil.getNext() != null){
                cecil = cecil.getNext();
            }
            cecil.setNext(node);
        }
        
    }// - adds a node to the end of the linked list
    public void insert(Node node, int index){
       if (index == 0 || Cecil_INeedYouCecil == null) {
            node.setNext(Cecil_INeedYouCecil);
            Cecil_INeedYouCecil = node;
            return;
        }
        Node cecil = Cecil_INeedYouCecil;
        int currentIndex = 0;
        while (cecil.getNext() != null && currentIndex < index-1) {
            cecil = cecil.getNext();
            currentIndex++;
        }
        node.setNext(cecil.getNext());
        cecil.setNext(node);
    }// - inserts a node at the given index or appends to the end if the index is out of bounds
    public Node remove(int index){
        int balk = 0;
        Node cecil = Cecil_INeedYouCecil;
        Node ball = null;
        for(int i=0; cecil.getNext()!=null; i++){
                balk++;
                cecil = cecil.getNext();
            }   
        if(index>balk){
            return ball;
        }else if(balk == index-1){
            cecil = null;
            return cecil;
        }else if(index == 0){
            cecil = Cecil_INeedYouCecil;
            Cecil_INeedYouCecil = cecil.getNext();
            for(int i=0; i<balk-1; i++){
                cecil.setNext(cecil.getNext());
            }
            cecil = null;
            return Cecil_INeedYouCecil;
        }else{
            cecil = Cecil_INeedYouCecil;
            for(int i=0; i<index-1 && cecil.getNext()!=null; i++){
                cecil = cecil.getNext();
            }
            
            ball = cecil;
            cecil.setNext(cecil.getNext().getNext());
            return ball;
        }
    }// - removes and then returns the node at a given index, null if index out of bounds
    public String toString(){
        if(Cecil_INeedYouCecil == null){
            return "There are no items in this list.";
        }else{
            Node enderPearl = Cecil_INeedYouCecil;
            String balls = "";
            //balls += "Index: " + 0 + " Data: " + Cecil_INeedYouCecil.getData() + "\n";
            for(int i=0; enderPearl!=null; i++){
                balls += "Index: " + i + " Data: " + enderPearl.getData() + "\n";
                enderPearl = enderPearl.getNext();
            }
            return balls;
        }
    }// - returns information about the linked list
}// done  YIPPEE!!!
