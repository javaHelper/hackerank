package org.example.algorithms.implementation;

public class StrangeCounter {
    static long strangeCounter(long time) {
        long t = 1;
        long step = 3;
        while (t < time) {
            t += step;
            step *= 2;
        }
        if (time == t) {
            return step;
        }
        return t - time;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(4));
    }
}
