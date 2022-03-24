package br.com.prova_QA_fasters.Actions;

import br.com.prova_QA_fasters.Objects.DashboardObj;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardAct {

    static DashboardObj dashboardObj;
    public DashboardAct(WebDriver driver){
        dashboardObj = new DashboardObj(driver);
    }

    public void abrirCaixa() throws InterruptedException{
        Thread.sleep(1000);
        dashboardObj.getAbrircaixa().click();
        dashboardObj.getValorInicialCaixa().sendKeys("110");
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(700);
        dashboardObj.getCaixa2().click();
        dashboardObj.getBotaoAbrir().click();
    }

    public void addPedidoCtodosPagamentos(WebDriver driver) throws InterruptedException{
        dashboardObj.getAddPedido().click();
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getTelefone().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(500);
        dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Café por elas");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getSelecioneOpcao().click();
        dashboardObj.getTransportadora().click();
        dashboardObj.getValorTrans().sendKeys("1000");
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgDinheiro().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("1623");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarD().click();
        Thread.sleep(3000);
        dashboardObj.getPgCartaoDebito().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("1507");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarCD().click();
        Thread.sleep(3000);
        dashboardObj.getPgCartaoCredito().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("1000");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarCC().click();
        Thread.sleep(3000);
        dashboardObj.getPgValeAlimento().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("1000");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarVA().click();
        Thread.sleep(3000);
        dashboardObj.getPgOutros().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("500");
        Thread.sleep(2000);
        dashboardObj.getSelecioneOpcao().click();
        dashboardObj.getPgPíx().click();
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarO().click();
        Thread.sleep(5000);
    }

   public void pagamentoDinheiro(WebDriver driver)throws InterruptedException{
       dashboardObj.getAddPedido().click();
       dashboardObj.getPedidoDelivery().click();
       dashboardObj.getSelecioneOpcao().click();
       Thread.sleep(1000);
       dashboardObj.getWhats().sendKeys(Keys.ENTER);
       dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
       dashboardObj.getBotaoConfirmar().click();
       Thread.sleep(700);
       dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
       Thread.sleep(3000);
       dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
       Thread.sleep(1000);
       dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       dashboardObj.getCampoPesquisa().sendKeys("Café por elas");
       Thread.sleep(2000);
       dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
       Thread.sleep(2000);
       dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
       Thread.sleep(2000);
       dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       dashboardObj.getFormaPagamento().click();
       Thread.sleep(1000);
       dashboardObj.getTipoEntrega().click();
       Thread.sleep(1000);
       dashboardObj.getSelecioneOpcao().click();
       dashboardObj.getTransportadora().click();
       dashboardObj.getValorTrans().sendKeys("1000");
       dashboardObj.getBotaoSalvar().click();
       Thread.sleep(1000);
       dashboardObj.getPgDinheiro().click();
       dashboardObj.getValorPago().clear();
       dashboardObj.getValorPago().sendKeys("5630");
       Thread.sleep(2000);
       dashboardObj.getBotoaoFinalizarD().click();
       dashboardObj.getBotaoFinalizar().click();
   }

    public void pagamentoCartaoD(WebDriver driver)throws InterruptedException{
        dashboardObj.getAddPedido().click();
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getAplicativo().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys("Café por elas");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getSelecioneOpcao().click();
        dashboardObj.getTransportadora().click();
        dashboardObj.getValorTrans().sendKeys("1000");
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgCartaoDebito().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("9430");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarCD().click();
        dashboardObj.getBotaoFinalizar().click();
    }

    public void pagamentoCartaoC(WebDriver driver)throws InterruptedException{
        dashboardObj.getAddPedido().click();
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getInstagram().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(500);
        dashboardObj.getCampoPesquisa().sendKeys("Café");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getSelecioneOpcao().click();
        dashboardObj.getTransportadora().click();
        dashboardObj.getValorTrans().sendKeys("1000");
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgCartaoCredito().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("5180");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarCC().click();
        dashboardObj.getBotaoFinalizar().click();
    }

    public void pagamentoValeA (WebDriver driver)throws InterruptedException{
        dashboardObj.getAddPedido().click();
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getFacebook().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(700);
        dashboardObj.getCampoPesquisa().sendKeys("Café");
        Thread.sleep(3000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getMotoBoy().click();
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgValeAlimento().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("4180");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarVA().click();
        dashboardObj.getBotaoFinalizar().click();
    }

    public void pagamentoOutros(WebDriver driver)throws InterruptedException{
//        Botão de ADD Lateral
        Thread.sleep(2000);
        dashboardObj.getAddPedidoBotaoL().click();
        Thread.sleep(1000);
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getTelefone().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Coffee");
        Thread.sleep(2000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Café Torrado");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getGratis().click();
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgOutros().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("8380");
        Thread.sleep(2000);
        dashboardObj.getSelecioneOpcao().click();
        dashboardObj.getPgPíx().click();
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarO().click();
        dashboardObj.getBotaoFinalizar().click();

    }


    public void arrastandoElementos(WebDriver driver)throws InterruptedException {
        WebElement elementoBase = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div[2]/div/div[1]"));
        WebElement elementoAlvo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div[3]/div"));
        Actions action = new Actions(driver);
        action.clickAndHold(elementoBase).moveToElement(elementoAlvo).release().build().perform();
    }


    public void botaoAceitar() throws InterruptedException{
        Thread.sleep(5000);
        dashboardObj.getBotaoAceitar().click();
        Thread.sleep(3000);
    }

    public void apenasDoisMetodosPagamento(WebDriver driver) throws InterruptedException{
        dashboardObj.getAddPedido().click();
        dashboardObj.getPedidoDelivery().click();
        dashboardObj.getSelecioneOpcao().click();
        Thread.sleep(1000);
        dashboardObj.getInstagram().sendKeys(Keys.ENTER);
        dashboardObj.getNomeCliente().sendKeys("JONATHAN FELIX");
        dashboardObj.getBotaoConfirmar().click();
        Thread.sleep(500);
        dashboardObj.getCampoPesquisa().sendKeys("Torrado");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys("Cafe Santa Monica Café Organico em Grãos");
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        dashboardObj.getCampoPesquisa().sendKeys(Keys.ENTER);
        dashboardObj.getFormaPagamento().click();
        Thread.sleep(1000);
        dashboardObj.getTipoEntrega().click();
        Thread.sleep(1000);
        dashboardObj.getMotoBoy().click();
        dashboardObj.getBotaoSalvar().click();
        Thread.sleep(1000);
        dashboardObj.getPgDinheiro().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("2180");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarD().click();
        Thread.sleep(3000);
        dashboardObj.getPgCartaoDebito().click();
        dashboardObj.getValorPago().clear();
        dashboardObj.getValorPago().sendKeys("2000");
        Thread.sleep(2000);
        dashboardObj.getBotoaoFinalizarCD().click();

    }
}
