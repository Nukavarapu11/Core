package com.Practice;

import java.util.*;

public class test1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char c;
//        int i = 0;
//        int k=0;
//        int[] j = new int[5];
//        do {
//            i = sc.nextInt();
//            j[k] = i;
//
////            sc.next();
//            c = sc.next().charAt(0);
//            k++;
//        }while (c == 'Y' ||c =='y' && j.length<=5);
//        System.out.println(j[0]);

        //removeElement();
        //testEmpty();
        //testStack();
        //testQueue();
        //testMap();
        testQueue1();
    }

    public static void removeElement() {

        Stack<Integer> al
                = new Stack<>();

        for (int i = 4; i > 0; i--)
            al.push(i);

//        System.out.println(al);
//
//        al.pop();
//        System.out.println(al);
//        for (int i = 0; i < al.size(); i++)
//            System.out.print(al.get(i) + " ");

        for (int j = 0; j < al.size(); j++) {
        }
    }

    public static void testEmpty() {
        String s1 = "";
        String s2 = "";

        if (s1.equals(s2)) {
            System.out.println("true");
        }
    }

    public static void testStack() {

        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        Iterator<Integer> itr
                = stack.iterator();

// Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        if (stack.size() != 0) {
            stack.pop();
        }

// Iterator for the stack
        itr
                = stack.iterator();

// Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void testQueue() {

        Queue<Integer> queue = new ArrayDeque<>();


        queue.add(1);
        queue.add(2);
        queue.add(3);
        //queue.add(2);
//        Iterator<Integer> itr
//                = queue.iterator();
//
//// Printing the stack
//
//
//        System.out.println();
//        if (queue.size() != 0) {
//            queue.remove();
//        }
//
//// Iterator for the stack
//        itr
//                = queue.iterator();
//
//// Printing the stack
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + " ");
//        }
//    }
// Printing the top element of PriorityQueue
        System.out.println(queue.peek());

// Printing the top element and removing it
// from the PriorityQueue container
        System.out.println(queue.poll());

// Printing the top element again
        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue.peek());
    }

    public static void testMap() {

        HashMap<String, String> map = new HashMap();

        map.put("1", "k");
        map.put("2", "R");
        map.put("3", "N");
        map.put("0", "T");
        System.out.println("Value for 1 is " + map.get(1));

// Traversing through the HashMap
        for (Map.Entry<String, String> e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        map.remove("1");
        System.out.println(map);
    }
    //     Infix,Prefix,Postfix
    //array de-que;

    public static void testQueue1() {
        ArrayDeque<Integer> de_que
                = new ArrayDeque<Integer>(10);

// add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

// clear() method
        de_que.clear();

// addFirst() method to insert the
// elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

// addLast() method to insert the
// elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        de_que.removeFirst();

        System.out.println(de_que);
    }

    //how to evaluate an expression using stack?

}
