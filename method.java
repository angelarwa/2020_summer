package chap06;

public class method {

	public static void main(String[] args) {
		//Calculator
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		myCalc.plus(10, 20);
		int result1 = myCalc.plus(10,20);
		System.out.println(result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println(result2);
		System.out.println();
		
		myCalc.execute();
		
		double result6 = myCalc.areaRectangle(10);
		double result7 = myCalc.areaRectangle(10,20);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println();

		
		//Computer
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int result3 = myCom.sum1(values1);
		System.out.println(result3);
		
		int result4 = myCom.sum1(new int[] {1,2,3});
		System.out.println(result4);
		
		int result5 = myCom.sum2(1,2,3);
		System.out.println(result5);
		
		
	}

}
