package gitproject.projectgit;

import org.testng.annotations.Test;

public class test3 {
	
	@Test(priority=2)
	
		
		public void login() {
			
			System.out.println("login method");
		}
	
	@Test(priority=1)
	
	
	public void register() {
		
		System.out.println("register method");
	}
	

}
