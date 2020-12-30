package com.dojo.kata.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegEx
{

    public String findCardTypeNumbers(String conversation, String cardType)
    {
        Pattern p = Pattern.compile("\\d+");
        Matcher m=p.matcher(conversation);
        List<String> cardNumbers = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        while (m.find()){
            cardNumbers.add(m.group());
        }

        List<String> outputList = cardNumbers.stream().filter(value -> filterCardsPerType(value, cardType)).collect(Collectors.toList());

        if(outputList.size()>0){
            outputList.forEach(value -> {
                output.append(value).append(" ");
            });
        }else{
            if("American Express".equalsIgnoreCase(cardType)) {
                output.append("");
            }else {
                output.append("Not a valid card type");
            }
        }


        return output.toString().trim();
    }

    private boolean filterCardsPerType(String cardNumber,String cardType){
        if("Visa".equalsIgnoreCase(cardType)){
            return cardNumber.startsWith("4") && ((cardNumber.length()==13) || (cardNumber.length()==16));
        }else if("American Express".equalsIgnoreCase(cardType)){
            return (cardNumber.startsWith("34") || cardNumber.startsWith("37")) && ((cardNumber.length()==15));
        }else if("Discover".equalsIgnoreCase(cardType)){
            return (cardNumber.startsWith("6011") || cardNumber.startsWith("65")) && ((cardNumber.length()==16));
        }else if("jcb".equalsIgnoreCase(cardType)){
            return ((cardNumber.startsWith("2131") || cardNumber.startsWith("1800")) && (cardNumber.length()==15)) ||
                    ((cardNumber.startsWith("35"))&& (cardNumber.length()==16));
        }
        return false;
    }
}