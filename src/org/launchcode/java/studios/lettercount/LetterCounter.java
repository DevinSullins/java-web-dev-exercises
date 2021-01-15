package org.launchcode.java.studios.lettercount;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;


public class LetterCounter {

    public static void main(String[] args) {
       /* String oldString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        */
        System.out.println("Enter a phrase: ");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();
        char[] charactersInString = myString.toLowerCase().replaceAll("\\W", "").toCharArray();
        HashMap<Character, Integer> characterMap = new HashMap<>();


        for(Character character : charactersInString){
            if(!characterMap.containsKey(character)){
                characterMap.put(character, 1);
            } else {
                Integer newCount = characterMap.get(character) + 1;
                characterMap.put(character, newCount);
            }
        }
        for(Map.Entry<Character, Integer> character : characterMap.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
