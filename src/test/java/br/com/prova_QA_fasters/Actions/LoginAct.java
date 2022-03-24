package br.com.prova_QA_fasters.Actions;


import br.com.prova_QA_fasters.Objects.LoginObj;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginAct {

    static LoginObj loginObj;

    public LoginAct(WebDriver driver){
        loginObj = new LoginObj(driver);
    }

    public void loginFasters() throws InterruptedException {
        loginObj.getUsuario().sendKeys("QA.eteste");
        loginObj.getSenha().sendKeys("123456" + Keys.ENTER);

    }

    public void escolherFilial()  throws InterruptedException {
        Thread.sleep(2000);
        loginObj.getFilialescolha().sendKeys("Loja1"+ Keys.ENTER);

    }
}
