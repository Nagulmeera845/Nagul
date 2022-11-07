package Test_ng_pgms;

import org.testng.annotations.Test;

public class Dependcy {
	@Test(enabled = true)
    public void login() {
			System.out.println("login successfull !");
      }
		@Test(dependsOnMethods = "login")
		public void createUser() {
			System.out.println("user created");
			}
		@Test(dependsOnMethods = "login")
		public  void logout() {
			System.out.println("logout done!!");
}}
