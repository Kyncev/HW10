package org.example;
import java.util.HashSet;
import java.util.Set;
public class UniqueWords {
    public static void printUniqueWords(String str){
        String[] words = str.replaceAll("[^a-zA-Z]", "").split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words){
            uniqueWords.add(word);
        }
        for (String word : uniqueWords){
            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1) + " ");
        }
    }
}
