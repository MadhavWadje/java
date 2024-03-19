package Com.hrms.TestScript11;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib11.General11;

public class TC001 {
	@Test
	public void maddy()throws Exception {
//	public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("Log4j.xml");

General11 obj=new General11();
obj.openappln();
 obj.login();
 obj.Enterframe();
 obj.Add();
 obj.Edit();
 obj.Delete();
 obj.outframe();
 Thread.sleep(2000);
obj.logout();
obj.closeappln();
	}
}

