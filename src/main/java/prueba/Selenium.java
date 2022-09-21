package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		String exePath="./src/test/resources/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationpractice.com");  //se cambia la url de la página a automatizar
		driver.manage().window().maximize(); //maximiza la página al 100%
		Thread.sleep(3000);  //espera para cargar la página
		
		
		//donde estan los códigos de los elementos
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		WebElement searchBtn = driver.findElement(By.xpath("(//*[@type=\"submit\"])[1]"));
		
		//funcionalidad de los elementos
		searchBar.sendKeys("Dress"); //agrega texto
		searchBtn.click();  //para hacer un click
		
	}

}
