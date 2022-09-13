package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.addtocartpage;
import pompages.skillrarydemologinpage;
import pompages.skillraryloginpage;

public class testcase1 extends BaseClass 
{
	@Test
	public void tc1() 
	{
		skillraryloginpage s=new skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		utilitis.switchingTab(driver);
		
		skillrarydemologinpage sd=new skillrarydemologinpage(driver);
		utilitis.mousehover(driver, sd.getCoursetab());
		sd.seleniumtraining();
		
		addtocartpage a=new addtocartpage(driver);
		utilitis.doubleclick(driver, a.getAddbtn());
		a.cartbutton();
		
	}
	

}
