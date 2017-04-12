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
public interface QueueSet {
    void enqueue(Object element);
    Object dequeue();
    Object first();
    void insert(Object element);
    void remove(Object element);
    boolean contains(Object order);
    Object get(int i);
    int size();
    boolean isEmpty();
    void clear();
   
    @Override
    String toString();
}
