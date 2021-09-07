package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    // 1- Mapeamentos de Elementos
    @FindBy(id= "search")
    private WebElement txtInputSearch;  //Nome da caixa de pesquisa

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;


    // 2- Construtor

    public Home(WebDriver driver) {
        super(driver);
    }


    // 3- Ações dos Elementos

    public void search(String product){
        txtInputSearch.click();              // Clicar na caixa de Pesquisa
        txtInputSearch.clear();              // Limpar o conteúdo da caixa de texto
        txtInputSearch.sendKeys(product);    // Escreve na caixa de texto
    }
    // Feature --> Steps --> searchWith... --> serach

    public void searchWithMagnifierButton(String product){//Pesquisar com botão na Lupa
        search(product);
        btnSearch.click();                   // Clicar na Lupa
    }

    public void setBtnSearchEnter(String product){
        //txtInputSearch.sendKeys(product + Keys.ENTER);    // Escreve na caixa de texto e apertar o botão
        txtInputSearch.sendKeys(Keys.ENTER);    // Apertar o botão
    }
}
