package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public WebDriver driver;   //Declarou objeto do Selenium WebDriver, vulgo bola
    // ^ - ao usar PageFactory mudar de public para protect

    // v - criar um construtor e inicializar os elementos do PageFactoru

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
}
