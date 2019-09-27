/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Anastasia
 */
public class Test1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
     // TODO code application logic here
     
     double num;
     do{
        System.out.print("Введите целое число: ");
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num = Double.parseDouble(reader.readLine());
                
        
       if (num != (int)num) System.out.println("Вы ввели не целое число");
     }
     while((num%1)!=0);
     
     
     if(num == 1 && num == 3){
         System.out.println("Введенное число простое, нечетное");
     }
     
     if(num == 2){
         System.out.println("Введенное число простое, четное");
         
     }
     
     for(int i = 2; i<num; i++){
         if(num !=2 & i == 2 & num%i==0){ System.out.println("Введенное число четное, составное"); 
         break;}
         else if(num%i==0) {
         System.out.println("Введенное число нечетное, составное"); 
         break;}
         else System.out.println("Введенное число нечетное, простое");
         break;
              
     }
     
    }
   
}
  


