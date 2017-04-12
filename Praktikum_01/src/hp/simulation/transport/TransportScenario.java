/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp.simulation.transport;

import hp.simulation.Order;
import hp.simulation.Resource;
import hp.simulation.Scenario;
import hp.simulation.SchedulingStrategy;
import hp.simulation.WaitingArea;

/**
 *
 * @author Christian
 */
public class  TransportScenario implements Scenario{

    private final int minWeight = 0;
    private final int maxWeight = 0;
    private final int minDistance = 0;
    private final int maxDistance = 0;
    
      public void TransportScenario(double maxLoad, int speed, int minWeight, int maxWeight, int minDistance, int maxDistance){
       
    }
    
    
    @Override
    public Order createNewOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WaitingArea getWaitingArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Resource getResource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SchedulingStrategy getSchedulingStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
