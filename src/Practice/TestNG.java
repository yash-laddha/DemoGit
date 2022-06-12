package Practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNG {
    //@Parameter({"URL"})
	@Test
	public void first()     //testcase name
    {
		System.out.println("Hello");
	}
	
    @Test(groups={"Smoke"})
	public void second() 
    {
		System.out.println("Bye");
	}
    
    @BeforeTest
    public void Third() {
    	System.out.println("Scope of this is inside the first module(test) only and it will execute first in that ");
    }
    @AfterTest
    public void fourth() {
    	System.out.println("Scope of this is inside the first module(test) only and It will last in that  ");
    }
    @AfterSuite
    public void fifth() {
    	System.out.println("I will execute last");
    }
	
}
