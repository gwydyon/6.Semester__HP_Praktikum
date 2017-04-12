/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp.queueset;

/**
 *
 * @author Christian
 */
public class TestKlasse {
    public static void main(String[] args) {
        System.out.println("================== Start der Testklasse ==================");
        QueueSet q = new QueueSetByList();
       // QueueSet q = new QueueSetByArray();
        
        q.enqueue(3);
        q.insert(2);
        q.enqueue(5);
        q.enqueue(4);
        System.out.println("first elements: " + q.toString());
        
        q.dequeue();
        System.out.println("deque() result : " + q.toString());
        
        q.enqueue(3);
        q.enqueue("Hallo");
        q.insert("Welt");
        q.enqueue("Was");
        System.out.println("some new elements added: " + q.toString());
        
        q.dequeue();
        System.out.println("deque() result: " + q.toString());
        
        q.insert("kostet");
        q.enqueue("die");
        q.enqueue("Welt");
        
        q.insert("a");
        q.insert("i");
        q.insert("s");
        q.insert("t");
        q.insert("b");
        q.insert("f");
        q.insert("vorletztes");
        q.insert("last");
        q.insert("llast");
        
        System.out.println("final list: " + q.toString());
        System.out.println("contains \"BB\": " + q.contains("BB"));
        System.out.println("show 2nd element: " + q.get(2));
        
        //q.remove(3);
        System.out.println(q.toString());
        
        q.remove("last");
        System.out.println(q.toString());
        
        System.out.println("contains \"5\": " + q.contains(5));
        System.out.println("cointains \"Welt\": " + q.contains("Welt"));        
        System.out.println("size of list = " + q.size());
        System.out.println("is empty: " + q.isEmpty());
        System.out.println("first element = " + q.first());
        q.clear();
        System.out.println("cleared list = " + q.toString());
        q.get(3);
    }
            
}
