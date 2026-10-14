import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin {
    public static void main(String[]args) throws InterruptedException {
        testLogin();

    }
    public static void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

        String siteurl = driver.getCurrentUrl();
        System.out.println(siteurl);

        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys("student");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("Password123");
        WebElement subbtn = driver.findElement(By.id("submit"));
        subbtn.click();
        Thread.sleep(5000);

        WebElement home = driver.findElement(By.id("menu-item-43"));
        home.click();
        Thread.sleep(5000);

        String homepage = driver.getTitle();
        System.out.println(homepage);
        String homeurl = driver.getCurrentUrl();
        System.out.println(homeurl);

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();
        Thread.sleep(5000);

        String practisepage = driver.getTitle();
        System.out.println(practisepage);
        String practiseurl = driver.getCurrentUrl();
        System.out.println(practiseurl);

        WebElement courses = driver.findElement(By.id("menu-item-21"));
        courses.click();
        Thread.sleep(5000);

        String coursespage = driver.getTitle();
        System.out.println(coursespage);
        String coursesurl = driver.getCurrentUrl();
        System.out.println(coursesurl);

        WebElement aiworkshop = driver.findElement(By.id("menu-item-1082"));
        aiworkshop.click();
        Thread.sleep(5000);

        String aiworkshoppage = driver.getTitle();
        System.out.println(aiworkshoppage);
        String aiworkshopurl = driver.getCurrentUrl();
        System.out.println(aiworkshopurl);
        driver.navigate().back();

        WebElement blog = driver.findElement(By.id("menu-item-19"));
        blog.click();
        Thread.sleep(5000);

        String blogpage = driver.getTitle();
        System.out.println(blogpage);
        String blogurl = driver.getCurrentUrl();
        System.out.println(blogurl);

        WebElement contact = driver.findElement(By.id("menu-item-18"));
        contact.click();
        Thread.sleep(5000);

        String contactpage = driver.getTitle();
        System.out.println(contactpage);
        String contacturl = driver.getCurrentUrl();
        System.out.println(contacturl);




        driver.navigate().back();
        driver.close();


    }
}
