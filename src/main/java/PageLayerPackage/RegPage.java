package PageLayerPackage;

import org.openqa.selenium.By;

import BaseLayer.BaseClassFB;

public class RegPage extends BaseClassFB{
	
	By firstname=By.name("firstname");
	By lastname=By.name("lastname");
	By emailid=By.name("reg_email__");
	
	public RegPage() {
		this.driver=driver;
	}

	public void regfunctionality(String fname, String lname, String email) {
		
		 driver.findElement(firstname).sendKeys(fname);
		 driver.findElement(lastname).sendKeys(lname);
		 driver.findElement(emailid).sendKeys(email);
	}
}
