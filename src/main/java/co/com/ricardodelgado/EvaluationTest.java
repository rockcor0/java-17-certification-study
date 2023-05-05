package co.com.ricardodelgado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EvaluationTest {

    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        case1();
        case2();
        case3();
        Integer a = 15;
        var b = 10;
        EvaluationTest.addToInt(a, b);
        System.out.println(a);
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

    static void case4() {
//        Predicate<String> empty = String::isEmpty;
//        Predicate<String> notEmpty = empty.negate();
//
//        var result = Stream.generate(() -> "")
//                .filter(notEmpty)
//                .collect(Collectors.groupingBy(k -> k))
//                .entrySet()
//                .stream()
//                .map(Entry::getValue)
//                .flatMap(Collection::stream)
//                .collect(Collectors.partitioningBy(notEmpty));
//        System.out.println(result);
    }

    public static void addToInt(Integer x, int amountToAdd) {
        x = x + amountToAdd;
    }
}
