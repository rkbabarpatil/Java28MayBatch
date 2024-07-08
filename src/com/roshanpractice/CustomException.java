package com.roshanpractice;

public class CustomException {
	public static void main(String[] args) throws ArithmeticException, NullPointerException, CustomChecked {
		//CustomDemo();
		CustomUncheckedDemo();
	}
	static void CustomDemo() throws CustomChecked ,ArithmeticException,NullPointerException{
		int age=17;
		if(age>18) {
			System.out.println("U r Eligible for voting");
		}else {
			throw new CustomChecked("U r not eligible for voting");
		}
	}
	static void CustomUncheckedDemo() {
		int age=17;
		if(age>18) {
			System.out.println("U r Eligible for voting");
		}else {
			throw new CustomUnchecked("U r not eligible for voting");
		}
	}
}
class CustomChecked extends Exception{
	CustomChecked(String str){
		super(str);
	}

}
class CustomUnchecked extends RuntimeException{
	public CustomUnchecked(String str) {
		super(str);
	}
}
