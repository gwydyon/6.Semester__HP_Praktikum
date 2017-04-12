package hp.queueset;
import java.util.Arrays;
/**
 *
 * @author Christian
 */
public class QueueSetByArray implements QueueSet{

    private Object[] elements = new Object[16];
    private int index = 0;
    
    
    
    @Override
    public void enqueue(Object element) {
        if(!contains(element)){ //&& index <= elements.length - 1){
            if(index > elements.length - 1){
                //?????????????????????
                doubleCapacity();
            }
            elements[index++] = element;
        }
    }

    @Override
    public Object dequeue() {
        Object tmp = elements[--index];
        elements[index] = null;
        return tmp;
    }

    @Override
    public Object first() {
        if(!isEmpty()){
            return elements[index - 1];
        }
        return null;
    }

    @Override
    public void insert(Object element) {
        enqueue(element);
    }

    @Override
    public void remove(Object element) {
        if(contains(element)){
            Object tmp;
           for(int i = 0; i < elements.length; i++){
               if(elements[i] == element){
                   for(int j = i; j < index; j++){
                       if(j == 15){
                           elements[j] = null;   
                       }else{
                       elements[j] = elements[j+1];
                       }    
                   }
                   index--;
                   break;
               }
           } 
        }
    }

    @Override
    public boolean contains(Object order) {
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == order){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int i) {
        return elements[i];
    }

    @Override
    public int size() {
        int i = 0;
        while(elements[i] != null && i < 16){
            i++;
        }
        return i;
    }

    @Override
    public boolean isEmpty() {
        return (index == 0);
    }

    @Override
    public void clear() {
        //?????????????????????
        elements = Arrays.copyOf(elements, 16);
        
        for(int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
        index = 0;
    }
    
    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        }else{
            String s = "[";
            int i = 0;
            while(i < elements.length - 1 && elements[i+1] != null){
                s += elements[i] + ", ";
                i++;   
            }
        return s + elements[i] + "]";
        }
    }
    //?????????????????????
    private void doubleCapacity(){
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
