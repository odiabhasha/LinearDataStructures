package com.ds.array;

public class ArrayMain {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(12);
        array.insert(13);
        array.insert(14);
        array.insert(15);
        /*System.out.println(array.indexOf(12));
        System.out.println(array.indexOf(13));
        System.out.println(array.indexOf(15));
        System.out.println(array.max());
        array.deleteAt(0);*/
        array.print();

        array.reverse();

        array.print();
    }
}
