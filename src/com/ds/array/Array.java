package com.ds.array;

public class Array {
    private int [] array;
    private int count;

    public Array(int length){
        array = new int[length];
    }

    public void insert(int item){
        if(array.length == count){
            int []newArray = new int[count * 2];
            for (int i=0;i<count;i++)
                newArray[i] = array[i];
            array = newArray;
        }
        array[count++] = item;
    }

    public void deleteAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index ; i < count;i++)
            array[i] = array[i+1];
        count--;

    }

    public void print(){
        for (int i=0; i<count; i++)
            System.out.println(array[i]);
    }
}
