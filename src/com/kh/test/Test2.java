package com.kh.test;

import java.util.Scanner;

public class Test2 {
	public static void main (String[] args) {
		String line = "=========================================================================================";
		System.out.printf("%s%n",line);
		String aname="홍길동",bname="홍길순";
		int aAge=22,bAge=20;
		char amf='남',bmf='여';
		String anum="01012341234",bnum="010123412341";
		String amail="hgd@naver.com",bmail="hgs@gmail.com";
		String aaddr="경기도 광주시",baddr="전라남도 광주시";
		System.out.printf("이름	나이	성별	전화번호   	이메일          	주소			%n");
		System.out.printf("%s%n",line);
		System.out.printf("%s	%d	%c   %s	  %s     %s%n",aname,aAge,amf,anum,amail,aaddr);
		System.out.printf("%s	%d	%c   %s  %s     %s%n",bname,bAge,bmf,bnum,bmail,baddr);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소: ");
		String adr=sc.nextLine();
		System.out.print("키: ");
		double cm=sc.nextDouble();
		System.out.print("몸무게: ");
		double kg=sc.nextDouble();
		System.out.print("성별: ");
		String gend=sc.next();
		char gender=gend.charAt(0);
		
		System.out.printf("이름: %s, 나이: %d세, 주소: %s, 키: %dcm, 몸무게: %dkg, 성별:%c%n",name,age,adr,(int)cm,(int)kg,gender);
	}

}
