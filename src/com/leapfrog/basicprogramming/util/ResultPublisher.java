/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.basicprogramming.util;

/**
 *
 * @author USER
 */
public class ResultPublisher {

    int passMark = 32,fullMarks=100;
    
    String[] subjects;
    int[] marks;
    
    public ResultPublisher(String[] subjects){
        this.subjects=subjects;
    }
    
    public ResultPublisher(String[] subjects,int[] marks){
        this.subjects=subjects;
        this.marks=marks;
    }

    
    public void setMarks(int[] marks){
        this.marks=marks;
    }
            
            
            
    public double getTotal() {
        double total=0;
       for(int i=0;i<subjects.length;i++){
           total += marks[i];
       }
       return total;
    }

    public boolean isFail() {
        for(int i=0;i<subjects.length;i++){
            if(marks[i]<passMark){
                return true;
            }
        }
        return false;
    }

    public double getPercentage() {
        return (getTotal() / subjects.length) * 100;
    }

    public String getGrade() {
        double p = getPercentage();

        if (p >= 80) {
            return "Distinction";
        } else if (p < 80 && p >= 60) {
            return "First Division";
        } else if (p < 60 && p >= 45) {
            return "Second Division";
        } else if (p < 45 && p > passMark) {
            return "Third Division";
        }
        return null;
    }
}
