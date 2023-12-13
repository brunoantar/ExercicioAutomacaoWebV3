package pageInteractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.CarrinhoPO;

public class CarrinhoInteractions extends CarrinhoPO {

    WebDriver browser;

    public CarrinhoInteractions(WebDriver driver) {
        browser = driver;
        PageFactory.initElements(browser, this);
    }

    public CarrinhoInteractions acessarURL (){
        browser.get("https://www.saucedemo.com/");
        return this;
    }

    public CarrinhoInteractions inserirUsuario (String texto){
        digitaNome.click();
        digitaNome.sendKeys(texto);
        return this;
    }
    public CarrinhoInteractions inserirSenha (String texto){
        digitaSenha.click();
        digitaSenha.sendKeys(texto);
        digitaSenha.submit();
        return this;
    }

    public CarrinhoInteractions selecionarProduto (){
        produto1.click();
        return this;
    }

    public CarrinhoInteractions selecionarProduto2 (){
        produto2.click();
        return this;
    }

    public CarrinhoInteractions acessarCarrinho (){
        btncarrinho.click();
        return this;
    }

    public String validarValor (){

        return valorProduto.getText();
    }

    public CarrinhoInteractions acessarMenu () {
        btnMenu.click();
        return this;
    }

    public CarrinhoInteractions logoutAplicacao () {
        btnLogout.click();
        return this;
    }

    public String validarLogout (){
        return areaDeslogada.getText();
    }

}
