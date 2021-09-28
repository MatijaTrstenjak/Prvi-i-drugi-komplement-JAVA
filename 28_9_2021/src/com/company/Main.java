package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Binarni br1 = new Binarni();

        br1.broj = "100";

        System.out.println("Tvoj broj:              " + br1.broj);
        System.out.println("Prvi komplement broja:  " + br1.prviKomplement());
        System.out.println("Drugi komplement broja: " + br1.drugiKomplement());








        /*Covjek cov1 = new Covjek();

        cov1.ime = "Ljukes";
        cov1.prezime = "Kraljo";
        cov1.tezina = (float) 69.3;
        cov1.visina = (float) 180.2;

        cov1.bmi();*/



        /*Krug kr1 = new Krug();
        Krug kr2 = new Krug();

        Random ran = new Random();

        kr1.r = 3;
        kr2.r = ran.nextInt(10) + 10;

        System.out.println("kr1: r=" + kr1.r + " pov=" + kr1.povrsina() + " ops=" + kr1.opseg());
        System.out.println("kr2: r=" + kr2.r + " pov=" + kr2.povrsina() + " ops=" + kr2.opseg());
        System.out.println("Zbroj polumjera: " + (kr1.r + kr2.r));*/


    }
}
