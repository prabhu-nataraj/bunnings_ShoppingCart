package shoppingCart.shoppingCart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingCartpages {

    WebDriver driver;

    @FindBy (xpath = ".//input[@type ='search']")
    private WebElement txt_search;

    @FindBy (xpath = ".//button[@class='SearchSubmitButton']")
    private WebElement btn_submit;

    @FindBy (xpath = ".//div[@class='container-main']/div/div/article[1]/a/div[3]/div[2]/div[1]/button")
    private WebElement btn_AddtoCartforFirstItem;

    @FindBy (xpath = ".//*[@id='confirmation-drawer']/div/div/div/div[2]/a/button")
    private WebElement btn_ReviewandCheckout;

    @FindBy (xpath = ".//h4[@class='ProductName ']")
    private WebElement label_productName;

    @FindBy (xpath = ".//p[@data-locator='search-product-tile-title-0']")
    private WebElement txt_firstproductItem;

    @FindBy (xpath = ".//input[@title='Press Enter or Tab key to apply quantity']")
    private WebElement txt_addquantity;

    @FindBy (xpath = "//button[@class='cartOperation subtractQtyButton']")
    private WebElement btn_decreasequantity_reviewcart;
    
    @FindBy (xpath = "//input[@type='text']")
    private WebElement txt_quantity_reviewcart;
    
    
    
    
    public shoppingCartpages(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

  
    public WebElement homebtn_submit() {
        return btn_submit;
    }

    public WebElement home_txt_search() {
        return txt_search;
    }

    public WebElement search_btn_AddtoCartFirstItem() {
        return btn_AddtoCartforFirstItem;
    }

    public WebElement search_btn_btn_ReviewandCheckout() {
        return btn_ReviewandCheckout;
    }

    public WebElement reviewCart_txt_productName() {
        return label_productName;
    }

    public WebElement search_txt_productItem() {
        return txt_firstproductItem;

    }
    public WebElement quantity_txt_noofitems() {
        return txt_addquantity;
    }

    public WebElement reviewCart_btn_decreasequantity() {
        return btn_decreasequantity_reviewcart;
    }

    public WebElement reviewCart_txt_quantity() {
        return txt_quantity_reviewcart;
    }
    


    
    
    
}