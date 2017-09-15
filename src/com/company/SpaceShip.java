package com.company;

/**
 * Created by sadeea on 15.09.17.
 */
public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    void carry(Item item);
}
