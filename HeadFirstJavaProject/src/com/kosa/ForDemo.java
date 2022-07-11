package com.kosa;

public class ForDemo {

	public static void main(String[] args) {
		
		// 해당 코드 블럭 내에서 선언한 변수는 해당 코드 블럭에서만 사용이 가능하다.
		int no = 0;
		for (int i = 1; i < 11; i++) {
			System.out.println("Count is : " + i);
			no = i;
		}
		System.out.println("Count is : " + no);
		
	}

}
