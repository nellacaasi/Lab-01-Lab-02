package algorithms;

public class HelloWorld implements HelloWorldInterface{
	
	 private String hello;

	 public HelloWorld(){
		 setHello("Hello World!");
	 }
	
	@Override
	public void display(){
		System.out.println("Hello World");
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
