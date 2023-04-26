import java.util.*;

package org.example;
public class Main {
    public static void main(String[] args) {
        splitIngredients("sugar, butter, butter, milk, hazelnuts, flour, eggs");
        splitIngredients("sand, water, cement, gravel, rocks");
    }

    public static void splitIngredients(String ingredients) {
        var words = ingredients.split("( |,)");
        var setOfWords = new TreeSet<String>();
        for (var word : words) {
            if (word.equals("")) continue;
            var cleanWord = word.replaceAll(",", "");
            setOfWords.add(capitalizeFirst(cleanWord));
        }
        System.out.println("Separated ingredients are:");
        for (var word : setOfWords) {
            System.out.println(word);
        }
    }
    public static String capitalizeFirst(String input) {
        var firstLetter = input.substring(0, 1);
        var otherLetters = input.substring(1);
        return firstLetter.toUpperCase() + otherLetters;
    }
}