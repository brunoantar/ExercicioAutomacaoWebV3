package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageInteractions.CarrinhoInteractions;


public class CarrinhoSteps {

    private WebDriver browser = Hooks.driver;
    private CarrinhoInteractions validarCarrinho = new CarrinhoInteractions(browser);


    @Dado("que acesso o site Swag Labs")
    public void que_acesso_o_site_swag_labs() {
        validarCarrinho.acessarURL();
    }

    @Quando("realizo o acesso com o usuario {string} e senha {string}")
    public void realizo_o_acesso_com_o_usuario_e_senha(String login, String senha) {
        validarCarrinho.inserirUsuario(login)
                .inserirSenha(senha);
    }

    @E("adiciono o produto selecionado dentro do carrinho")
    public void adiciono_o_produto_selecionado_dentro_do_carrinho() {
        validarCarrinho.selecionarProduto()
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
