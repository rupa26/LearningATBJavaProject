package ex_32_Collection_Framework_DSA.LIST.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST_I{
    public static void main(String[] args) {
        //List fruits = new List ();
        List fruits =List.of("orange", "apple", "banana");
        System.out.println(fruits);
       // fruits.add("chiku");// java.lang.UnsupportedOpertionException
       //fruits.remove("apple");// Not Possible

        List l = new ArrayList();// Dynamic Dispatch
        ArrayList l2 = new ArrayList();
        l.add(123);
        l.add("hello");
        l.add("true");

    }
}
