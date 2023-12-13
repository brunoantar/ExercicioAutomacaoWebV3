package stepDefinition;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageInteractions.CheckoutInteractions;

public class CheckoutSteps {

    private WebDriver browser = Hooks.driver;
    private CheckoutInteractions validarCheckout  = new CheckoutInteractions(browser);;


    @E("adiciono os produtos selecionados dentro do carrinho")
    public void adiciono_o_produto_selecionado_dentro_do_carrinho() {
        validarCheckout.selecionarProduto()
                .selecionarProduto2()
                .acessarCarrinho();
    }

    @E("informo o primeiro nome {string} ultimo nome {string} e codigo postal {string}")
    public void informo_o_primeiro_nome_ultimo_nome_e_codigo_postal(String priNome, String ultNome, String cxPostal) {
        validarCheckout.clicarCheckout()
                .inserirPrimeiroNome(priNome)
                .inserirUltimoNome(ultNome)
                .inserirCaixaPostal(cxPostal)
                .clicarContinuar();

    }

    @Então("sou capaz de verificar no checkout o valor total deles")
    public void sou_capaz_de_verificar_no_checkout_o_valor_total_deles() {
        System.out.println("O Primeiro Produto é: " + validarCheckout.nomePrimeiroProduto() + " tendo valor de: " + validarCheckout.valorPrimeiroProduto());
        System.out.println("O Segundo Produto é: " + validarCheckout.nomeSegundoProduto() + " tendo valor de: " + validarCheckout.valorSegundoProduto());
        System.out.println("Informação de Pagamento é: " + validarCheckout.informacaoPagamento() + " e a Informação de Envio é: " + validarCheckout.informacaoEnvio());
        System.out.println("O subtotal é: " + validarCheckout.valorSubTotal() + " e a taxa é: " + validarCheckout.valorTaxa());
        System.out.println("O valor " + validarCheckout.validarValorTotal());
        validarCheckout.finalizarPedido()
                .acessarMenu()
                .logoutAplicacao();
        Assert.assertTrue(validarCheckout.validarLogout().equals("Swag Labs"));
    }

}
