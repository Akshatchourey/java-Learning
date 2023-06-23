package com.compony;
import java.util.*;

public class CollectionsFramework{
    public static void main(String[] args){

        // ArrayDeque
/*      ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(23);
        deque.offerFirst(12);
        deque.offerLast(25);

        System.out.println(deque);
        System.out.println("just peek " + deque.peek());
        System.out.println("peekFirst " + deque.peekFirst());
        System.out.println("peekLast " + deque.peekLast());

        System.out.println(deque.pollFirst());
        System.out.println("When poll first = " + deque);
        System.out.println(deque.pollLast());
        System.out.println("When poll last = " + deque);*/
        // Set HashSet -- no order, O(1), unique.
        Set<Integer> myHashSet = new HashSet<>();
        // Set LinkedHashSe -- same order as input element, O(log n).
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
        // Set LinkedHashSe -- sorted order, O(log n), Ascending.
        Set<Integer> myTreeSet = new TreeSet<>();
    }
}
