package cart_po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Locale;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Cart_PO {
    public void openCartFromProduct(){
        $(By.xpath("//div[2]/div/div/div/div[1]/div[2]/div[5]//a[1]/span[contains(text(),'View cart')]")).shouldBe(visible,Duration.ofSeconds(10)).click();
        //sleep(5000);
        //$(By.xpath("//div[@class='buttons-row']//a[@class='regular-button cart']//span[contains(text(),'View cart')]")).shouldBe(visible, Duration.ofSeconds(30)).click();
        //$(By.xpath("/html/body/div[6]/div[2]/div/div/div/div[1]/div[2]/div[5]/a[1]/span")).shouldBe(visible,Duration.ofSeconds(10)).click();
        //div[2]/div/div/div/div[1]/div[2]/div[5]//a[1]/span[contains(text(),'View cart')]
        //$(By.xpath("//*[@id=\"2b79ec825ab525c0c2b9ad4d8f4fbe68\"]/div/div/div/div[1]/div[2]/div[5]/a[1]")).click();
    }
    public boolean verifyProduct(String title){
        boolean result=false;
        if($(By.id("page-title")).isDisplayed()){
            String val = $(By.id("page-title")).getText();
            val=val.toLowerCase();
            if(val.equals("your cart is empty")){
                System.out.println("The cart is empty");
                result=false;
            }else{
                String ti=$(By.xpath("//p[@class='item-title']/a")).getText();
                if(title.equals(ti)){
                    result=true;
                }
            }

        }else{
            String ti=$(By.xpath("//p[@class='item-title']/a")).getText();
            if(title.equals(ti)){
                result=true;
            }
        }
        return result;
    }

    public String verifySubtotal(){
        return $(By.xpath("//ul[@class='totals']/li[@class='subtotal']/span/span[@class='surcharge']")).getText();
    }

    public void modifyQuantity(String quantity){
        System.out.println($(By.id("amount14")).getText());
        $(By.id("amount14")).setValue(quantity).pressEnter();
        sleep(3000);
    }

}
