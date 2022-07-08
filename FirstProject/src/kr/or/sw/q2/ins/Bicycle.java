package kr.or.sw.q2.ins;

public class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public static void main(String[] args) {
    	Bicycle bike1 = new Bicycle();
    	bike1.printStates();
    }
    
    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
