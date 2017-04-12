package hp.simulation;

import hp.queueset.QueueSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public interface Resource {
    void freeResource();
    QueueSet getCurrentOrders();
    long getTimeResourceIsOccupied();
    boolean isFree();
   
    @Override
    String toString();
}
