import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by henna on 1/29/17.
 */
public class GoogleSearchTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        try {
            String appTitle = driver.getTitle();

            System.out.println("App Title : " + appTitle);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

