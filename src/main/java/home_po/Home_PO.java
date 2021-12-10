package home_po;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import java.time.Duration;

public class Home_PO {
    public Home_PO open(){
        Selenide.open(Configuration.baseUrl);
        return this;
    }
    public void search(String variable){
        $(By.xpath("(//input[@name='substring'])[1]")).shouldBe(visible, Duration.ofSeconds(5)).setValue(variable).pressEnter();
    }
    public void addProduct(){
        $(By.xpath("//*[@id=\"content\"]/div/div/div[4]/div/div/div/ul/li[1]/div/div[2]/div[3]/div[1]/button")).scrollIntoView(true).hover().click();
    }
}
