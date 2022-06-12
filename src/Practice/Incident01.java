package Practice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Incident01 {
	@Test
	 public void practice() {
		 System.out.println("Good");
	 }

	@BeforeSuite
	 public void practice1() {
		 System.out.println("I will execute first");
	 }

}
