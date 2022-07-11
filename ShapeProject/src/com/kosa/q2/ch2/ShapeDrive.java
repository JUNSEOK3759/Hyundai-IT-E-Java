package com.kosa.q2.ch2;

public class ShapeDrive {

	public static void main(String[] args) {
//		Shape shape = new Shape();
		// shape함수에 abstract를 써주면 new를 사용할 수 없다. 추상클래스이기에 인스턴스를 만들 수 없기에 위의 코드는 오류이다.
		Square square = new Square();
		
		square.rotate();
		square.playSound();
		System.out.println(square.getArea(100, 20));
		
		Triangle triangle = new Triangle();
		triangle.rotate();
		triangle.playSound();
		System.out.println(triangle.getArea(100, 20));
	}
}