package com.kh.var;

import java.util.Scanner;

public class Example {
	public void example1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2=sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+num1*num2);
		System.out.println("나누기한 몫 : "+num1/num2);
		System.out.println("나누기 한 나머지 : "+num1%num2);
		
	}
	
	public void example2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로 : ");
		double garo=sc.nextDouble();
		System.out.print("세로 : ");
		double sero=sc.nextDouble();
		double space=garo*sero;
		double dulle=(garo+sero)*2;
		System.out.printf("면적 : %.2f%n",space );
		System.out.printf("둘레 : %.1f%n",dulle);
	}
	
	public void example3() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열(3글자이상)을 입력하시오 : ");
		String word=sc.next();
		char word1=word.charAt(0);
		char word2=word.charAt(1);
		char word3=word.charAt(2);
		System.out.println("첫번째 문자 : "+word1);
		System.out.println("두번째 문자 : "+word2);
		System.out.println("세번째 문자 : "+word3);
		
	}
}
