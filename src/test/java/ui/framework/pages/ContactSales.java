package ui.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactSales {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement company;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement first_name;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement last_name;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phone;

    public void sendKeys() {
        email.sendKeys("geetha@1234");
        company.sendKeys("hsbc");
        first_name.sendKeys("geetha");
        last_name.sendKeys("B");
        phone.sendKeys("123456789");
        WebElement emp_count = driver.findElement(By.xpath("//select[@id='employee_count']"));
        Select employee_count = new Select(emp_count);
        //List<WebElement> options =employee_count.getOptions();
         employee_count.selectByVisibleText("2-10");
    }

    public ContactSales(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}

