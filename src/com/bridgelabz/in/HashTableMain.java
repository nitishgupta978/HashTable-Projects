package com.bridgelabz.in;

public class HashTableMain {
	public static void main(String[] args) {
        Implementation<String, Integer> hashImpl = new Implementation();
        String message = "To be or not to be";

        
        String[] messageArray = message.toLowerCase().split(" ");

        for(String word: messageArray) {
            
            Integer value =  hashImpl.get(word);
            
            if( value == null) {
                value = 1;
            }
            else {
               
                value = value + 1;
            hashImpl.add(word , value);
        }
        System.out.println(hashImpl);
    }
}
}