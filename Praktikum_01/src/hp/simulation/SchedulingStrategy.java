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
public interface SchedulingStrategy {
    void scheduleNextOrders(WaitingArea waitingArea ,Resource resource );
}
