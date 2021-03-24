package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Gmail_Steps {
WebDriver driver = null;
	
@Given("Open Chrome Browser")
public void open_Chrome_Browser() {
	
	System.out.println("Inside steps- Open Chrome Browser");
    
    String projectPath = System.getProperty("user.dir");
    System.out.println("Project Path is "+projectPath );
    System.setProperty("webdriver.chrome.driver",projectPath+"/src/main/resources/chromedriver/chromedriver.exe");
    driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
}

@And("I navigate to http://www.gmail.com")
public void i_navigate_to_http_www_gmail_com() {
	 System.out.println("Inside steps- I navigate to http://www.gmail.com");
	 driver.navigate().to("http://gmail.com");
}

@When("I enter valid username and password")
public void i_enter_valid_username_and_password() throws InterruptedException{
	System.out.println("Inside steps- I enter valid username and password");
 	
	 driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("5851071013@st.utc2.edu.vn");
	 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456Athedol");
	 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
	 Thread.sleep(4000);
}

@And("I click on button sign in")
public void i_click_on_button_sign_in() {
	System.out.println("Inside steps- I click on button sign in");
}

@Then("I should get logged in")
public void i_should_get_logged_in() throws InterruptedException {
	 System.out.println("Inside steps- I should get logged in");
	 Thread.sleep(5000);
	 driver.close();
	 driver.quit();
}


}
