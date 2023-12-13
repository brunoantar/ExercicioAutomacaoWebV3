package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidaUsuarioPO{

    @FindBy (xpath = "//input[contains(@placeholder,'Username')]")
    protected WebElement informaNome;

    @FindBy (xpath = "//input[contains(@placeholder,'Password')]")
    protected WebElement informaSenha;
    @FindBy (xpath = "//h3[@data-test='error']")
    protected WebElement msgErro;

}
