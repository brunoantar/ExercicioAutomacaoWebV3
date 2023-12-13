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

    public static WebDriver browser;
    ValidaUsuarioInteractions validarLogin;


    @Dado("que sou direcionado para o site Swag Labs")
    public void que_sou_direcionado_para_o_site_swag_labs() {
        browser = Hooks.driver;
        validarLogin = new ValidaUsuarioInteractions(browser);
        validarLogin.acessarURL();
    }
    @Quando("realizo o login com o usuário {string} e senha {string}")
    public void realizo_o_login_com_o_usuario_e_senha(String login, String senha) {
        validarLogin.inserirUsuario(login)
                .inserirSenha(senha)
                .selecionarProduto()
                .acessarCarrinho();
    }

    @E("devo informar o primeiro nome {string} ultimo nome {string} e codigo postal {string}")
    public void informo_o_primeiro_nome_ultimo_nome_e_codigo_postal(String priNome, String ultNome, String cxPostal) {
        validarLogin.clicarCheckout()
                .inserirPrimeiroNome(priNome)
                .inserirUltimoNome(ultNome)
                .inserirCaixaPostal(cxPostal);
    }
    @Então("sou capaz de verificar no checkout o valor total da compra")
    public void sou_capaz_de_verificar_no_checkout_o_valor_total_da_compra() {
        validarLogin.clicarContinuar()
                .finalizarPedido()
                .acessarMenu()
                .logoutAplicacao();
        Assert.assertTrue(validarLogin.validarLogout().equals("Swag Labs"));
    }

    @Então("sou capaz de verificar a mensagem de erro no login")
    public void sou_capaz_de_verificar_a_mensagem_de_erro_no_login() {
        Assert.assertTrue(validarLogin.mensagemErro().equals("Epic sadface: Sorry, this user has been locked out."));
    }
}
