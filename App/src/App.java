import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App{

	automatizacaoWhatsapp whats = new automatizacaoWhatsapp();

	public App() throws AWTException {
        whats.envio();
    }

	
	public static void main(String[] args) throws AWTException {
		
		new App();

	}

}
