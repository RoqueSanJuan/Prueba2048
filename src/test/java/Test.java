import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Test {

    @org.testng.annotations.Test
    public static void Test(){

        System.setProperty("webdriver.chrome.driver" , "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        driver.get("https://roquesanjuan.github.io/2048Simple/");

        if(driver.getTitle().equalsIgnoreCase("2048")){

            System.out.println("Titulo Correcto");
        }
        else{
            System.out.println("Titulo Incorrecto");
        }

        Assert.assertTrue(driver.getTitle().equals("2048"));


    }



}
