package com.kosa;
// 1 - 5, 2 - 6, 3 - 8, 4 - 2, 5 - 3 
public class PoolPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		while (x < 4) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x > 1) {
				System.out.print(" oyster");
				x = x + 2;
			}
			if (x == 1) {
				System.out.print("noys");
			}
			if (x < 1) {
				System.out.print("oise");
			}
			System.out.println("");
			x = x + 1;
		}
	}

}
