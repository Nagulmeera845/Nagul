package Group_Execution;

import java.io.FileInputStream;
import java.util.Properties;

public class Data_Utility {
	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\Excel\\actitme.propeties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(data);
	}

}
