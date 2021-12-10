package products_po;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResults_PO {

    public SearchResults_PO sizeResults(int i){
        this.allResults().shouldHave(size(i));
        return this;
    }

    private ElementsCollection allResults() {
        return $$(By.xpath("//ul[@class='products-grid grid-list']/li"));
    }
    public void result(int index, String text){
        this.allResults().get(index).shouldHave(text(text));
    }

    public void addToCart(){
        //this.allResults().get(index).find(By.xpath("//ul/li["+index+"]/div/div[2]/div[3]/div[1]/button/span")).hover().click();
        this.allResults().get(0).hover();
        $(By.xpath("//button//span[contains(text(),'Add to cart')]")).click();
    }



}
