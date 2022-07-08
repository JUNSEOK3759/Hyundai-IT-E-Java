package kr.or.sw.q2.ins;

public class BicycleDemo {
    public static void main(String[] args) {

    	Bicycle bike1 = new Bicycle();
    	bike1.printStates();
    	
    	
//    	// 자바는 모든 코드를 클래스에 담아서 객체화하여 실행하는 것이 원칙이다.
//    	// 하지만 이러다보면 풀리지 않는 것들이 있기에 static을 사용한다.
//    	int ret = Calculator.add(100, 100);
//    	System.out.println(ret);
//    	
//    	System.out.println(Calculator.add(100, 100));
//    	
    	
    	
    	
//    	// static이 앞에 있으면 아래와 같이 선언할 수 있다.
////    	Bicycle.changeCadence(100);
////    	Bicycle.cadence = 1000;
//    	//static이 앞에 없담녀 아래와 같이 선언해도 빨간줄이 뜬다.
////    	Bicycle.speed = 100;
//    	
//        // Create two different 
//        // Bicycle objects
//        Bicycle bike1 = new Bicycle();
//        Bicycle bike2 = new Bicycle();
//        Bicycle bike3 = bike1;
//
//        // Invoke methods on
//        // those objects
//        bike1.changeCadence(50);
//        bike1.speedUp(10);
//        bike1.changeGear(2);
//        bike3.speedUp(10);           // bike3�� �߰��ϴ��� bike1�� ���� ������ �ش�.
//        bike1.printStates();
//
//        bike2.changeCadence(50);
//        bike2.speedUp(10);
//        bike2.changeGear(2);
//        bike2.changeCadence(40);
//        bike2.speedUp(10);
//        bike2.changeGear(3);
//        bike2.printStates();
    }
}
