package Test_ng_pgms;

import org.testng.annotations.Test;

public class Execute_Testcase_Morethan_onetime {
	@Test(invocationCount = 5)
	public void createUser() {
		System.out.println("User created");
	}
	@Test
	public void modifyUser() {
		System.out.println("User modified");
	}
	@Test
	public void deleteUser() {
		System.out.println("delete user");
}
}