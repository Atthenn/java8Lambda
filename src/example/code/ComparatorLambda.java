package example.code;

import java.lang.reflect.Array;
import java.util.*;

public class ComparatorLambda {

    public static void main(String[] args){


//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        };

        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(),o2.length());

        List<String>  list = Arrays.asList("***","*","****","**");
        Collections.sort(list,comparator);

        for(String s:list){
            System.out.println(s);
        }
    }
}
