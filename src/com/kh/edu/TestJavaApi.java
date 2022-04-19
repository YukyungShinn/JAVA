package com.kh.edu;
import java.util.*;
public class TestJavaApi {
	public static void main(String[] args) {
		
		Date date=new Date();
		int month=date.getMonth()+1;
		System.out.println(date.getYear()+1900+"/"+month+"/"+date.getDate());
		//Deprecated 
	
		//java.util.Calendar
		//static 키워드가 있는 메소드는 클래스이름.메소드명() 호출해야 한다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)+"/"+
		((cal.get(Calendar.MONTH)+1)+"/")+
		(cal.get(Calendar.DATE)));
		
		//java.time API 

	}
	
}
