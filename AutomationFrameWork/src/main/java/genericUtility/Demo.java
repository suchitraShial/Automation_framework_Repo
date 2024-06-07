package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public void test() throws IOException {
	FileUtility flibrary=new FileUtility();
	String url=flibrary.getDataFromProperty("url");
	System.out.println(url);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	

	

}
}
