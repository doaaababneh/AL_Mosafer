package almosafer;

import java.time.Duration;
import java.util.Random;

import javax.xml.namespace.QName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TLogin extends mainpage {
	
	
//	@Test(priority = 1)
//	public void language_is_correct() {
//		String expectedtittle ="Sign in";
//	WebElement currenttittel= driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[3]/button"));
//	
//	String actualtittel = currenttittel.getText();
//	System.out.println(actualtittel);
//	myAssertion.assertEquals(actualtittel, expectedtittle," yas_is_english");
//	myAssertion.assertAll();
//	
//	
//	}
//	@Test(priority = 2)
//	public void currency_is_correct_SAR() {
//		
//		String expected ="SAR";
//		WebElement currentcurrncy=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//		String actulecurrency=currentcurrncy.getText();
//		myAssertion.assertEquals(actulecurrency, expected);
//		myAssertion.assertAll();
//	
//	}
//	
//	@Test(priority = 3)
//		public void logo_is_displayed() {
//		
//		WebElement qitaf = driver.findElement(By.xpath("//div[@class='sc-gNJABI eEaOSW']"));
//		
//		myAssertion.assertEquals(qitaf.isDisplayed(), false,"jjjjj");
//				
//		myAssertion.assertAll();
//	
//	}
////	
//	@Test(priority = 4)
//	public void is_NOT_selected() {
//		WebElement hotel =driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String expected ="false";
//		
//		String actual =hotel.getAttribute("aria-selected");
//		
//		myAssertion.assertEquals(actual, expected,"ooooooooooooo");
//		myAssertion.assertAll();
//		
//	
//	}
//
//	
////
//	@Test(invocationCount = 2)
//	public void Testlanguage() {
//		
//
//		 String [] RandomWeb = {"https://www.almosafer.com/en?ncr=1","https://www.almosafer.com/ar?ncr=1"};
//	
//		 Random rand = new Random();
//		 
//		 int RandNumber = rand.nextInt(0,20)%2;
//		 
//		 driver.get(RandomWeb[RandNumber]);
//		 String ActualTitle =driver.getTitle();
//		 
//		 if(RandNumber==1) {
//		 myAssertion.assertEquals(ActualTitle, "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
//		}
//		 else {
//			 
//		 myAssertion.assertEquals(ActualTitle, " Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
//
//	 }
//		 
//}
//	@Test(invocationCount = 3)
//	public void hotel_search() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		 String [] RandomWeb = {"https://www.almosafer.com/en?ncr=1","https://www.almosafer.com/ar?ncr=1"};
//		 String []englishcites= {"Dubai", "Jeddah", "Riyadh	"};
//		 String []arbiccites = {"دﺑﻲ","جدة"};
//				 Random rand = new Random();
//				 
//	  int RandNumber = rand.nextInt(2);
//	  int Randenglish =rand.nextInt(2);
//	  int Randarbiccites =rand.nextInt(3);
//	  
//	  driver.get(RandomWeb[RandNumber]);		 
//				 
//				 if(RandNumber==0) {
//					 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(englishcites[Randenglish]);
//					driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("Amman,Jordan");
//					driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button")).click();
//					
//					}
//					 else {
//						 
//						 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(arbiccites[Randarbiccites]);
//							driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input")).sendKeys("Amman,Jordan");
//							driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button")).click();
//							
//
//				 }
//		 }
		 
		 
	@Test(invocationCount = 3)
	public void Randomlyselect() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		Random myRandom =new  Random();
		int myrandomm=myRandom.nextInt(2);
		 driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]")).click();
		 
	WebElement aaa=driver.findElement(By.xpath("//select[@class='tln3e3-1 eFsRGb']"));
		Select meselectr = new Select(aaa);
		meselectr.selectByIndex(myrandomm);
	}
	
		
	
}		 
//			 
//			 
//			 
//	}
//
