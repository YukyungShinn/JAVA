package kh.java.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner
 * -사용자 키보드 입력값을 읽어오는 객체
 * 
 * 1. next계열 메소드
 * 	- next()
 * 	- nextInt()
 *  - nextDouble()
 *  - nextBoolean()
 *  - ...
 *  - 단, nextChar()는 없다.
 *
 *
 * - 실제 값 이전에 만난 공백/개행문자는 무시하고, 공백/ 개행문자 전까지만 읽어온다.
 *
 * 2. nextLine계열 메소드
 *  - 개행문자까지 읽어와서 개행문자를 버리고 반환
 * 
 */
public class ScannerStudy {
	public static void main(String[] args) {
		
		ScannerStudy study=new ScannerStudy();
		//study.test1();
		//study.test2();
		study.test3();
	}
	/**
	 * 사용자로부터 이름, 생년, 월, 일을 입력받고 다음과 같이 출력하세요.
	 *  - 이름 : 신사임당
	 *  - 출생일 : 1999년 9월 9일
	 *  
	 */
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=sc.next();
		System.out.print("출생년도 입력: ");
		int year=sc.nextInt();
		System.out.print("출생달 입력: ");
		int month=sc.nextInt();
		System.out.print("출생일 입력: ");
		int day=sc.nextInt();
		System.out.println("- 이름 : "+name);
		System.out.println("- 출생일 : "+year+"년 "+month+"월 "+day+"일");
	}
	/**
	 * nextLine 공백이 있는 문자열 처리
	 * 
	 * - next계열 메소드 사용 직후 nextLine 사용하고자 한다면,
	 *   개행문자 날리기용 nextLine 삽입해야 한다.
	 */
	public void test2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=sc.next();
		
		sc.nextLine();//개행문자 날리기용
		
		System.out.print("주소 입력 : ");
		String addr=sc.nextLine();
		
		System.out.printf("이름 : %s%n", name);
		System.out.printf("주소 : %s%n", addr);
		
	}
	
	/**
	 * System.in 표준입력 - 키보드입력
	 * 
	 * - 사용자 입력값은 무조건 문자열로 읽어온다.
	 */
	public void test1() {
		
		Scanner sc=new Scanner(System.in);//자동 import : Ctrl+Shift+O
//		System.out.println("이름을 입력하세요 : ");
//		String name = sc.next();//무조건 문자열로 읽어옴
//		System.out.printf("안녕하세요~[%s]님~ %n",name);
//		
//		System.out.println("무슨 공부 중이세요? : ");
//		String subject = sc.next();
//		System.out.printf("%s(을)를 공부 중이시군요.%n",subject);
//		System.out.println("나이를 입력하세요 : ");
//		int age = sc.nextInt(); //사용자의 입력값을 읽어서 정수형으로 변환 후 반환
//		System.out.printf("[%d]살이시군요...", age);
		
//		System.out.print("키를 입력하세요 (예: 177.3) : ");
//		double height = sc.nextDouble();
//		System.out.printf("%.1fcm%n",height);
//		
//		System.out.print("결혼여부 (true | false): ");
//		boolean b=sc.nextBoolean();
//		System.out.printf("결혼여부 (%b)%n",b);
		
//		System.out.print("성별 (남/여): ");
//		String temp= sc.next();
//		char gender=temp.charAt(0);//String의 첫번째 문자만 가져옴. String-> char
//		System.out.printf("당신은 [%c]자이군요...%n",gender);
		
	}
}
