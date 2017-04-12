/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp.simulation.transport;

import hp.simulation.Order;
import hp.simulation.Resource;
import hp.simulation.SchedulingStrategy;
import hp.simulation.WaitingArea;

/**
 *
 * @author Christian
 */
public class ParcelStation implements SchedulingStrategy, WaitingArea{

    public void scheduleNextOrder(WaitingArea waitingArea, Resource resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enterWaitingArea(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void scheduleNextOrders(WaitingArea waitingArea, Resource resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
