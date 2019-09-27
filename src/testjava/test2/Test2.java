/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.abs;

/**
 *
 * @author Anastasia
 */
public class Test2 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        double number1;
        double number2;
        do{
        System.out.print("Введите два целых числа: ");
       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number1 = Double.parseDouble(reader.readLine());
        number2 = Double.parseDouble(reader.readLine());
               
        if (number1 != (int)number1 || number2 != (int)number2) System.out.println("Вы ввели не целое число");
        else{
                System.out.println("Наибольший общий делитель:" + nod(number1, number2));
                System.out.println("Наименьшее общее кратное: " + noc(number1, number2));
                }
        }
        
        
        while((number1 != (int)number1) && (number2 != (int)number2));
       
    /**
     *
     * @param number1
     * @param number2
     * @return
     */
        
}
 public static int nod(double number1, double number2){
        int modulo;
        while (number2!=0) {
        modulo = (int) (number1 % number2);
        number1 = number2;
        number2 = modulo;        
        }
        return (int) abs(number1);
 }    
 
 public static int noc(double number1, double number2){
    int noc =  (int) (number1 / nod(number1,number2) * number2);
    return noc;
}
}
