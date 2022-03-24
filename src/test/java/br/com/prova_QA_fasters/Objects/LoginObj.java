package br.com.prova_QA_fasters.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObj {
    private WebDriver driver;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement usuario;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement senha;

    @FindBy(linkText = "//*[text()='Entrar']")
    private WebElement entrarlogin;

    @FindBy(xpath = "//*[text()='Filiais']")
    private WebElement campoFilial;

    @FindBy(xpath = "//*[@id=\"combo-box-demo\"]")
    private WebElement filialescolha;

    public LoginObj(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFilialescolha() {
        return filialescolha;
    }

    public void setFilialescolha(WebElement filialescolha) {
        this.filialescolha = filialescolha;
    }

    public WebElement getCampoFilial() {
        return campoFilial;
    }

    public void setCampoFilial(WebElement campoFilial) {
        this.campoFilial = campoFilial;
    }

    public WebElement getUsuario() {
        return usuario;
    }

    public void setUsuario(WebElement usuario) {
        this.usuario = usuario;
    }

    public WebElement getSenha() {
        return senha;
    }

    public void setSenha(WebElement senha) {
        this.senha = senha;
    }

    public WebElement getEntrarlogin() {
        return entrarlogin;
    }

    public void setEntrarlogin(WebElement entrarlogin) {
        this.entrarlogin = entrarlogin;
    }

}
