package Test_ng_pgms;

import org.testng.annotations.Test;

public class Priority_order {
	@Test(priority=1)
	public void ceateUser() {
		System.out.println("User created");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("login done !");
	}
	@Test(priority=3)
	public void modifyUser() {
		System.out.println("User modified");
	}
	@Test(priority=4)
	public void deleteUser() {
		System.out.println("User deleted");
	}
	@Test(priority=5)
	public void logout() {
		System.out.println("User logout");
	}

}
