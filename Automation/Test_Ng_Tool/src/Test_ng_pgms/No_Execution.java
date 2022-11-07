package Test_ng_pgms;

import org.testng.annotations.Test;

public class No_Execution {
	@Test
    public void createUser() {
			System.out.println("User created");
      }
		@Test
		public void modifyUser() {
			System.out.println("User modified");
			}
		
		@Test(enabled = false)// for don't execute my this particular testcase
		public  void deleteUser() {
			System.out.println("User deleted");
}}
