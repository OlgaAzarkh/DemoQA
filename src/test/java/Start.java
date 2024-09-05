import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;


    @Test

    public void test(){
       // System.setProperty("webdriver.chrome.driver", "/Users/olgaazarkh/IdeaProjects/chromedriver-mac-arm64/chromedriver");
        wd=new ChromeDriver();
        wd.get("https://google.com/");
        wd.

    }

}
