package gitproject.projectgit;

import org.testng.annotations.Test;

public class test2 {
  @Test(priority=2)
public void login () {
	  
	  System.out.println("this is login test method");
	 
  }
  
  @Test(priority=1)
  public void register () {
  	  
  	  System.out.println("this is register test method");
  	 
    }
}
