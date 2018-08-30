package org.vexelon.net.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		// Using interface implementation
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		// Using anonymous class
		Greeting innerClassGreeting = new Greeting() {
			
			public void perform() {
				System.out.println("Hello world");
				
			}
		};
		
		greeter.greet(innerClassGreeting);
		
		// Using lambda expression
		Greeting lambdaGreeting = ()->System.out.println("Hello world");
		
		greeter.greet(lambdaGreeting);
	}

}
