/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Test3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String sentence;
        System.out.println("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        sentence = sc.nextLine();
        
        String[] words = sentence.replaceAll("[-.?!)(,:]", "").split("\\s");
        
        //разбиваем предложение на слова, не считая знаки препинания частью слова
        //слова записываются в массив строк
        
        int counter=0;
        for(String i : words){
            if(words !=null) counter++;
        }    
        System.out.println("Количество слов в предложении: " + counter);
        
        System.out.println("Слова в предложении в отсортированном виде: " + sort(words));
           
        ArrayList upperLeter = new ArrayList();
        for(String word : words){
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        upperLeter.add(word);
        }
        System.out.println("Слова с первой заглавной буквой: " + upperLeter);
       
}

public static List sort(String [] words){
        List listStrings = new ArrayList<String>(words.length);
        Collections.addAll(listStrings, words);
        
        Collections.sort(listStrings);
        
        return listStrings; 
    }    
}


