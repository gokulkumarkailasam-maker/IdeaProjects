import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ParaBankRegister {
    public static void main(String[] args) throws InterruptedException, IOException {
        paraBank();
        logIn();

    }
    public static void paraBank() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        driver.navigate().refresh();
        Thread.sleep(3000);
        //WebElement registerlinktext = driver.findElement(By.linkText("Register"));
        //registerlinktext.click();

        WebElement registerxpath = driver.findElement(By.xpath("//a[text()='Register']"));
        registerxpath.click();
        WebElement firstname = driver.findElement(By.xpath("//input[@name='customer.firstName']"));
        firstname.sendKeys("Gokulkumar");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
        lastname.sendKeys("S");
        WebElement address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
        address.sendKeys("Kailasampalayam");

        //WebElement city = driver.findElement(By.xpath("//input[@id='customer.address.city']]"));
        //city.sendKeys("Tiruchengode");
        WebElement city = driver.findElement(By.xpath("//input[@name='customer.address.city']"));
        city.sendKeys("Tiruchengode");

        WebElement state = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
        state.sendKeys("Tamilnadu");
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        zipcode.sendKeys("637209");
        WebElement phoneno = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
        phoneno.sendKeys("7373620367");
        WebElement ssnno = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
        ssnno.sendKeys("715945160493");
        WebElement username = driver.findElement(By.xpath("//input[@id='customer.username']"));
        username.sendKeys("GokulkumarS");
        WebElement password = driver.findElement(By.xpath("//input[@id='customer.password']"));
        password.sendKeys("Gokul@33");
        WebElement confirmpass = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
        confirmpass.sendKeys("Gokul@33");
        WebElement registerbtn = driver.findElement(By.xpath("//input[@value='Register']"));
        registerbtn.click();
//screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File Source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\acer\\IdeaProjects\\Selenium\\image\\parabank.png");
        FileHandler.copy(Source, destination);
    }
        public static void logIn() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://parabank.parasoft.com/");
            driver.navigate().refresh();

        WebElement alreadyuser = driver.findElement(By.xpath("//input[@name='username']"));
        alreadyuser.sendKeys("GokulkumarS");
        WebElement alreadypassword = driver.findElement(By.xpath("//input[@name='password']"));
        alreadypassword.sendKeys("Gokul@33");
        WebElement loginbtn = driver.findElement(By.xpath("//input[@class='button']"));
        loginbtn.click();
        WebElement logoutbtn = driver.findElement(By.xpath("//a[text()='Log Out']"));
        logoutbtn.click();

        //driver.navigate().back();
        //Thread.sleep(5000);
    }

    //driver.close();
}
