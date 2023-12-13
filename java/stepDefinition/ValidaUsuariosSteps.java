package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageInteractions.ValidaUsuarioInteractions;

public class ValidaUsuariosSteps {

    private WebDriver browser = Hooks.driver;
    ValidaUsuarioInteractions validarLogin = new ValidaUsuarioInteractions(browser);

    //Para usuários com acesso
    @Então("sou capaz de verificar no checkout o valor total da compra")
    public void sou_capaz_de_verificar_no_checkout_o_valor_total_da_compra() {
        validarLogin.finalizarPedido()
                .acessarMenu()
                .logoutAplicacao();
        Assert.assertTrue(validarLogin.validarLogout().equals("Swag Labs"));
    }

    //Para usuários bloqueados
    @Então("sou capaz de verificar a mensagem de erro no login")
    public void sou_capaz_de_verificar_a_mensagem_de_erro_no_login() {
        Assert.assertTrue(validarLogin.mensagemErro().equals("Epic sadface: Sorry, this user has been locked out."));
    }
}
