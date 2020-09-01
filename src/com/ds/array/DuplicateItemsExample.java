package com.ds.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateItemsExample {

    public static void main(String[] args) {

        String[] courses = {"Java", "Kotlin", "Android", "Spring Boot", "Java", "Kotlin", "Angular"};

        // Time Complexity O(n^2)
        for(int i=0; i< courses.length;i++){
            for (int j=i+1;j<courses.length;j++){
                if(courses[i].equals(courses[j]))
                    System.out.println("Duplicate Item :"+courses[i]);
            }
        }
        // Time Complexity O(n)
        Set<String> set = new HashSet<>();
        for (String course : courses) {
            if(!set.add(course)){
                System.out.println("Duplicate Item :"+course);
            }
        }
    }
}
