package com.dojo.kata.interviewcake.wordcloud;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isLetter;

public class WordCloudData {


    public static void main(String[] args) {
        System.out.println(new WordCloudData("we conquered... Hi Hello hi hello jean-luc.").getWordCloud());
    }

    private Map<String, Integer> wordCloud = new HashMap();


    public Map<String, Integer> getWordCloud() {
        return wordCloud;
    }

    /*
     inputSentence

     */

    public WordCloudData(String inputSentence) {
        splitWordsAndPopulateWordCloud(inputSentence);

    }


    //Split Sentences into words for reasonable accuracy than just splitting with spaces
    private void splitWordsAndPopulateWordCloud(String inputSentence) {

        int wordStartIndex = 0;
        int wordLength = 0;

        for (int i = 0; i < inputSentence.length(); i++) {
            char character = inputSentence.charAt(i);
            /*
              If we are at the end of the sentence and end is a letter increment word count and extract word
             */
            if (i == inputSentence.length() - 1) {
                if (isLetter(character))
                    ++wordLength;
                if (wordLength > 0) {
                    String extractedWord = inputSentence.substring(wordStartIndex, wordLength + wordStartIndex);
                    populateWordCloud(extractedWord);
                }
            } else if (isLetter(character)) {
                if (wordLength == 0) wordStartIndex = i;
                ++wordLength;
            } else if (character == '-') {
                if (i > 0 && isLetter(inputSentence.charAt(i - 1)) && isLetter(inputSentence.charAt(i + 1))) {
                    if (wordLength == 0) wordStartIndex++;
                    ++wordLength;
                }
            } else if (character == '.') {
                if (i < inputSentence.length() - 1 && inputSentence.charAt(i + 1) == '.') {
                    if (wordLength > 0) {
                        String extractedWord = inputSentence.substring(wordStartIndex, wordLength + wordStartIndex);
                        populateWordCloud(extractedWord);
                        wordLength = 0;
                    }
                }
            } else {
                if (wordLength > 0) {
                    String extractedWord = inputSentence.substring(wordStartIndex, wordLength + wordStartIndex);
                    populateWordCloud(extractedWord);
                    wordLength = 0;
                }
            }
        }

    }

    //Method to add data to hash map and merge the words in capital or small letters
    private void populateWordCloud(String word) {

        /*
          First Verify if word is directly available in hashmap
        */
        if (wordCloud.containsKey(word)) {
            wordCloud.put(word, wordCloud.get(word) + 1);
        }
        /*
          Second verify if lower case word is available in hash map
          if so our word is upper case then increment lower case with one
         */
        else if (wordCloud.containsKey(word.toLowerCase())) {
            wordCloud.put(word.toLowerCase(), wordCloud.get(word.toLowerCase()) + 1);
        }

        /*
           First verify if capitalized word is available in hashmap
           then word in lowercase do not exist and it exists only in upper case
           so increment capitalized word with 1
        */
        else if (wordCloud.containsKey(capitalizeWord(word))) {
            wordCloud.put(word, wordCloud.get(capitalizeWord(word)) + 1);
            wordCloud.remove(capitalizeWord(word));
        }
          /*
          the else case would be word doesn't exist so add for fresh
          */
        else {
            wordCloud.put(word, 1);
        }
    }

    //To Capitalize the first letter in word to check its availability
    private String capitalizeWord(String word) {
        return new StringBuilder().append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).toString();
    }

}
