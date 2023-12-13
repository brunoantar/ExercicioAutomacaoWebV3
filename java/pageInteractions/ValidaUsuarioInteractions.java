package pageInteractions;

import org.openqa.selenium.WebDriver;

public class ValidaUsuarioInteractions extends CheckoutInteractions {

    public ValidaUsuarioInteractions(WebDriver driver) {

        super(driver);
    }

    public String mensagemErro (){

        return msgErro.getText();
    }

}
