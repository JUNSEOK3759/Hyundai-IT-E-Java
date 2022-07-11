package com.kosa.dog;

public class DogTestDrive {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		//이제 bark, setSize, getSize의 버튼 3개가 생겼다고 볼 수 있다.
		
		// dog.size = 40; // size가 private로 선언되어 있기에 사용할 수 없다.
		dog.setName("와이");
		dog.setSize(40);
		System.out.println(dog.getName() + "의 사이즈는 " + dog.getSize());
		dog.bark();
		Dog arrow = new Dog();
		arrow.setSize(100);
		System.out.println(arrow.getSize());
	}
}
