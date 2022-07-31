package com.company;

public class Main {


    public static void main(String[] args) {
        Programmer programmer = new Programmer("Steve","ITschool","programer",12);
        Dancer dancer = new Dancer("Sara","Dance club","Dancer",14);
        Singer singer = new Singer("Emma","theatre","Singer",20);


        singer.name();
        singer.jOb();
        singer.daNcer();
        singer.aGe();
        System.out.println();

        programmer.name();
        programmer.jOb();
        programmer.daNcer();
        programmer.aGe();
        System.out.println();
        dancer.name();
        dancer.jOb();
        dancer.daNcer();
        dancer.aGe();
    }
}