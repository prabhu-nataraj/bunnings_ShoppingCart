package shoppingCart;

import com.github.javafaker.Faker;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shoppingCart.shoppingCart.pages.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.mustache.Value;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class shoppingCart_StepDefinitions {

    public String productName = "";
    public String actualProductName ="";
    public String expectedquantity="";
    public int expectedqty=0;
    public String actualquantity="";
    public String expectedquantityafterreducingcount="";
    private WebDriver driver;
    shoppingCartpages shoppingcartpages;


    @Before
    public void SetUpDriver() throws Exception {
    } 


   @After
   public void CloseDriver(){
        driver.close();
        driver.quit();
   }

    @Given("^user navigates to bunnings website \"([^\"]*)\"$")
    public void user_navigates_to_bunnings_website(String url) throws Throwable {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.navigate().to(url);    
        this.driver.manage().window().maximize();    
    }

    @Then("^search for the item \"([^\"]*)\" and click Search button$")
    public void search_for_the_item_and_click_Search_button(String prodName) throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);        
        shoppingcartpages.home_txt_search().sendKeys(prodName);
        shoppingcartpages.home_txt_search().sendKeys(Keys.RETURN);    
    }

    @Then("^Add the first item from the search to the Cart$")
    public void add_the_first_item_from_the_search_to_the_Cart() throws Throwable {    
        shoppingcartpages = new shoppingCartpages(driver);        
        Thread.sleep(2000);        
        WebDriverWait w = new WebDriverWait(driver,4);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//p[@data-locator='search-product-tile-title-0']")));
        if (shoppingcartpages.search_txt_productItem().isDisplayed()){
            productName = shoppingcartpages.search_txt_productItem().getText();
        }
        //Thread.sleep(2000);        
        WebDriverWait s = new WebDriverWait(driver,4);
        s.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='container-main']/div/div/article[1]/a/div[3]/div[2]/div[1]/button")));

        if (shoppingcartpages.search_btn_AddtoCartFirstItem().isDisplayed()){
            shoppingcartpages.search_btn_AddtoCartFirstItem().click();
        }        
    }

    @Then("^Click Review and Checkout in the search results page$")    
    public void click_Review_and_Checkout_in_the_search_results_page() throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);
        //Thread.sleep(2000);
        WebDriverWait e = new WebDriverWait(driver,4);
        e.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='confirmation-drawer']/div/div/div/div[2]/a/button")));
        shoppingcartpages.search_btn_btn_ReviewandCheckout().click();
    }
    
    @Then("^Verify whether the same product is added in the Review Cart page$")
    public void verify_whether_the_same_product_is_added_in_the_Review_Cart_page() throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);
        //Thread.sleep(2000);
        WebDriverWait f = new WebDriverWait(driver,4);
        f.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//h4[@class='ProductName ']")));
        actualProductName = shoppingcartpages.reviewCart_txt_productName().getText();
        Assert.assertEquals(actualProductName, productName, "Product Name "+productName+ " is successfully added in the cart ");
    }
    
    
    @Then("^Add (\\d+) quantities of the first item from the search to the Cart$")
    public void add_quantities_of_the_first_item_from_the_search_to_the_Cart(String noofquantities) throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);        
        Thread.sleep(2000);        
        WebDriverWait w = new WebDriverWait(driver,2);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//p[@data-locator='search-product-tile-title-0']")));        

        if (shoppingcartpages.search_txt_productItem().isDisplayed()){
            productName = shoppingcartpages.search_txt_productItem().getText();
        }
        //Thread.sleep(2000);        
        expectedquantity = noofquantities;
        WebDriverWait k = new WebDriverWait(driver,2);
        k.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@class='container-main']/div/div/article[1]/a/div[3]/div[2]/div[1]/button")));     
        if (shoppingcartpages.search_btn_AddtoCartFirstItem().isDisplayed()){
            shoppingcartpages.search_btn_AddtoCartFirstItem().click();
            Thread.sleep(2000);
            shoppingcartpages.quantity_txt_noofitems().clear();
            
            shoppingcartpages.quantity_txt_noofitems().sendKeys(noofquantities);
        }
    }

    @Then("^Verify whether the selected quantity is the same$")
    public void verify_whether_the_selected_quantity_is_the_same() throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);
        Thread.sleep(2000);
        
        shoppingcartpages.reviewCart_txt_quantity().click();

        actualquantity= shoppingcartpages.reviewCart_txt_quantity().getAttribute("value");
        
        
        Assert.assertEquals(expectedquantity, actualquantity, "Total quantity "+actualquantity+ " is verified and correct in the cart ");    
    }

    
    @Then("^Verify we can able to reduce the count by (\\d+) in the Review Cart page$")
    public void verify_we_can_able_to_reduce_the_count_by_in_the_Review_Cart_page(int count) throws Throwable {
        shoppingcartpages = new shoppingCartpages(driver);
        Thread.sleep(2000);
        shoppingcartpages.reviewCart_btn_decreasequantity().click();      
        
        actualquantity= shoppingcartpages.reviewCart_txt_quantity().getAttribute("value");

        int actualqty = Integer.parseInt(actualquantity);

        int expectedquantityafterreducingcount = Integer.parseInt(expectedquantity)-1;
        
        Assert.assertEquals(expectedquantityafterreducingcount, actualqty, "Total quantity "+actualqty+ " is verified and correct in the cart ");    
 

    }

}
