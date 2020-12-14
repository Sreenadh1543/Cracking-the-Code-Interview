package com.dojo.kata.java;

import com.dojo.kata.java.code.string.ExtractString;

public class KeithClass {

    public static void main(String[] args) {
        String input = "A:Hello,Priya 3 speaking. Is this Aditi?B:Yeah Priya! I am there 28.A:How are you dear three?B:I am fine 19. What about you priya 75?A:Glad to bear that! Me too fine! seven. Aditi how are your five holidays going?B:Great Priya! I am enjoying well!";
        System.out.println("Secret Code"+getInput(input));
    }



    public static String getInput(String conversation){
        return ExtractString.extractDigitsInNumericFormAndKeithComposite(conversation);
    }

}
