package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayPractice {
    public static void main(String[] args) {
        //string practice
        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] paragraphArrayWords = paragraph.split(" ");
        System.out.println(paragraphArrayWords[1]);
        String[] paragraphArraySentences = paragraph.split("\\.");
        System.out.println(paragraphArraySentences[3].trim());



        //integer practice
        int[] nums = {1, 1, 2, 3, 5, 8};
        for(int num : nums){

            if(num % 2 == 1){
                System.out.println(num);
            }
        }
    }
}
