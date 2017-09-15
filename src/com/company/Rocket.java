package com.company;

/**
 * Created by sadeea on 15.09.17.
 */
public class Rocket implements SpaceShip{
    public int weightCarried = 0;
    public int maxWeight = 0;
    private int weight = 0;
    private int cost = 0;
    private int chanceOfLaunchCrash = 0;
    private int chanceOfLandCrash = 0;

    public Rocket(int weight, int maxWeight, int cost, int chanceOfLaunchCrash, int chanceOfLandCrash) {
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.cost = cost;
        this.chanceOfLaunchCrash = chanceOfLaunchCrash;
        this.chanceOfLandCrash = chanceOfLandCrash;
    }

    @Override
    public boolean launch() {
        int random = (int) (Math.random() * 100);
//        System.out.println(random + " | " + this.chanceOfLaunchCrash  * this.weightCarried / this.maxWeight);
        if (random > this.chanceOfLaunchCrash  * this.weightCarried / this.maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean land() {
        int random = (int) (Math.random() * 100);
//        System.out.println(random + " | " + this.chanceOfLandCrash  * this.weightCarried / this.maxWeight);
        if (random > this.chanceOfLandCrash  * this.weightCarried / this.maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean canCarry(Item item) {
        if (this.weightCarried + item.weight <= this.maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void carry(Item item) {
        this.weightCarried += item.weight;
    }

    public void load() {
        int r = (int) (Math.random() * this.maxWeight + 1);
        this.weightCarried = r;
    }
}
