package kh.java.string;

public class StringStudy {
	public static void main(String[] args) {
		
		StringStudy study;
		study = new StringStudy();
		study.test1();
	}
	/**
	 * String 
	 * - 참조형
	 * - 리터럴을 직접 대입할 수 있는, 기본형처럼 사용가능한 참조형
	 */
	public void test1() {
		
		String str = new String("안녕");
		System.out.println(str);
		
		//더하기는 연결 연산
		String str1="기차";
		str1=str1+"칙칙";
		str1=str1+"폭폭";
		System.out.println(str1);
		//다른 타입이랑 더할 시 모두 문자열으로 변환
		str1=str1+123;
		str1=str1+45;
		System.out.println(str1);
		
		System.out.println("abc"+('d'+1));
		System.out.println("abc"+'d'+1);
		System.out.println('a'+1+"bcd");
	}
}
