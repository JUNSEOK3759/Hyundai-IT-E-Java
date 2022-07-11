package com.kosa;

import java.util.Scanner;

class IfElseDemo {
    public static void main(String[] args) {

    	System.out.println("시험 점수 입력 : ");
    	
    	Scanner in = new Scanner(System.in);
    	int testscore = in.nextInt();
    	char grade;
    	
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        
        in.close();
    }
}