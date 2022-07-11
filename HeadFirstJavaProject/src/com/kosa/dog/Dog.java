package com.kosa.dog;

public class Dog {
	
	//private가 앞에 붙어있으면 같은 패키지 안에 있어도 다른 클래스가 사용할 수 없다.
	// 따라서 getter setter를 통해 값을 받은 후 이를 출력할 수 있도록 한다.
	private int size;
	private String breed;
	private String name;
	
	public void bark() {
		System.out.println("Ruff! Ruff!");
	}

	public int getSize() {
		return size;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
//	public void setSize(int size) {
//		// this를 붙이면 위의 private int size를 의미한다.
//		// this를 붙이지 않으면 이 함수 안에 있는 int size를 의미한다.
//		this.size = size;
//	}
//	
//	public int getSize() {
//		return this.size;
//	}
	
	
}
