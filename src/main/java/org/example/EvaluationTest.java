package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EvaluationTest {

    public static void main(String[] args){
        case1();
        case2();
        case3();
    }
    private static void case1() {
        final int score1 = 8, score2 = 3;
        char myScore = 7;
        var goal = switch (myScore) {
            default -> {
                if (10 > score1) yield "unknown";
                else yield "empty";
            }
            case score1 -> "great";
            case 2, 4, 6 -> "good";
            case score2, 0 -> "bad";
        };

        System.out.println(goal);
    }

    private static void case2(){
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun+", "+jupiter+", "+mars);
    }

    private static void case3(){
        List<Integer> data = new ArrayList<>();
//      IntStream.range(0,100).parallel().forEach(s -> data.add(s));
        IntStream.range(0,100).forEach(s -> data.add(s));
        System.out.println(data.size());
    }
}
