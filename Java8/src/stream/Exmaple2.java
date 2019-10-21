package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
public class Exmaple2 {
    public static void main(String args[]){

        //BOXING FOR PRIMITIVES
        List<Integer> ints = IntStream.of(1,2,3,4,5)
                .boxed()
                .collect(Collectors.toList());

        ints.forEach(i ->System.out.println(i));

        //BOXING FOR PRIMITIVES
        List<Long> longs = LongStream.of(1l,2l,3l,4l,5l)
                .boxed()
                .collect(Collectors.toList());

        longs.forEach(l ->System.out.println(l));
    }
}
