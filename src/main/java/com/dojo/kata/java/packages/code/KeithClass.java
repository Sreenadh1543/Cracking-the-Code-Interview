package com.dojo.kata.java.packages.code;

import com.dojo.kata.java.packages.code.string.ExtractString;

public class KeithClass {

    public static void main(String[] args) {
        String input = "Hi, how are you 742 Is Alice there? B: 1104 Speaking. What's up? A: Why haven't you answered 1537 the phone? B: My bad, I had two chores to do. A: That's all right. B: What was the reason for your call? A: I want to do something tomorrow with you. B: Sounds good. What did you have in mind? A: I was thinking about seeing a one movie. B: Okay, let's go see a movie. A: Until then. B: Talk to you later.";
        System.out.println("Secret Code"+getInput(input).hashCode());
    }



    public static String getInput(String conversation){
        return ExtractString.extractDigitsInNumericFormAndKeithComposite(conversation)+
                ExtractString.addDigitsInTextForm(conversation);
    }

}
