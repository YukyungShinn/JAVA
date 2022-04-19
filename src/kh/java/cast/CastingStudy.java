package kh.java.cast;
/**
 * 컴퓨터 작동원리
 * 1. 값(literal)은 같은 자료형의 변수에만 대입할 수 있다.
 * 2. 같은 자료형 사이에서 연산이 가능하다.
 * 3. 같은 자료형간 연산 결과는 동일한 자료형이다.
 * 
 * 형변환
 * 1. 자동(암묵적) 형변환 : 크기가 작은 타입에서 큰 타입으로 변환.
 * 				long에서 float은 float과 double이 지수표현식으로 저장하기 때문.
 * 		byte(1)->short(2)->int(4)->long(8)->float(4)->double(8)
 * 				 char(2)
 * 2. 수동(명시적) 현변환
 */
public class CastingStudy {
	
	public static void main(String[] args) {
		
		CastingStudy study = new CastingStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		study.test4();
	}
	/**
	 * 
	 */
	public void test4()
	{
		System.out.println('A'+0);
		System.out.println('0'+0);//char형 0
		
		byte bnum=125;
		char ch='C';
		int inum=bnum-ch;
		System.out.println(inum);
		
		boolean bool = (2.0==2);
		System.out.println(bool);
		
		bool=(2.0!=2);
		System.out.println(bool);
		
		bool=(2.0==(5/2));
		System.out.println(bool);
		
		bool=('A'=='B'-1);
		System.out.println(bool);
		
		bool=('a'!=97);
		System.out.println(bool);
		
	}
	/**
	 * 예외상황
	 * 1. int보다 작은 자료형(byte, short, char)은 연산시에 무조건 int로 변환
	 * 2. int -> char 로도 암묵적으로 형변환 처리 가능
	 */
	public void test3() {
		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
		
		System.out.println('a'+'A');//char+char => int+int
		System.out.println("1"+'a');
		
		char ch=97;
		System.out.println(ch);
		
		
	}
	/**
	 * 강제형변환
	 * -데이터 손실을 감수하고 형변환
	 * -소수점이하 연산이 필요한 경우
	 * -overflow 방지
	 */
	public void test2() {
		double dnum=23.456;
		System.out.println((int)dnum);//데이터손실 감수하고 소수점이하 버림
		System.out.println(5/(double)2);
		System.out.println((double)5/2);
		int i=5;
		int j=2;
		System.out.println(i*1.0/j); // (int * double) / int
		
		int inum=Integer.MAX_VALUE;
		System.out.println(inum+1L);
	}
	/**
	 * 자동형변환
	 */
	public void test1() {
		
		byte bnum=100;
		int inum=bnum;
		System.out.println(inum);
		
		int i=3;
		double d=3.3;
		System.out.println(i+d);
		
		char ch='a';
		int a = ch;
		System.out.println(a);
		//char -> int 로 변환시에는 아스키코드 테이블 참조 
		System.out.println('A'+100);
	}

}
