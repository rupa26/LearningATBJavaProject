package ex_32_Collection_Framework_DSA.LIST.List;

import java.util.List;
import java.util.ArrayList;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Rupa");
        arrayList.add(null);
        arrayList.add("Rani");
        arrayList.add("Rani"); // dublicate allowed
        arrayList.add(123);//Different data type is allowed
        System.out.println(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.size());


        List l= new ArrayList();
        l.add("123");
        l.add("234");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());



    }}
