import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsappLogIn {
    public static void main(String[] args) {
        whatsapp();
    }
    public static void whatsapp() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement loginWithPhoneNo = driver.findElement(By.xpath("\\\\div[@class='x1c4vz4f xs83m0k xdl72j9 x1g77sc7 x78zum5 xozqiw3 x1oa3qoh x12fk4p8 xeuugli x2lwn1j x1nhvcw1 xdt5ytf x1cy8zhl']"));
        loginWithPhoneNo.click();
        WebElement dropSymbol = driver.findElement(By.id("additional-filters"));
        dropSymbol.click();




    }
}
