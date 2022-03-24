package br.com.prova_QA_fasters.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardObj {
    private WebDriver driver;

    @FindBy(xpath = "//*[text()='Abrir Caixa']")
    private WebElement abrircaixa;

    @FindBy(xpath = "//*[@id=\"valor_inicial\"]")
    private WebElement valorInicialCaixa;

    @FindBy(xpath = "//*[text()='Selecione uma opção...']")
    private WebElement selecioneOpcao;

    @FindBy(xpath = "//*[text()='Caixa 2']")
    private WebElement caixa2;

    @FindBy(xpath = "//*[text()='Abrir']")
    private WebElement botaoAbrir;

    @FindBy(xpath = "//*[text()='ADD PEDIDO']")
    private WebElement addPedido;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/button")
    private WebElement addPedidoBotaoL;

    @FindBy(xpath = "//*[text()='Delivery']")
    private WebElement pedidoDelivery;

    @FindBy(xpath = "//*[@id=\"menu-request.source\"]/div[3]/ul/li[2]")
    private WebElement telefone;

    @FindBy(xpath = "//*[@id=\"menu-request.source\"]/div[3]/ul/li[3]")
    private WebElement whats;

    @FindBy(xpath = "//*[@id=\"menu-request.source\"]/div[3]/ul/li[4]")
    private WebElement aplicativo;

    @FindBy(xpath = "//*[@id=\"menu-request.source\"]/div[3]/ul/li[5]")
    private WebElement instagram;

    @FindBy(xpath = "//*[@id=\"menu-request.source\"]/div[3]/ul/li[6]")
    private WebElement facebook;

    @FindBy(xpath = "//*[@id=\"my-class\"]")
    private WebElement nomeCliente;

    @FindBy(xpath = "//*[text()='Confirmar']")
    private WebElement botaoConfirmar;

    @FindBy(xpath = "//*[@id=\"my-class\"]")
    private WebElement CampoPesquisa;

    @FindBy(xpath = "//*[text()='Forma de pagamento']")
    private WebElement formaPagamento;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/section/div/div[1]/div[4]/div[2]/div")
    private WebElement tipoEntrega;

    @FindBy(xpath = "//*[text()='Empresa 01 TESTE']")
    private WebElement transportadora;

    @FindBy(xpath = "//*[text()='Motoboy']")
    private  WebElement motoBoy;

    @FindBy(xpath = "//*[text()='Grátis']")
    private  WebElement gratis;

    @FindBy(xpath = "//input[@name='delivery_value']")
    private WebElement valorTrans;

    @FindBy(xpath = "//*[text()='Salvar']")
    private WebElement botaoSalvar;

    @FindBy(xpath = "//*[text()='Dinheiro']")
    private WebElement pgDinheiro;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/section/form/div/div[9]/div/button")
    private WebElement botoaoFinalizarD;

    @FindBy(xpath = "//*[text()='Cartão de Débito']")
    private WebElement pgCartaoDebito;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/section/form/div/div[10]/div")
    private WebElement botoaoFinalizarCD;

    @FindBy(xpath = "//*[text()='Cartão de Crédito']")
    private WebElement pgCartaoCredito;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/section/form/div/div[10]/div/button")
    private WebElement botoaoFinalizarCC;

    @FindBy(xpath = "//*[text()='Vale Refeição']")
    private WebElement pgValeAlimento;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/section/form/div/div[10]/div/button/span[1]")
    private WebElement botoaoFinalizarVA;

    @FindBy(xpath = "//*[text()='Outros']")
    private WebElement pgOutros;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/section/form/div/div[10]/div/button")
    private WebElement botoaoFinalizarO;

    @FindBy(xpath = "//*[text()='Pix']")
    private WebElement pgPíx;

    @FindBy(xpath = "//input[@name='valor_pago']")
    private WebElement valorPago;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/section/div/div[2]/div[1]/div[3]/div[1]/div/span[1]/span/button[1]/svg/line[2]")
    private WebElement dividirEntreMAISPessoas;

    @FindBy(xpath = "/html/body/div[5]/div[3]/div/section/div/div[2]/div[1]/div[3]/div[1]/div/span[1]/span/button[2]/svg")
    private WebElement dividirEntreMENOSPessoas;

    @FindBy(xpath = "//*[text()='Finalizar']")
    private WebElement botaoFinalizar;

    @FindBy(xpath = "//*[text()='Aceitar']")
    private WebElement botaoAceitar;

    public DashboardObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddPedido() {
        return addPedido;
    }

    public void setAddPedido(WebElement addPedido) {
        this.addPedido = addPedido;
    }

    public WebElement getAddPedidoBotaoL() {
        return addPedidoBotaoL;
    }

    public void setAddPedidoBotaoL(WebElement addPedidoBotaoL) {
        this.addPedidoBotaoL = addPedidoBotaoL;
    }

    public WebElement getAbrircaixa() {
        return abrircaixa;
    }

    public void setAbrircaixa(WebElement abrircaixa) {
        this.abrircaixa = abrircaixa;
    }

    public WebElement getValorInicialCaixa() {
        return valorInicialCaixa;
    }

    public void setValorInicialCaixa(WebElement valorInicialCaixa) {
        this.valorInicialCaixa = valorInicialCaixa;
    }

    public WebElement getSelecioneOpcao() {
        return selecioneOpcao;
    }

    public void setSelecioneOpcao(WebElement selecioneOpcao) {
        this.selecioneOpcao = selecioneOpcao;
    }

    public WebElement getCaixa2() {
        return caixa2;
    }

    public void setCaixa2(WebElement caixa2) {
        this.caixa2 = caixa2;
    }

    public WebElement getBotaoAbrir() {
        return botaoAbrir;
    }

    public void setBotaoAbrir(WebElement botaoAbrir) {
        this.botaoAbrir = botaoAbrir;
    }

    public WebElement getPedidoDelivery() {
        return pedidoDelivery;
    }

    public void setPedidoDelivery(WebElement pedidoDelivery) {
        this.pedidoDelivery = pedidoDelivery;
    }

    public WebElement getTelefone() {
        return telefone;
    }

    public void setTelefone(WebElement pgDn) {
        this.telefone = pgDn;
    }

    public WebElement getWhats() {
        return whats;
    }

    public void setWhats(WebElement whats) {
        this.whats = whats;
    }

    public WebElement getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(WebElement aplicativo) {
        this.aplicativo = aplicativo;
    }

    public WebElement getInstagram() {
        return instagram;
    }

    public void setInstagram(WebElement instagram) {
        this.instagram = instagram;
    }

    public WebElement getFacebook() {
        return facebook;
    }

    public void setFacebook(WebElement facebook) {
        this.facebook = facebook;
    }

    public WebElement getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(WebElement nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public WebElement getBotaoConfirmar() {
        return botaoConfirmar;
    }

    public void setBotaoConfirmar(WebElement botaoConfirmar) {
        this.botaoConfirmar = botaoConfirmar;
    }

    public WebElement getCampoPesquisa() {
        return CampoPesquisa;
    }

    public void setCampoPesquisa(WebElement campoPesquisa) {
        CampoPesquisa = campoPesquisa;
    }

    public WebElement getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(WebElement formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public WebElement getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(WebElement tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public WebElement getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(WebElement transportadora) {
        this.transportadora = transportadora;
    }

    public WebElement getMotoBoy() {
        return motoBoy;
    }

    public void setMotoBoy(WebElement motoBoy) {
        this.motoBoy = motoBoy;
    }

    public WebElement getGratis() {
        return gratis;
    }

    public void setGratis(WebElement gratis) {
        this.gratis = gratis;
    }

    public WebElement getValorTrans() {
        return valorTrans;
    }

    public void setValorTrans(WebElement valorTrans) {
        this.valorTrans = valorTrans;
    }

    public WebElement getBotaoSalvar() {
        return botaoSalvar;
    }

    public void setBotaoSalvar(WebElement botaoSalvar) {
        this.botaoSalvar = botaoSalvar;
    }

    public WebElement getPgDinheiro() {
        return pgDinheiro;
    }

    public void setPgDinheiro(WebElement pgDinheiro) {
        this.pgDinheiro = pgDinheiro;
    }

    public WebElement getValorPago() {
        return valorPago;
    }

    public void setValorPago(WebElement valorPago) {
        this.valorPago = valorPago;
    }

    public WebElement getBotaoFinalizar() {
        return botaoFinalizar;
    }

    public void setBotaoFinalizar(WebElement botaoFinalizar) {
        this.botaoFinalizar = botaoFinalizar;
    }

    public WebElement getPgCartaoDebito() {
        return pgCartaoDebito;
    }

    public void setPgCartaoDebito(WebElement pgCartaoDebito) {
        this.pgCartaoDebito = pgCartaoDebito;
    }

    public WebElement getPgCartaoCredito() {
        return pgCartaoCredito;
    }

    public void setPgCartaoCredito(WebElement pgCartaoCredito) {
        this.pgCartaoCredito = pgCartaoCredito;
    }

    public WebElement getPgValeAlimento() {
        return pgValeAlimento;
    }

    public void setPgValeAlimento(WebElement pgValeAlimento) {
        this.pgValeAlimento = pgValeAlimento;
    }

    public WebElement getPgOutros() {
        return pgOutros;
    }

    public void setPgOutros(WebElement pgOutros) {
        this.pgOutros = pgOutros;
    }

    public WebElement getPgPíx() {
        return pgPíx;
    }

    public void setPgPíx(WebElement pgPíx) {
        this.pgPíx = pgPíx;
    }

    public WebElement getBotoaoFinalizarD() {
        return botoaoFinalizarD;
    }

    public void setBotoaoFinalizarD(WebElement botoaoFinalizarD) {
        this.botoaoFinalizarD = botoaoFinalizarD;
    }

    public WebElement getBotoaoFinalizarCD() {
        return botoaoFinalizarCD;
    }

    public void setBotoaoFinalizarCD(WebElement botoaoFinalizarCD) {
        this.botoaoFinalizarCD = botoaoFinalizarCD;
    }

    public WebElement getBotoaoFinalizarCC() {
        return botoaoFinalizarCC;
    }

    public void setBotoaoFinalizarCC(WebElement botoaoFinalizarCC) {
        this.botoaoFinalizarCC = botoaoFinalizarCC;
    }

    public WebElement getBotoaoFinalizarVA() {
        return botoaoFinalizarVA;
    }

    public void setBotoaoFinalizarVA(WebElement botoaoFinalizarVA) {
        this.botoaoFinalizarVA = botoaoFinalizarVA;
    }

    public WebElement getBotoaoFinalizarO() {
        return botoaoFinalizarO;
    }

    public void setBotoaoFinalizarO(WebElement botoaoFinalizarO) {
        this.botoaoFinalizarO = botoaoFinalizarO;
    }

    public WebElement getDividirEntreMAISPessoas() {
        return dividirEntreMAISPessoas;
    }

    public void setDividirEntreMAISPessoas(WebElement dividirEntreMAISPessoas) {
        this.dividirEntreMAISPessoas = dividirEntreMAISPessoas;
    }

    public WebElement getBotaoAceitar() {
        return botaoAceitar;
    }

    public void setBotaoAceitar(WebElement botaoAceitar) {
        this.botaoAceitar = botaoAceitar;
    }

    public WebElement getDividirEntreMENOSPessoas() {
        return dividirEntreMENOSPessoas;
    }

    public void setDividirEntreMENOSPessoas(WebElement dividirEntreMENOSPessoas) {
        this.dividirEntreMENOSPessoas = dividirEntreMENOSPessoas;
    }
}
