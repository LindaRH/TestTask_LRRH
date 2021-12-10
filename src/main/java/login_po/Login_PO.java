package login_po;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Login_PO {
    public boolean login(String username,String pwd){
        $(By.xpath("//div[@class='header_bar-sign_in']/button")).click();
        $(By.id("login-email")).shouldBe(visible).setValue(username);
        $(By.id("login-password")).setValue(pwd);
        $(By.xpath("//td/button/span[contains(text(),'Sign in')]")).click();
       return $(By.xpath("//a[contains(text(),'My account')]")).shouldBe(visible, Duration.ofSeconds(5)).isDisplayed();
    }
}
