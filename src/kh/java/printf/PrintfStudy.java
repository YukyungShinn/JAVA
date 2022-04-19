package kh.java.printf;

public class PrintfStudy {
	public static void main (String[] args) {
		
		PrintfStudy study=new PrintfStudy();
		study.test1();
	}
	
	/**
	 * System.out.printf(포맷문자열, 요소1, 요소2, ...)
	 * -포맷문자열안의 패턴문자를 전달한 값으로 치환 후 출력
	 * 
	 * %d 정수
	 * %f 실수 : 기본적으로 소수점이하 6자리 표현 %.1f -> 반올림해서 소수점이하 첫번째 자리까지.
	 * %b 논리형
	 * %c 문자
	 * %s 문자열
	 * 
	 * %n \n 개행문자(값으로 치환하는 것 아님)
	 * %% escaping처리 %을 문자표현
	 */
	public void test1() {
		int a=3;
		int b=7;
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.printf("%d * %d = %d%n", a, b, (a*b));
		
		int n=10;
		double dnum=10.0;
		System.out.printf("%d == %.1f 의 결과는 %b입니다.%n",n,dnum,(n==dnum));
		
		char ch='a';
		int num=97;
		System.out.printf("%c == %d 의 결과는 %b입니다.%n",ch,num,(ch==num));
		
		//너비 %10s 10byte 공간에 값을 대입(기본 우측정렬) -10s 는 좌측정렬
		//정렬
		//이름	나이	성별
		System.out.printf("%10s%10s%10s%n","이름","나이","성별");
		}
}
