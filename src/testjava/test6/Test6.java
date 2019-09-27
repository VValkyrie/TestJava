/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava.test6;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author Anastasia
 */
public class Test6 {
     public static void main(String[] args) {
        
    int number, volume;
    System.out.println("Введите объем рюкзака:");
    Scanner sc = new Scanner(System.in);
    volume = sc.nextInt();
    System.out.println("Введите количестов предметов:");
    number = sc.nextInt();
    
    int[] weight = new int[number];
    int[] cost = new int[number];
    
    for(int i = 0; i<number; i++){
        System.out.println("Осталось " + (number-i) + " предметов");
        System.out.println("Введите вес предмета: ");
        weight[i] = sc.nextInt();
        System.out.println("Введите стоимость предмета: ");
        cost[i] = sc.nextInt();
    }
    int[] array = new int[volume+1];
        array[0] = 0;
        for(int i=1; i<=volume; ++i) {
            array[i] = array[i-1];
            for(int j=0; j<number; ++j)
                if (weight[j]<=i)
                    array[i] = max(array[i], array[i-weight[j]] + cost[j]);
        }
        int maxCost = array[volume];
    System.out.println("Наибольшая стоимость выбранных вещей равна" + maxCost);
    
}

}
