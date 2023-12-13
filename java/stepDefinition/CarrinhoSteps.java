package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageInteractions.CarrinhoInteractions;


public class CarrinhoSteps {

    public static WebDriver browser;
    CarrinhoInteractions validarCarrinho;

    @Dado("que sou cliente do site Swag Labs")
    public void que_sou_cliente_do_site_swag_labs() {
        browser = Hooks.driver;
        validarCarrinho = new CarrinhoInteractions(browser);
        validarCarrinho.acessarURL();
    }

    @Quando("seleciono um produto do site com usuario {string} e senha {string}")
    public void seleciono_um_produto_do_site_com_usuario(String login, String senha) {
        validarCarrinho.inserirUsuario(login)
                .inserirSenha(senha)
                .selecionarProduto()
                .acessarCarrinho();
    }

    @Então("sou capaz de verificar o valor dele dentro do carrinho")
    public void sou_capaz_de_verificar_o_valor_dele_dentro_do_carrinho() {
        System.out.println("O valor é: " + validarCarrinho.validarValor());
        validarCarrinho.acessarMenu()
                        .logoutAplicacao();
        Assert.assertTrue(validarCarrinho.validarLogout().equals("Swag Labs"));
    }

}
