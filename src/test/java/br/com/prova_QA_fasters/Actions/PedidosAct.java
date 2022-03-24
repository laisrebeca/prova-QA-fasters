package br.com.prova_QA_fasters.Actions;

import br.com.prova_QA_fasters.Objects.PedidosObj;
import org.openqa.selenium.WebDriver;

public class PedidosAct {
    static PedidosObj pedidosObj;

    public PedidosAct(WebDriver driver) {
        pedidosObj = new PedidosObj(driver);

    }

    public void buscaPedidosSimples ()throws InterruptedException{
        Thread.sleep(1000);
        pedidosObj.getTelaPedidos().click();
        Thread.sleep(5000);
        pedidosObj.getBuscaSimples().sendKeys("248");
        Thread.sleep(5000);
        pedidosObj.getLupaPe().click();
        Thread.sleep(5000);
    }

    public void buscaPedidosAvancado ()throws InterruptedException{
        Thread.sleep(1000);
        pedidosObj.getTelaPedidos().click();
        Thread.sleep(3000);
        pedidosObj.getFiltro().click();
        Thread.sleep(3000);
        pedidosObj.getBuscaAvancada().click();
        pedidosObj.getNumeroProduto().sendKeys("248");
        Thread.sleep(3000);
        pedidosObj.getNomeCliente().sendKeys("CAROLINE BARBOSA");
        Thread.sleep(3000);
        pedidosObj.getSelecioneOpcao().click();
        Thread.sleep(3000);
        pedidosObj.getFormaPagamento().click();
        Thread.sleep(3000);
        pedidosObj.getEmAberto().sendKeys("18/03/2022");
        pedidosObj.getFechadoEm().sendKeys("18/03/2022");
        Thread.sleep(3000);
        pedidosObj.getSelecione2().click();
        Thread.sleep(3000);
        pedidosObj.getElementEntregue().click();
        Thread.sleep(3000);
        pedidosObj.getBuscarBotao().click();



    }
}
