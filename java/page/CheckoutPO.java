package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageInteractions.CheckoutInteractions;

public class CheckoutPO extends ValidaUsuarioPO {

    @FindBy(xpath = "//button[@name='checkout']")
    protected WebElement btnCheckout;

    @FindBy (xpath = "//input[contains(@placeholder,'First Name')]")
    protected WebElement primeiroNome;

    @FindBy (xpath = "//input[contains(@placeholder,'Last Name')]")
    protected WebElement ultimoNome;

    @FindBy (xpath = "//input[contains(@placeholder,'Zip/Postal Code')]")
    protected WebElement caixaPostal;

    @FindBy (xpath = "//input[contains(@type,'submit')]")
    protected WebElement btnContinuar;

    @FindBy (xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Backpack')]")
    protected WebElement nomeProduto1;

    @FindBy (xpath = "//div[@class='inventory_item_price'][contains(.,'$29.99')]")
    protected WebElement valorProduto1;

    @FindBy (xpath = "//div[@class='inventory_item_name'][contains(.,'Sauce Labs Bike Light')]")
    protected WebElement nomeProduto2;

    @FindBy (xpath = "//div[@class='inventory_item_price'][contains(.,'$9.99')]")
    protected WebElement valorProduto2;

    @FindBy (xpath = "//div[@class='summary_value_label'][contains(.,'SauceCard #31337')]")
    protected WebElement infPagamento;

    @FindBy (xpath = "//div[@class='summary_value_label'][contains(.,'Free Pony Express Delivery!')]")
    protected WebElement infEnvio;

    @FindBy (xpath = "//div[contains(@class,'summary_subtotal_label')]")
    protected WebElement subTotal;

    @FindBy (xpath = "//div[@class='summary_tax_label'][contains(.,'Tax: $3.20')]")
    protected WebElement taxa;

    @FindBy (xpath = "//div[@class='summary_info_label summary_total_label']")
    protected  WebElement valorTotalProduto;

    @FindBy (xpath = "//button[@name='finish']")
    protected WebElement btnFinalizar;

}
