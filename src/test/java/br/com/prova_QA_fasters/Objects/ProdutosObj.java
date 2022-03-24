package br.com.prova_QA_fasters.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutosObj {
    private WebDriver driver;

    @FindBy(linkText = "Produtos")
    private WebElement telaProdutos;

    @FindBy(xpath = "//*[@name=\"searchProduct\"]")
    private WebElement busca;

    @FindBy(xpath = "//*[@id=\"formSearch\"]/div[1]/div/div/div/button")
    private WebElement lupaP;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/button")
    private WebElement filtro;

    @FindBy(xpath = "//*[text()='Busca Avançada']")
    private WebElement buscaAvancada;

    @FindBy(xpath = "//*[@id=\"code\"]")
    private WebElement codigoProduto;

    @FindBy(xpath = "//*[@id=\"nameProduct\"]")
    private WebElement nameProduto;

    @FindBy(xpath = "//*[text()='Buscar']")
    private WebElement buscarBotao;

    @FindBy(xpath = "//*[text()='+ Novo']")
    private WebElement addNovo;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement nomeProduto;

    @FindBy(xpath = "//*[@id=\"mui-component-select-condition\"]")
    private WebElement condicao;

    @FindBy(xpath = "//*[text()='Novo']")
    private WebElement novo;

    @FindBy(xpath = "//*[text()='Usado']")
    private WebElement usado;

    @FindBy(xpath = "//*[@id=\"mui-component-select-type\"]")
    private WebElement tipo;

    @FindBy(xpath = "//*[text()='Produto']")
    private WebElement produto;

    @FindBy(xpath = "//*[text()='Serviço']")
    private WebElement servico;

    @FindBy(xpath = "//*[@id=\"mui-component-select-sub_type\"]")
    private WebElement subTipo;

    @FindBy(xpath = "//*[text()='Físico']")
    private WebElement fisico;

    @FindBy(xpath = "//*[@id=\"mui-component-select-product_category_id\"]")
    private WebElement categoria;

    @FindBy(xpath = "//*[text()='Livros']")
    private WebElement livros;

    @FindBy(xpath = "//*[@id=\"my-class\"]")
    private  WebElement nomeAdicional;

    @FindBy(xpath = "//*[@id=\"tag\"]")
    private WebElement tag;

    @FindBy(xpath = "//*[@name=\"shortdescription\"]")
    private WebElement discricaoCurta;

    @FindBy(xpath = "//*[@name=\"descripion\"]")
    private WebElement discricao;

    @FindBy(xpath = "//*[text()='Precificação do produto']")
    private WebElement precoDoProduto;

    @FindBy(xpath = "//*[@name=\"saleprice\"]")
    private WebElement precoVenda;

    @FindBy(xpath = "//*[text()='Controle de estoque']")
    private WebElement controleEstoque;

    @FindBy(xpath = "//*[@name=\"amount\"]")
    private WebElement quantidadeEstoque;

    @FindBy(xpath = "//*[@id=\"mui-component-select-un\"]")
    private WebElement unidadeMedida;

    @FindBy(xpath = "//*[text()='Unidade']")
    private WebElement unidade;

    @FindBy(xpath = "//*[text()='Salvar']")
    private WebElement botaoSalvar;

    @FindBy(xpath = "//*[text()='Fornecedores']")
    private WebElement fornecedores;

    @FindBy(xpath = "//*[@id=\"company_name\"]")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"document_id\"]")
    private WebElement cpf_cnpj;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[text()='Fabricantes']")
    private WebElement fabricantes;

    public ProdutosObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTelaProdutos() {
        return telaProdutos;
    }

    public void setTelaProdutos(WebElement telaProdutos) {
        this.telaProdutos = telaProdutos;
    }

    public WebElement getBusca() {
        return busca;
    }

    public void setBusca(WebElement busca) {
        this.busca = busca;
    }

    public WebElement getLupaP() {
        return lupaP;
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

    public WebElement getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(WebElement codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public WebElement getNameProduto() {
        return nameProduto;
    }

    public void setNameProduto(WebElement nameProduto) {
        this.nameProduto = nameProduto;
    }

    public void setBuscaAvancada(WebElement buscaAvancada) {
        this.buscaAvancada = buscaAvancada;
    }

    public WebElement getBuscarBotao() {
        return buscarBotao;
    }

    public void setBuscarBotao(WebElement buscarBotao) {
        this.buscarBotao = buscarBotao;
    }

    public void setLupaP(WebElement lupaP) {
        this.lupaP = lupaP;
    }

    public WebElement getAddNovo() {
        return addNovo;
    }

    public void setAddNovo(WebElement addNovo) {
        this.addNovo = addNovo;
    }

    public WebElement getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(WebElement nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public WebElement getCondicao() {
        return condicao;
    }

    public void setCondicao(WebElement condicao) {
        this.condicao = condicao;
    }

    public WebElement getNovo() {
        return novo;
    }

    public void setNovo(WebElement novo) {
        this.novo = novo;
    }

    public WebElement getUsado() {
        return usado;
    }

    public void setUsado(WebElement usado) {
        this.usado = usado;
    }

    public WebElement getTipo() {
        return tipo;
    }

    public void setTipo(WebElement tipo) {
        this.tipo = tipo;
    }

    public WebElement getProduto() {
        return produto;
    }

    public void setProduto(WebElement produto) {
        this.produto = produto;
    }

    public WebElement getServico() {
        return servico;
    }

    public void setServico(WebElement servico) {
        this.servico = servico;
    }

    public WebElement getSubTipo() {
        return subTipo;
    }

    public void setSubTipo(WebElement subTipo) {
        this.subTipo = subTipo;
    }

    public WebElement getFisico() {
        return fisico;
    }

    public void setFisico(WebElement fisico) {
        this.fisico = fisico;
    }

    public WebElement getCategoria() {
        return categoria;
    }

    public void setCategoria(WebElement categoria) {
        this.categoria = categoria;
    }

    public WebElement getLivros() {
        return livros;
    }

    public void setLivros(WebElement livros) {
        this.livros = livros;
    }

    public WebElement getNomeAdicional() {
        return nomeAdicional;
    }

    public void setNomeAdicional(WebElement nomeAdicional) {
        this.nomeAdicional = nomeAdicional;
    }

    public WebElement getTag() {
        return tag;
    }

    public void setTag(WebElement tag) {
        this.tag = tag;
    }

    public WebElement getDiscricaoCurta() {
        return discricaoCurta;
    }

    public void setDiscricaoCurta(WebElement discricaoCurta) {
        this.discricaoCurta = discricaoCurta;
    }

    public WebElement getDiscricao() {
        return discricao;
    }

    public void setDiscricao(WebElement discricao) {
        this.discricao = discricao;
    }

    public WebElement getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(WebElement precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public WebElement getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(WebElement precoVenda) {
        this.precoVenda = precoVenda;
    }

    public WebElement getControleEstoque() {
        return controleEstoque;
    }

    public void setControleEstoque(WebElement controleEstoque) {
        this.controleEstoque = controleEstoque;
    }

    public WebElement getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(WebElement quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public WebElement getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(WebElement unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public WebElement getUnidade() {
        return unidade;
    }

    public void setUnidade(WebElement unidade) {
        this.unidade = unidade;
    }

    public WebElement getBotaoSalvar() {
        return botaoSalvar;
    }

    public void setBotaoSalvar(WebElement botaoSalvar) {
        this.botaoSalvar = botaoSalvar;
    }

    public WebElement getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(WebElement fornecedores) {
        this.fornecedores = fornecedores;
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public WebElement getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(WebElement cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(WebElement fabricantes) {
        this.fabricantes = fabricantes;
    }
}
