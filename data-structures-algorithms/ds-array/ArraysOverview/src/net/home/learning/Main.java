package net.home.learning;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Array numbers = new Array(3);
        LinkedList list = new LinkedList();
        List<Integer> scores = new ArrayList<Integer>();

        Vector<String> vtr = new Vector<String>();

        vtr.add("tiger");
        vtr.add("lion");
        vtr.add("dog");
        vtr.add("elephant");

        vtr.addElement("Rat");
        vtr.addElement("Cat");
        vtr.addElement("Deer");

        System.out.println("Elements are: " + vtr);
        System.out.println("Size is: " + vtr.size());
        System.out.println("Default capacity is: " + vtr.capacity());

        if(vtr.contains("tiger")) {
            System.out.println("tiger is present at the index: " + vtr.indexOf("tiger"));
        } else {
            System.out.println("Tiger is not present in the list.");
        }

        System.out.println("The first animal of the vector is: " + vtr.firstElement());
        System.out.println("The last animal of the vector is: " + vtr.lastElement());

    }
}