import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class App {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\guto_\\Documents\\GitHub\\PocSelenium\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
        
		driver.get("https://web.whatsapp.com/send?l=pt_br&phone={NumberFone}&text={Text}");	
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[3]/button")).click();
        
	}

}
