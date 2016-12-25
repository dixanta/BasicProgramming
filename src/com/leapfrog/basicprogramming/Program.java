/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.basicprogramming;

import com.leapfrog.basicprogramming.util.ArrayHelper;
import com.leapfrog.basicprogramming.util.ResultPublisher;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers={78,34,23,1,24,15,4,3};
        
        ArrayHelper helper=new ArrayHelper();
        helper.simpleSort(numbers,true);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        
        
    }
    
}
