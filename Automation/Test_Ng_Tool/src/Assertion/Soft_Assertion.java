package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	//Soft-Assert strict level comparison
		@Test
		public void comparison() {
			String actualname ="Nagul";
			String expectedname = "nagul";
			SoftAssert sf = new SoftAssert();
			sf.assertEquals(actualname, expectedname);
			System.out.println("Both are same!");
			sf.assertAll();
	}
		
		//Soft-Assert contains level comparison
		@Test
		public void containsComparison() {
			String actualname = "Meera";
			String expectedname = "Mee";
	        SoftAssert sf1 = new SoftAssert();
	        sf1.assertTrue(actualname.contains(expectedname));
	        System.out.println("Partial-name is present!");
	        sf1.assertAll();
}}
