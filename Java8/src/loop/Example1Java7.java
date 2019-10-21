package loop;

import java.util.List;
import java.util.ArrayList;

public class Example1Java7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Q");
        list.add("W");
        list.add("E");
        list.add("R");
        list.add("T");
        list.add("Y");


        for (String l : list) {
            System.out.println(l);
        }
        System.out.println("_______________________");

        for (String l : list) {
            System.out.println(l.toLowerCase());
        }
        System.out.println("_______________________");

        for (String l : list) {
            if (l.equals("W")) {
                System.out.println("doubleu");
            } else {
                System.out.println(l);
            }
        }

    }
}
