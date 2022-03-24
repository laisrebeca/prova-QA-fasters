package br.com.prova_QA_fasters.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientesObj {
    private WebDriver driver;

    @FindBy(linkText = "Clientes")
    private WebElement telaClientes;

    @FindBy(xpath = "//*[text()='+ Novo']")
    private WebElement addNovo;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/div/div/input")
    private WebElement buscaCliente;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/div/div/button")
    private WebElement lupaC;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/main/div/form/div[1]/div/button")
    private WebElement filtro;

    @FindBy(xpath = "//*[text()='Busca Avançada']")
    private WebElement buscaAvancada;

    @FindBy(xpath = "//*[@id=\"codclient\"]")
    private WebElement codCliente;

    @FindBy(xpath = "//*[@id=\"nameClient\"]")
    private WebElement nomeCliente;

    @FindBy(xpath = "//*[@id=\"cellphone\"]")
    private WebElement cellCliente;

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement endCliente;

    @FindBy(xpath = "//*[text()='Buscar']")
    private WebElement buscarBotao;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    private WebElement sobrenome;

    @FindBy(xpath = "//*[@id=\"document_id\"]")
    private WebElement cpf_cnpj;

    @FindBy(xpath = "//*[@id=\"rg\"]")
    private WebElement rgId;

    @FindBy(xpath = "//*[@id=\"card_number\"]")
    private WebElement cartaoFidelidade;

    @FindBy(xpath = "//*[@id=\"birth\"]")
    private WebElement dataNascimento;

    @FindBy(xpath = "//*[@id=\"mui-component-select-marital_status\"]")
    private WebElement estadoCivil;

    @FindBy(xpath = "//*[text()='Noivo(a)']")
    private WebElement noivo;

    @FindBy(xpath = "//*[@id=\"mui-component-select-gender\"]")
    private WebElement genero;

    @FindBy(xpath = "//*[text()='Feminino']")
    private WebElement Feminino;

    @FindBy(xpath = "//*[@id=\"mui-component-select-type_client_id\"]")
    private WebElement tipoCliente;

    @FindBy(xpath = "//*[text()='roupa']")
    private WebElement roupa;

    @FindBy(xpath = "//*[@id=\"mui-component-select-profession_id\"]")
    private WebElement profissao;

    @FindBy(xpath = "//*[text()='Bancário']")
    private WebElement bancario;

    @FindBy(xpath = "//*[text()='1 - Contribuinte ICMS']")
    private WebElement contribuinte;

    @FindBy(xpath = "//*[text()='2 - Contribuinte isento de Inscrição no Cadastro de Contribuintes']")
    private WebElement Ncontribuinte;

    @FindBy(xpath = "//*[@id=\"father_name\"]")
    private WebElement nomePai;

    @FindBy(xpath = "//*[@id=\"mother_name\"]")
    private  WebElement nomeMae;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"principal_phone\"]")
    private WebElement cellPrincipal;

    @FindBy(xpath = "//*[@id=\"comercial_phone\"]")
    private WebElement cellComercial;

    @FindBy(xpath = "//*[@id=\"cep\"]")
    private WebElement cep;

    @FindBy(xpath = "//*[@id=\"number\"]")
    private WebElement numCasa;

    @FindBy(xpath = "//*[@id=\"complement\"]")
    private WebElement completo;

    @FindBy(xpath = "//*[text()='Salvar']")
    private WebElement botaoSalvar;

    public ClientesObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTelaClientes() {
        return telaClientes;
    }

    public void setTelaClientes(WebElement telaClientes) {
        this.telaClientes = telaClientes;
    }

    public WebElement getAddNovo() {
        return addNovo;
    }

    public void setAddNovo(WebElement addNovo) {
        this.addNovo = addNovo;
    }

    public WebElement getBuscaCliente() {
        return buscaCliente;
    }

    public void setBuscaCliente(WebElement buscaCliente) {
        this.buscaCliente = buscaCliente;
    }

    public WebElement getLupaC() {
        return lupaC;
    }

    public void setLupaC(WebElement lupaC) {
        this.lupaC = lupaC;
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

    public WebElement getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(WebElement codCliente) {
        this.codCliente = codCliente;
    }

    public WebElement getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(WebElement nameClient) {
        this.nomeCliente = nameClient;
    }

    public WebElement getCellCliente() {
        return cellCliente;
    }

    public void setCellCliente(WebElement cellCliente) {
        this.cellCliente = cellCliente;
    }

    public WebElement getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(WebElement endCliente) {
        this.endCliente = endCliente;
    }

    public WebElement getBuscarBotao() {
        return buscarBotao;
    }

    public void setBuscarBotao(WebElement buscarBotao) {
        this.buscarBotao = buscarBotao;
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public WebElement getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(WebElement sobrenome) {
        this.sobrenome = sobrenome;
    }

    public WebElement getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(WebElement cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public WebElement getRgId() {
        return rgId;
    }

    public void setRgId(WebElement rgId) {
        this.rgId = rgId;
    }

    public WebElement getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(WebElement cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }

    public WebElement getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(WebElement dataNascomento) {
        this.dataNascimento = dataNascomento;
    }

    public WebElement getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(WebElement estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public WebElement getGenero() {
        return genero;
    }

    public void setGenero(WebElement genero) {
        this.genero = genero;
    }

    public WebElement getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(WebElement tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public WebElement getProfissao() {
        return profissao;
    }

    public void setProfissao(WebElement profissao) {
        this.profissao = profissao;
    }

    public WebElement getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(WebElement contribuinte) {
        this.contribuinte = contribuinte;
    }

    public WebElement getNcontribuinte() {
        return Ncontribuinte;
    }

    public void setNcontribuinte(WebElement ncontribuinte) {
        Ncontribuinte = ncontribuinte;
    }

    public WebElement getNomePai() {
        return nomePai;
    }

    public void setNomePai(WebElement nomePai) {
        this.nomePai = nomePai;
    }

    public WebElement getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(WebElement nomeMae) {
        this.nomeMae = nomeMae;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getCellPrincipal() {
        return cellPrincipal;
    }

    public void setCellPrincipal(WebElement cellPrincipal) {
        this.cellPrincipal = cellPrincipal;
    }

    public WebElement getCellComercial() {
        return cellComercial;
    }

    public void setCellComercial(WebElement cellComercial) {
        this.cellComercial = cellComercial;
    }

    public WebElement getCep() {
        return cep;
    }

    public void setCep(WebElement cep) {
        this.cep = cep;
    }

    public WebElement getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(WebElement numCasa) {
        this.numCasa = numCasa;
    }

    public WebElement getCompleto() {
        return completo;
    }

    public void setCompleto(WebElement completo) {
        this.completo = completo;
    }

    public WebElement getBotaoSalvar() {
        return botaoSalvar;
    }

    public void setBotaoSalvar(WebElement botaoSalvar) {
        this.botaoSalvar = botaoSalvar;
    }

    public WebElement getNoivo() {
        return noivo;
    }

    public void setNoivo(WebElement noivo) {
        this.noivo = noivo;
    }

    public WebElement getFeminino() {
        return Feminino;
    }

    public void setFeminino(WebElement feminino) {
        Feminino = feminino;
    }

    public WebElement getRoupa() {
        return roupa;
    }

    public void setRoupa(WebElement roupa) {
        this.roupa = roupa;
    }

    public WebElement getBancario() {
        return bancario;
    }

    public void setBancario(WebElement bancario) {
        this.bancario = bancario;
    }
}
