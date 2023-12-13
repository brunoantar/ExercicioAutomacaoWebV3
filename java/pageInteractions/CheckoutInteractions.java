package pageInteractions;


import org.openqa.selenium.WebDriver;

public class CheckoutInteractions extends CarrinhoInteractions {

    public CheckoutInteractions(WebDriver driver) {
        super(driver);
    }

    public CheckoutInteractions clicarCheckout (){
        btnCheckout.click();
        return this;
    }

    public CheckoutInteractions inserirPrimeiroNome (String texto){
        primeiroNome.click();
        primeiroNome.sendKeys(texto);
        return this;
    }

    public CheckoutInteractions inserirUltimoNome (String texto){
        ultimoNome.click();
        ultimoNome.sendKeys(texto);
        return this;
    }
    public CheckoutInteractions inserirCaixaPostal (String texto){
        caixaPostal.click();
        caixaPostal.sendKeys(texto);
        return this;
    }

    public CheckoutInteractions clicarContinuar () {
        btnContinuar.click();
        return this;
    }

    public String nomePrimeiroProduto (){

        return nomeProduto1.getText();
    }

    public String valorPrimeiroProduto (){

        return valorProduto1.getText();
    }

    public String nomeSegundoProduto (){

        return nomeProduto2.getText();
    }

    public String valorSegundoProduto (){

        return valorProduto2.getText();
    }

    public String informacaoPagamento (){

        return infPagamento.getText();
    }

    public String informacaoEnvio (){

        return infEnvio.getText();
    }

    public String valorSubTotal (){

        return subTotal.getText();
    }

    public String valorTaxa (){

        return taxa.getText();
    }

    public String validarValorTotal (){

        return valorTotalProduto.getText();
    }

    public CheckoutInteractions finalizarPedido () {
        btnFinalizar.click();
        return this;
    }

}
