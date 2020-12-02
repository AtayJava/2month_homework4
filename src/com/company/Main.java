package com.company;

public class Main {

    public static void main(String[] args) {
        Runner first = new Runner("Runner1");
        Runner second = new Runner("Runner2");
        Runner third = new Runner("Runner3");
        Runner fourth = new Runner("Runner4");
        Runner fifth = new Runner("Runner5");
        first.setRuns(fifth, second);
        second.setRuns(first, third);
        third.setRuns(second, fourth);
        fourth.setRuns(third, fifth);
        fifth.setRuns(fourth, first);
        first.start();





    }
}
