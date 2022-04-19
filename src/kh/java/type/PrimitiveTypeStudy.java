package kh.java.type;

/**
 * 변수란? 메모리상의 하나의 값을 기록할 수 있는 공간
 * 1. 기본형 Primitive Type 실제 값을 저장
 * 		-논리형 boolean(1byte)
 * 		-문자형 char (2byte)
 * 		-정수형
 * 			-byte (1byte)
 * 			-short (2byte)
 * 			-int (4byte)
 * 			-long (8byte)
 * 		-실수형
 *  		-float (4byte)
 *  		-double (8byte)
 * 2. 참조형 Reference Type 특정 주소 값을 저장
 * 		- 기본형 8가지를 제외한 모든 자료형
 * 		- 4byte
 *
 * 
 */

public class PrimitiveTypeStudy {

	public static void main(String[] args)
	{
		PrimitiveTypeStudy study = new PrimitiveTypeStudy();
		study.test1();
		study.test2();
	}
	/**
	 * Data Overflow
	 * -각 타입별 최대값을 넘어서면 최소값으로 떨어지는 현상
	 */
	public void test4() {
		//대입연산자 : 좌항의 공간에 우항의 값을 대입하라
		int i = Integer.MAX_VALUE;
		i=i+1;
		System.out.println(i);
	}
	/**
	 * 상수 Constant Variable
	 * - 한번 값이 지정되면 값변경이 불가하고, 읽기전용인 변수
	 * - 변경되서는 안되는 값을 지정. 변경할 필요가 없는 것들도 상수로 지정가능.
	 */
	public void test2() {
		final int age;
		age=20;
		//age=21;
		
		//jdk 상수
		System.out.println("byte : "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
        System.out.println("short : "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
        System.out.println("int : "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
        System.out.println("long : "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
	}
	
	public void test1() {
		//1.선언
		boolean bool;
		char ch;
		byte bnum;
		short snum;
		int i;
		long lnum;
		float fnum;
		double dnum;
		
		//2.값대입
		//=대입연산자 : 우항의 값을 좌항의 공간에 대입
		bool=true;
		ch='a';
		ch='b';
		bnum=100;
		snum=30000;
		i=999999999;
		lnum=2100000000000L; //int 범위 밖의 수는 L을 붙여준다. 
		fnum=0.1234567890f; //int 범위 밖의 수는 f(F)를 붙여준다.
		dnum=0.12345678901234567890; //유효자리수가 16개라서 출력값이 ~~68
		
		//3. 출력
		System.out.println(bool);
		System.out.println(ch);
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(i);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
	}
}
