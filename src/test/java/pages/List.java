package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {

    // 1- Mapeamentos
    // Texti do Resultado Para
    @FindBy(css = "h1.h2Categoria nomeCategoria")
    private WebElement lblResultBy;   //lblResultadoPara


    // 2- Construtor
    public List(WebDriver driver) {
        super(driver);
    }

    // 3- Métodos e Funções baseados no Mapeamento

    // Lê o titulo da gui e devolve o texto
    public String readTitleTab() {   //lerTituloDaGuia
        return driver.getTitle();
    }

    // Le a frase Resultado para "Produto"
    public String readResultBy(){    //le resultado para
    return driver.getTitle();
    }

    // Clique no produto desejado
    public void ClickAtDesireProduct(String product){     //clicarNoProdutoDesejado
        driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();

    }
}
