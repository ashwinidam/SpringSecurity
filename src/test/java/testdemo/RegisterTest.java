package testdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.scp.java.beans.Registration;
import com.scp.java.service.LoginService;


public class RegisterTest {
	@Test
	public void addUserTest()
	{	Registration r=new Registration("Meera", "meerr", "M@gmail.com", 565544, "Meera S R");
		LoginService l=new LoginService();
		int val=l.addUser(r);
		Assert.assertEquals(val, 1);
		
		
		
	}

}

