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

    public void insertAt(int index, int item){

    }

    public int max(){
        //if current item is greater than max, max will be equal to current item and iterate the whole array
        int max = 0;
        for(int i=0;i<count;i++)
            if(array[i] > max)
                max = array[i];
        return max;
    }

    public void deleteAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index ; i < count;i++)
            array[i] = array[i+1];
        count--;
    }

    public int indexOf(int item){
        for(int i=0;i<count;i++)
            if(array[i] == item)
                return i;
        return -1;
    }

    public boolean contains(int item){
        for(int i=0; i<count; i++)
            if(array[i] == item)
                return true;
        return false;
    }

    public void reverse(){
        int newArray[] = new int[count];
        int index = 0;
        for(int i=count-1;i>=0;i--)
            newArray[index++] = array[i];
        array = newArray;

    }

    public void print(){
        for (int i=0; i<count; i++)
            System.out.println(array[i]);
    }
}
