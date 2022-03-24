package br.com.prova_QA_fasters.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PedidosObj {
    private WebDriver driver;

    @FindBy(linkText = "Pedidos")
    private WebElement telaPedidos;

    @FindBy(xpath = "//*[@name=\"searchProduct\"]")
    private WebElement buscaSimples;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/div/div/button")
    private WebElement lupaPe;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/button")
    private WebElement filtro;

    @FindBy(xpath = "//*[text()='Busca Avançada']")
    private WebElement buscaAvancada;

    @FindBy(xpath = "//*[@id=\"id_product\"]")
    private WebElement numeroProduto;

    @FindBy(xpath = "//*[@id=\"client\"]")
    private WebElement nomeCliente;

    @FindBy(xpath = "//*[text()='Selecione uma opção...']")
    private WebElement selecioneOpcao;

    @FindBy(xpath = "//*[text()='Thiago Silva']")
    private WebElement formaPagamento;

    @FindBy (xpath = "//*[@id=\"request_openin\"]")
    private WebElement emAberto;

    @FindBy(xpath = "//*[@id=\"request_closein\"]")
    private WebElement fechadoEm;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div[6]/div/div")
    private WebElement selecione2;

    @FindBy(xpath = "//*[@id=\"menu-request_status\"]/div[3]/ul/li[6]")
    private WebElement elementEntregue;


    @FindBy(xpath = "//*[text()='Buscar']")
    private WebElement buscarBotao;


    public PedidosObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTelaPedidos() {
        return telaPedidos;
    }

    public void setTelaPedidos(WebElement telaPedidos) {
        this.telaPedidos = telaPedidos;
    }

    public WebElement getBuscaSimples() {
        return buscaSimples;
    }

    public void setBuscaSimples(WebElement buscaSimples) {
        this.buscaSimples = buscaSimples;
    }

    public WebElement getLupaPe() {
        return lupaPe;
    }

    public void setLupaPe(WebElement lupaPe) {
        this.lupaPe = lupaPe;
    }

    public WebElement getFiltro() {
        return filtro;
    }

    public void setFiltro(WebElement filtro) {
        this.filtro = filtro;
    }

    public WebElement getBuscaAvancada() {
        return buscaAvancada;
    }

    public void setBuscaAvancada(WebElement buscaAvancada) {
        this.buscaAvancada = buscaAvancada;
    }

    public WebElement getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(WebElement numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    public WebElement getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(WebElement nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public WebElement getSelecioneOpcao() {
        return selecioneOpcao;
    }

    public void setSelecioneOpcao(WebElement selecioneOpcao) {
        this.selecioneOpcao = selecioneOpcao;
    }

    public WebElement getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(WebElement formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public WebElement getEmAberto() {
        return emAberto;
    }

    public void setEmAberto(WebElement emAberto) {
        this.emAberto = emAberto;
    }

    public WebElement getFechadoEm() {
        return fechadoEm;
    }

    public void setFechadoEm(WebElement fechadoEm) {
        this.fechadoEm = fechadoEm;
    }

    public WebElement getSelecione2() {
        return selecione2;
    }

    public void setSelecione2(WebElement selecione2) {
        this.selecione2 = selecione2;
    }

    public WebElement getElementEntregue() {
        return elementEntregue;
    }

    public void setElementEntregue(WebElement elementEntregue) {
        this.elementEntregue = elementEntregue;
    }

    public WebElement getBuscarBotao() {
        return buscarBotao;
    }

    public void setBuscarBotao(WebElement buscarBotao) {
        this.buscarBotao = buscarBotao;
    }
}
