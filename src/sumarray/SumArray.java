package sumarray;

import java.util.stream.Stream;

public class SumArray {
    public static void main(String[] args) {
        final Integer[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        final int sum = Stream.of(myArray)
                .filter(x -> (x%2)==1)
                .map(x -> x*2)
                .reduce(0, (v,acc)-> acc+v);
        System.out.println(sum);

    }
}
