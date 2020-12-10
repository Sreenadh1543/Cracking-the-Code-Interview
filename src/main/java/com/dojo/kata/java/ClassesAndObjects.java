package com.dojo.kata.java;

import java.io.*;
import java.util.*;
class Register {

    private static Register register = null;

    private Register(){

    }

    Map registerList = new HashMap<String,Double>(){
        {
            put("apple",2.0);
            put("orange",1.5);
            put("mango",1.2);
            put("grape",1.0);
        }
    };
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */

    public String getTotalBill(Map<String,Integer> itemDetails) {

        double totalBill =0;
        if(!itemDetails.keySet().isEmpty()){
            for(String key : itemDetails.keySet() ){
                if(itemDetails.get(key)>0 && registerList.get(key)!=null)
                    totalBill+= itemDetails.get(key)*(double)registerList.get(key);
            }
        }


        return String.valueOf(totalBill);
    }

    public static Register getInstance(){
        if(register==null){
            return new Register();
        }
        return register;
    }

}

public class ClassesAndObjects {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input=readInput.nextLine().split(" ");
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
            myItems.put(input[i],Integer.parseInt(input[i+1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}
