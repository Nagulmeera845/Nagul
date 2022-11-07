package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Hard_Assertion {

		// TODO Auto-generated method stub
		//hard-assert strict level comparison
		@Test
		public void comparison() {
			String actualname ="Nagul";
			String expectedname = "nagul";
	   Assert.assertEquals(actualname, expectedname);
		System.out.println("Both are same");
		}
		
		//hard assert contains level comparison
		@Test
		public void containsComparison() {
			String actualname = "Meera";
			String expectedname = "Mee";
			Assert.assertTrue(actualname.contains(expectedname));
			System.out.println("partial-name is present!");
	}

}
