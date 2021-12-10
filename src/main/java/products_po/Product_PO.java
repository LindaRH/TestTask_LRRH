package products_po;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class Product_PO {

    private ElementsCollection allPricesInHomePage(){
        return $$(By.xpath("//li[@class='product-price-base']/span"));
    }

    public boolean validationSymbol(){
       // elements.stream().findAny().
        return allPricesInHomePage().stream().anyMatch(element -> element.getText().startsWith("$"));
         //this.allPricesInHomePage().stream().anyMatch(element -> !element.getText().contains("$"));
    }
}
