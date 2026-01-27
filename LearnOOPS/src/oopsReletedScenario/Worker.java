package oopsReletedScenario;

public class Worker extends Human {

	public  String name;
	public Worker(String name) {
       super(72);
	   this.name=name;

		System.out.println("I am worker");
	}
	
	public void eat() {
		System.out.println("eat anywhere");
	}
	
	
	public  void comeToOfficeOnTime() {
		System.out.println(name+" entry on time");
	}
	
	public  void leaveFromOfficeOnTime() {
		System.out.println(name+" exit on time ");
	}
	
	
	
	
	
	
}
