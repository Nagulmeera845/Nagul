package By_xpath_Scripts;

public class Execution_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

Login_Actitime_With_by_xpath lac=new Login_Actitime_With_by_xpath();
		
		lac.launchBrowser();
		Thread.sleep(3000);
		
		lac.logincredentials();
		Thread.sleep(3000);
		
		lac.execution();
		Thread.sleep(3000);
		lac.close();
	}

}
