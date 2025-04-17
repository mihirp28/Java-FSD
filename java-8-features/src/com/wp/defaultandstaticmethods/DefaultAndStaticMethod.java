package com.wp.defaultandstaticmethods;


interface Printer{
	void print();
	
	default void scan() {
		System.out.println("Not Supported Yet..");
	}
	
	public static void swichOn() {
		System.out.println("Printer switched on..");
	}
	
}

class HpPrinter implements Printer{
	
	public void print() {
		System.out.println("Printing with HP Printer..");
	}
	
	public void scan() {
		System.out.println("Scanning with HP printer");
	}
}

class CanonPrinter implements Printer{
	
	public void print() {
		System.out.println("Printing with Canon Printer..");
	}
	
	
}

public class DefaultAndStaticMethod {

	public static void main(String[] args) {
		
//		Printer printer = new CanonPrinter();
//		
//		printer.print();
//		printer.scan();
		
		Printer.swichOn();
		
		
	}
	
}