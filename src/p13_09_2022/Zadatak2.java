package p13_09_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
	/*
Maksimizuje prozor
Ucitava stranicu https://demoqa.com/login 
Za username unosi itbootcamp. Xpath za trazivnje ovog elementa treba da bude preko id atributa.
Za lozinku unosi ITBootcamp2021!  Xpath za trazenje ovog elementa treba da bude preko placeholder atributa.
Klikce na dugme Login. Xpath ovog elementa treba da bude tako da se prvo dohvati form element i da se od njega spusti do dugmeta
Ceka 5sekundi
Klikce na dugme Log out.Xpath ovog elementa treba da bude po tekstu elementa. Koristan link
Zatvara pretrazivac

	 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		
		WebElement userNameInput =
				driver.findElement(By.xpath("//input[@id='userName']"));
		userNameInput.sendKeys("itbootcamp");
		
		WebElement passWordInput =
				driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWordInput.sendKeys("ITBootcamp2021!");
		
		WebElement LogInButton =
				driver.findElement(By.xpath("//form[@id='userForm']/div[4]/div/button"));
		LogInButton.click();
		
		Thread.sleep(5000);
		
		WebElement LogOutButton =
				driver.findElement(By.xpath("//button[contains(text(), 'Log out')]"));
		LogOutButton.click();
		
		driver.quit();
	}

}
