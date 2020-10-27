import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automatizacaoWhatsapp { 

	public void envio() throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\guto_\\Documents\\GitHub\\PocSelenium\\chromedriver.exe" );
	
	ChromeDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	Robot r = new Robot();
    
	driver.get("https://web.whatsapp.com/send?l=pt_br&phone={Numero}&text={Mensagem}");

	//Clica em enviar
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/footer/div[1]/div[3]/button"))).click();
    
	//Clica em Adicionar 
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[1]/div[2]"))).click();
	
	//Clica em anexar documento
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[1]/div[2]/div/span/div/div/ul/li[3]/button"))).click();
    
    //Control+V
    r.delay(5000);
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyPress(KeyEvent.VK_ENTER);
    
    //Clica em Enviar Documento
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/span/div/div"))).click();
	}
}
