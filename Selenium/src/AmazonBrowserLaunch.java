import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowserLaunch {
    public static void main(String[]args) throws InterruptedException {
        amazonLaunch();
    }
    public static void amazonLaunch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();


        String page1 = driver.getTitle();
        System.out.println(page1);


        String amazonurl = driver.getCurrentUrl();
        System.out.println(amazonurl);

        driver.navigate().to("https://www.myntra.com/myntra?f=Coupons%3ATHOU5_133254&utm_source=dms_google&utm_medium=dms_searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gad_campaignid=20443628324&gbraid=0AAAAADoxBh53qE9fWIdMjiMLvgDk-yHEI&gclid=CjwKCAjwoOjVBhArEiwAUwDak0dVe4D9IKZAXgdd0tqs06gpMhBlpPV9IYUf-EVp3J66163-ayjsshoCVqYQAvD_BwE");
        String page2 = driver.getTitle();
        System.out.println(page2);
        String myntraurl = driver.getCurrentUrl();
        System.out.println(myntraurl);

        Thread.sleep(5000);


        driver.navigate().back();
        driver.close();

    }
}