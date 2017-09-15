package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File phase1 = new File("phase-1.txt");
        Scanner input = new Scanner(phase1);

//        while (input.hasNext()) {
//            System.out.println(input.nextLine());
//        }

        Rocket u1 = new U1();
        Rocket u2 = new U2();

u1.load();
u2.load();
        System.out.println("u1 max : " + u1.maxWeight);
        System.out.println("u1 wc : " + u1.weightCarried);

        System.out.println("u2 max : " + u2.maxWeight);
        System.out.println("u2 wc : " + u2.weightCarried);


        int u1Suc = 0;
        int u2Suc = 0;
        int iter = 1000;
        for (int i=0 ; i< iter; i++){
//            System.out.println("u1 launch : " + u1.launch() + "  --- land : " + u1.land());
//            System.out.println("u2 launch : " + u2.launch() + "  --- land : " + u2.land());
//            System.out.println("------------------------------------");
            if (u1.launch() && u1.land() ){ u1Suc++; }
            if (u2.launch() && u2.land() ){ u2Suc++; }
        }

        System.out.println(((u1Suc * 100) / iter ) + " | " + ((u2Suc*100) / iter ));
    }

}
