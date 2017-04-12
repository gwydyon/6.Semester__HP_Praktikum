package hp.queueset;

public class QueueSetByList implements QueueSet{

    private ListElement head = null;
    private ListElement tail = null;
    
   //ein Test für GIT
    
    @Override
    public void enqueue(Object element) {
        if(!contains(element)){
            
            if(head == null){
                head = new ListElement(element, null);
                tail = head;
            }else{
                tail.next = new ListElement(element, null);
                tail = tail.next;
            }
        }
    }

    @Override
    public Object dequeue() {
        Object tmp = head.element;
        head = head.next;
        return tmp;
    }

    @Override
    public Object first() {
        if(size() > 0){
            return head.element;
        }else{
            System.out.println("Empty List");
            return null; //??????????????????????
        }
    }

    @Override 
    public void insert(Object element) {
        enqueue(element);
    }

    @Override
    public void remove(Object element) {
        ListElement current = head;
        ListElement previous = null;
        
        if(contains(element)){
            
            while(current != null){
                if(current.element == element){
                    if(previous == null){
                        head = current.next;
                    }else{
                        previous.next = current.next;
                        
                    }
                    
                if(current.next == null){
                    tail = previous;
                }
                //break
                }  
                previous = current;
                current = current.next;
            }
        }
    }

    @Override
    public boolean contains(Object order) {
      ListElement tmp = head; 
       
            if(tmp == null){
                return false;
            }
            while(tmp.element!=order){
                tmp = tmp.next;
                if(tmp == null){
                    return false;
                }
            }
            return true;
        //while(tmp.element != order){     
       //            }else if(tmp.element == order){
//                return true;
//            }else{
//            tmp = tmp.next;     
       // }
        //return true;
    }

    @Override
    public Object get(int i) {
        if(this.size() > i + 1){
            ListElement tmp = head;
            for(int j = 0; j < i; j++){
                tmp = tmp.next;
            }
        return tmp.element; //head.element?
        }
        return null;//??????????????????? was im Fehlerfall zurückgeben?
    }

    @Override
    public int size() {
        int cnt = 0;
        ListElement tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            cnt += 1;
        }
        return cnt;
    }

    @Override
    public boolean isEmpty() {
//        if (head == null){
//            return true;
//        }else{
//            return false;
//        }
        return (head == null);
    }

    @Override
    public void clear() {
        head = null;
    }
    
    @Override//??????????????????????????????????????????????
    public String toString(){
        ListElement tmp = head;
        String out = "[";
     
        if(tmp == null){
            return "[ ]";
        }
        //}else{
        while(tmp.next != null){
            out += tmp.element + ", ";
            tmp = tmp.next;
        }
        return out + tmp.element + "]";
        //}
    }
    
    private static class ListElement{
        private Object element;
        private ListElement next;
   
        private ListElement(Object element, ListElement next){
            this.element = element;
            this.next = next;
        }
    }
    
    
}
