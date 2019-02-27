package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;


public class Demo extends BaseTest  {

	@Test
	public void testDemo() {
		Reporter.log("hello");
		Reporter.log("demo", true);
		Reporter.log("test", false);
		Reporter.log("bye");
		
	}
}
//https://github.com/hemanth7272/repository2.git