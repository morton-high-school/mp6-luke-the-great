public class LinkedList{
        private Node front;
        private int value;
    //" - default constructor"
    public LinkedList(){
        front = null;
        value = 0;
    }

    public Node getFront(){
        return front;
    }//- returns the head of the linked list

    public void append(Node node){
        if(front == null){
            front = node;
            front.setNext(null);
        }
        Node temp = front;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        
        temp.setNext(node);
        value++;
    } //- adds a node to the end of the linked list

    public void insert(Node node, int index) {
        int i = 0;
        if(front == null){
            front = node;
        }
        if(index > value){
            Node temp = front;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        if(index == 0){
            Node temp3 = front;
            Node temp4 = front.getNext();
            front = node;
            front.setNext(temp3);
            temp3.setNext(temp4);
            
            // while(temp3.getNext() != null){
            //     temp3.setNext(temp3);
            //     temp3 = temp4;
            //     temp4 = temp3.getNext();
            //     System.out.println(temp4.getData());
            // }
        }else{
            Node temp = front;
            
            for(int j = 0; j<index-1 && temp.getNext()!=null; j++){
                temp = temp.getNext();
            }
            Node temp2 = node;
            temp.setNext(temp2);
            System.out.println(temp.getData());
            temp = temp.getNext();
            //temp.setNext(temp2);
            
            


            // while(i != index && temp != null){
            //     temp = temp.getNext();
            //     i++;
            // }
            // while(temp!=null&&index<value && temp.getNext() != null){
            //     temp.setNext(temp);
            //     temp = temp2;
            //     temp2 = temp.getNext();
            // }
        }
        
        value++;
    } //- inserts a node at the given index or appends to the end if the index is out of bounds

    public Node remove(int index){
        if(index > value){
            return null;
        }
        Node nodes = new Node(index);
        
        
        Node temp = new Node(index);
        Node ret = new Node(index);
        for(int i=index-1; i<value; i++){
            temp.setNext(temp);
        }
        
        value--;
        return ret;

    }//- removes and then returns the node at a given index, null if index out of bounds


    public String toString(){
        if(front == null){
            return "There are no items in this list.";
        }
        
        String ret = "";
        Node temp = front;
        int i = 0;
        // while(temp.getNext()!=null){
        //         temp = temp.getNext();
        //         cont++;
        //     }
        //ret += "Index: " + 0 + " Data: " + temp.getData() + "\n";
        while(temp != null){
            ret += "Index: " + i + " Data: " + temp.getData() + "\n";
            // temp.setNext(temp);
            temp = temp.getNext();
            i++;
        }
        
        return ret;
    } //- returns information about the linked list
}

