package Practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Incident02 {
	@Test
	public void practiceb01() {
		System.out.println("Good Morning");
	}
	
	@Test(enabled=false)         //We will use this attribute when we know there is error in method and we don't want to execute
	public void practice03() {
		System.out.println("Friends");
	}
	
	@Test(timeOut=4000)     //It will wait for 4s same as wait we apply
	public void practicec04() {
		System.out.println("Well");
	}
	
	@Test(dependsOnMethods= {"practicec04","practiceb01"})   //As we know in testng method will run with alphabetical order but if we want to run some method first then we will use dependOnmethod
	public void practicea05() {
		System.out.println("Well done");
	}
	
	@Test(groups={"Smoke"})
	public void practice02() {
		System.out.println("Good afternoon");
	}
	
	@BeforeMethod
	public void bymethod() {
		System.out.println("I will execute before every test method in incident02 class");
	}
	

}
