package page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoPO extends CheckoutPO{

    @FindBy (xpath = "//input[contains(@placeholder,'Username')]")
    protected WebElement digitaNome;

    @FindBy (xpath = "//input[contains(@placeholder,'Password')]")
    protected WebElement digitaSenha;

    @FindBy (xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")
    protected WebElement produto1;

    @FindBy (xpath = "//button[@name='add-to-cart-sauce-labs-bike-light']")
    protected WebElement produto2;

    @FindBy (xpath = "//a[contains(@class,'shopping_cart_link')]")
    protected  WebElement btncarrinho;

    @FindBy (xpath = "//div[contains(@class,'inventory_item_price')]")
    protected WebElement valorProduto;

    @FindBy (xpath = "//button[contains(.,'Open Menu')]")
    protected WebElement btnMenu;

    @FindBy (xpath = "//a[contains(.,'Logout')]")
    protected WebElement btnLogout;

    @FindBy(xpath = "//div[@class='login_logo'][contains(.,'Swag Labs')]")
    protected WebElement areaDeslogada;

}
