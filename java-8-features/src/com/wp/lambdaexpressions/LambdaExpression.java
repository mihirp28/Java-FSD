package com.wp.lambdaexpressions;

interface Scanner{
	public void scan();
}

interface Calculator{
	public int calculate(int a, int b);
}

interface PlayGame{
	void play(String gameName);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner() {
//			public void scan() {
//				System.out.println("Scanning images..");
//			}
//		};
//		
		
		Scanner scanner = () -> System.out.println("Scanning images..");
		scanner.scan();
		
		Calculator calc = (x,y) -> x+y;
		
		Calculator largestCalc = (x,y)->{
									if(x>y) {
										return x;
									}
									return y;
								};
		
		System.out.println(calc.calculate(5, 10));
		
		System.out.println(largestCalc.calculate(25, 10));
		
		PlayGame obj = game -> System.out.println("Playing "+game);
		
		obj.play("Cricket");

	}

}
