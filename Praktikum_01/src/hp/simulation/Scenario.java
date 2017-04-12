package hp.simulation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public interface Scenario {
    Order createNewOrder();
    WaitingArea getWaitingArea();
    Resource getResource();
    SchedulingStrategy getSchedulingStrategy();
}
