/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.urv.imas.utils;

/**
 *
 * @author mhj
 */
public enum MessageType {

    REQUEST_CITY_STATUS(1),
    INFORM_CITY_STATUS(2),
    INFORM_NEW_STEP (3),
    DONE(4),
    REQUEST_MOVE(5),
    NEW_FIRES(6),
    AUCTION_PROPOSAL(7);

    private int value;

    private MessageType(int value) {
        this.value = value;
    }



}
