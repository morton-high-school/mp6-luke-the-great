public class LinkedListUtil{
    public static int length(LinkedList value){
        Node front = value.getFront();
        Node AreYouSure = front;
            String balls = "";
            int rizz = 0;
            //balls += "Index: " + 0 + " Data: " + front.getData() + "\n";
            for(int i=1; AreYouSure!=null; i++){
                balls += "Index: " + i + " Data: " + AreYouSure.getData() + "\n";
                AreYouSure = AreYouSure.getNext();
                rizz = i;
            }
            return rizz;
    }// - returns the length of the linked list
    public static int search(LinkedList value, int data){
        Node front = value.getFront();
        Node AreYouSure = front;
        int sigma = 0;
        while(AreYouSure.getNext()!=null){
            if(AreYouSure.getData() == data){
                return sigma;
            }
            sigma++;
            AreYouSure = AreYouSure.getNext();
        }
        return -1;
    }// - returns the index of the first node with given data value, -1 otherwise
    public static Node getNode(LinkedList value, int index){
        Node AreYouSure = value.getFront();
        for(int i=0; i<index && AreYouSure!=null; i++){
            AreYouSure = AreYouSure.getNext();
        }
        if(AreYouSure == null){
            return null;
        }
        return AreYouSure;
    }// - returns the node at a given index, null if index out of bounds
    public static int count(LinkedList value, int data){
        int count = 0;
        Node AreYouSure = value.getFront();
        while(AreYouSure!=null){
            if(AreYouSure.getData() == (data)){
                count++;
            }
            AreYouSure = AreYouSure.getNext();
        }
        return count;
    }// - returns the number of times data occurs in the linked list
    public static boolean compare(LinkedList value1, LinkedList value2){
        Node gojoTheGoat = value1.getFront();
        Node IAmBetter_IAMBetter = value2.getFront();
        boolean balls = true;
        if(LinkedListUtil.length(value1) != LinkedListUtil.length(value2)){
            return false;
        }
        while(gojoTheGoat.getNext()!=null && IAmBetter_IAMBetter.getNext()!=null){
            if(gojoTheGoat.getData() == IAmBetter_IAMBetter.getData()){
                balls = true;
            }else{
                return false;
            }
            gojoTheGoat = gojoTheGoat.getNext();
            IAmBetter_IAMBetter = IAmBetter_IAMBetter.getNext();
        }
        return balls;
    }// - determines if two lists contain the same data values
    public static LinkedList reverse(LinkedList value){
        LinkedList flint = new LinkedList();
        Node steel = value.getFront();
        while(steel!=null){
            Node chicken_jockey = new Node(steel.getData());
            flint.insert(chicken_jockey, 0);
            steel = steel.getNext();
        }
        return flint;
    }// - returns a reversed version of the linked list without changing the original
}