package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type '!' to finish");
        String studentName;
        Integer studentId;
        do{
            System.out.println("Student Name");
            studentName = input.nextLine();
            if (!studentName.equals("")) {
                System.out.println("Student ID");
                studentId = input.nextInt();
                students.put(studentName, studentId);
                input.nextLine();
            }
        } while (!studentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }
}

