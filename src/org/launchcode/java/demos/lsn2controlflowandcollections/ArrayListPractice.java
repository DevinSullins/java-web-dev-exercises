package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        //initialization of necessary variables
        ArrayList<String> strings = new ArrayList<>();
        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = paragraph.split(" ");

        //for loop to fill strings ArrayList from paragraph WITHOUT punctuation
        for(String word : words){

       /*     if(word.contains(".")){
                String updatedWord = word.replace(".","");
                strings.add(updatedWord);
                //continue;
            } else if(word.contains(",")){
                String updatedWord = word.replace(",","");
                strings.add(updatedWord);
                //continue;
            } else {
                strings.add(word);
            }*/

            String removePeriod = word.replace(".","");
            String removeComma = removePeriod.replace(",","");
            strings.add(removeComma);
        }
        //System.out.println(words[2]); <<leaving this here to remind myself not to be dumb
        //System.out.println(strings.get(2)); <<the test I should have been running for the last 30 minutes

        //get num of letters
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        Double numOfLetters = input.nextDouble();

        //print words
        for(int i = 0; i < strings.size(); i++){
            if(strings.get(i).length() == numOfLetters){
                System.out.println(strings.get(i));
            } else if(strings.get(i).length() == numOfLetters + 1){
                if(strings.get(i).contains(".")){
                    System.out.println(strings.get(i));
                }
            }
        }


        /*ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(5);
        integers.add(6);
        integers.add(17);
        integers.add(12);
        integers.add(51);
        integers.add(104);
        integers.add(10);
        integers.add(5);
        integers.add(3);
        integers.add(7);
        integers.add(8);
        integers.add(4);
        integers.add(9);
        integers.add(1);
        integers.add(3);
        for(int i = 0; i < integers.size(); i++){
            if (integers.get(i) % 2 == 0){
                System.out.println(integers.get(i));
            }
        }*/
    }
}
