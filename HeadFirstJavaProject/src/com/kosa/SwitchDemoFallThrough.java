package com.kosa;

import java.util.ArrayList;

public class SwitchDemoFallThrough {
	
//	public static int addNumbers(int a, int b) { // 여기서 a와 b는 formal parameter
//		return a + b;
//	}

    public static void main(String[] args) {
    	
//    	int ret = addNumbers(100, 200); // 100, 200은 actual parameter
    	
        ArrayList<String> futureMonths = new ArrayList<String>();
        // 여기서 <>를 generic이라고 하고 그 안에 들어가는 값은 formal parameter이다.
        // 즉 formal parameter는 어떤 값이 들어올지 모른다. 이 값안에 들어가는 것이 actual parameter이다.
        
        // generic을 쓰는 이유는 코드 내부의 버그가 덜 포함되게 하기 위해 쓴다.
        int month = 1;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.print(monthName + " ");
            }
        }
    }
}