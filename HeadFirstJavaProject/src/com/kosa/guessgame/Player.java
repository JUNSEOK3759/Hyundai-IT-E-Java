package com.kosa.guessgame;

public class Player {
	private int number;
	
	public void guess() {
		this.number = (int) Math.random() * 10;
		System.out.println("ㅇㄴ" + this.number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
