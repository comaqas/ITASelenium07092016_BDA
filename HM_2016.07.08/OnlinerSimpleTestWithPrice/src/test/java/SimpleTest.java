import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;



public class SimpleTest {
    @Test
    public void myTestMethod(){
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.onliner.by/");

        WebElement catalogButton = driver.findElement(By.cssSelector("[href='http://catalog.onliner.by/']>.b-main-navigation__text"));
        catalogButton.click();

        assertEquals(driver.getTitle(), "Каталог Onliner.by");

        WebElement mobilePhoneButton = driver.findElement(By.cssSelector("[class='catalog-bar__item']>[href='http://catalog.onliner.by/mobile']"));
        mobilePhoneButton.click();

        assertEquals(driver.getTitle(), "Купить мобильный телефон в Минске");

        WebElement producerList = driver.findElement(By.xpath("//span[text()='Производитель']/../../div[2]/div[1]/div"));
        producerList.click();

        WebElement producerMeizu = driver.findElement(By.xpath("//span[text()='MEIZU']"));
        producerMeizu.click();
        producerList.click();


        WebElement placeholderPriceFrom = driver.findElement(By.xpath("//span[text()='Минимальная цена, после деноминации']/../../div[2]/div/div[1]/input"));
        placeholderPriceFrom.sendKeys("200");

        WebElement placeholderPriceTo = driver.findElement(By.xpath("//span[text()='Минимальная цена, после деноминации']/../../div[2]/div/div[2]/input"));
        placeholderPriceTo.sendKeys("500");

        WebElement placeholderYearFrom = driver.findElement(By.xpath("//span[text()='Дата выхода на рынок']/../../div[3]/div/div[1]/input"));
        placeholderYearFrom.sendKeys("2014");

        WebElement operatingSystemList = driver.findElement(By.xpath("//span[text()='Операционная система']/../../div[3]/div[1]/div"));
        operatingSystemList.click();

        WebElement checkOperatingSystem = driver.findElement(By.xpath("//div/label/span[text()='Android']"));
        checkOperatingSystem.click();
        operatingSystemList.click();


        WebElement displaySize = driver.findElement(By.xpath("//span[text()='Размер экрана']/../../div[3]/div/div[1]/select"));
        displaySize.sendKeys("4"); //можно было сделать displaySize.click(); для вывода списка

        WebElement displayResol = driver.findElement(By.xpath("//span[text()='1080x1920 (FullHD)']/../span/input"));
        displayResol.click();

        WebElement displayTech = driver.findElement(By.xpath("//span[@class='i-checkbox']/input[@value='ips']/../span"));
        displayTech.click();

        WebElement OperMemory = driver.findElement(By.xpath("//span[text()='Оперативная память, ГБ']/../../div[3]/div/div[1]/input"));
        OperMemory.sendKeys("2");

        WebElement FlashMemory = driver.findElement(By.xpath("//span[text()='Флэш-память, ГБ']/../../div[3]/div/div[1]/input"));
        FlashMemory.sendKeys("16");

        WebElement SelectCardMemory = driver.findElement(By.xpath("//span[text()='Поддержка карт памяти']/../../div[3]/div/label[1]/span"));
        SelectCardMemory.click();

        WebElement Camera = driver.findElement(By.xpath("//span[text()='Камера, Мп']/../../div[3]/div/div[1]/input"));
        Camera.sendKeys("10");

        WebElement SimFormat = driver.findElement(By.xpath("//span[text()='Формат SIM-карты']/../../div[3]/ul/li[3]/label/span/span"));
        SimFormat.click();

        WebElement LTE = driver.findElement(By.xpath("//span[text()='LTE']/../span/span"));
        LTE.click();

        WebElement Battery = driver.findElement(By.xpath("//span[text()='Емкость аккумулятора, мАч']/../../div[3]/div/div[1]/input"));
        Battery.sendKeys("3000");






    }
}
