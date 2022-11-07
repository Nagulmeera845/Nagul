package Test_ng_pgms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log_class {
    @Test
	public void create() {
		/*
		 * To print only in web element
		 *  Reporter.log("create execution done");
		 *  To print in both web report & console report
		 *  
		 */
    	Reporter.log("create execution done");
    	//Reporter.log("create  user",true);
    	
	}
    @Test
    public void modify() {
    	System.out.println("user modified");
    }
    @Test
    public void deleteUser() {
    	System.out.println("user deleted");
    }
}
