/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava.test5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Anastasia
 */
public class Test5 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int num;
        int temp;
        int counter = 0;
        int n;
        do{
        System.out.println("Введите размер последовательности N (не более 100): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(reader.readLine());
        if(n>100) System.out.println("Вы ввели слишком большое N, размер последовательности не может быть больше 100");
        }
        
        while (n >100) ;           
        
        for(int i = 1;i <= n; ++i){
        temp = i; num = 0;
        while(temp>0){
            num = num * 10 + (temp%10);
            temp /= 10;
        }
        
        if(num == i && num >10){ 
         System.out.println(i);
         counter++;
        }
    }
        if(counter == 0) System.out.println("Числа-палиндромы не найдены");      
        
    }
    
}
