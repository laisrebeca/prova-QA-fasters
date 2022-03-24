package br.com.prova_QA_fasters.Actions;

import br.com.prova_QA_fasters.Objects.ClientesObj;
import org.openqa.selenium.WebDriver;

public class ClientesAct {
    static ClientesObj clientesObj;
    public ClientesAct(WebDriver driver){
        clientesObj = new ClientesObj(driver);
    }

    public void buscaSimplesClientes()throws InterruptedException{
        Thread.sleep(1000);
        clientesObj.getTelaClientes().click();
        Thread.sleep(2000);
        clientesObj.getBuscaCliente().sendKeys("USUARIO");
        Thread.sleep(2000);
        clientesObj.getLupaC().click();
        Thread.sleep(5000);
    }
    public void buscaAvancadoClientes ()throws InterruptedException{
        Thread.sleep(1000);
        clientesObj.getTelaClientes().click();
        Thread.sleep(3000);
        clientesObj.getFiltro().click();
        Thread.sleep(3000);
        clientesObj.getBuscaAvancada().click();
        Thread.sleep(1000);
        clientesObj.getCodCliente().sendKeys("2");
        Thread.sleep(2000);
        clientesObj.getNomeCliente().sendKeys("USUARIO 002");
        Thread.sleep(5000);
        clientesObj.getCellCliente().sendKeys("(12) 9 9666-666666");
        Thread.sleep(2000);
        clientesObj.getEndCliente().sendKeys("Rua Pica-Pau Amarelo");
        Thread.sleep(2000);
        clientesObj.getBuscarBotao().click();
        Thread.sleep(5000);
    }

    public void adicionarCliente () throws InterruptedException{
        Thread.sleep(1000);
        clientesObj.getTelaClientes().click();
        Thread.sleep(3000);
        clientesObj.getAddNovo().click();
        clientesObj.getName().sendKeys("LARRISSA");
        clientesObj.getSobrenome().sendKeys("Silva");
        clientesObj.getCartaoFidelidade().sendKeys("55");
        clientesObj.getCpf_cnpj().sendKeys("99999999999");
        Thread.sleep(2000);
        clientesObj.getRgId().sendKeys("000000000");
        Thread.sleep(2000);
        clientesObj.getDataNascimento().sendKeys("22121999");
        Thread.sleep(2000);
        clientesObj.getEstadoCivil().click();
        clientesObj.getNoivo().click();
        clientesObj.getGenero().click();
        clientesObj.getFeminino().click();
        clientesObj.getTipoCliente().click();
        clientesObj.getRoupa().click();
        clientesObj.getProfissao().click();
        clientesObj.getBancario().click();
        clientesObj.getContribuinte().click();
        clientesObj.getNcontribuinte().click();
        clientesObj.getNcontribuinte().click();
        clientesObj.getContribuinte().click();
        clientesObj.getNomePai().sendKeys("MARIO JOSE SILVA");
        clientesObj.getNomeMae().sendKeys("MARIA ALVES SILVA");
        clientesObj.getEmail().sendKeys("QA.eteste@gmail.com");
        Thread.sleep(2000);
        clientesObj.getCellPrincipal().sendKeys("77777777777");
        Thread.sleep(2000);
        clientesObj.getCellComercial().sendKeys("55555555555");
        Thread.sleep(2000);
        clientesObj.getCep().sendKeys("88060-368");
        Thread.sleep(2000);
        clientesObj.getNumCasa().sendKeys("200");
        Thread.sleep(2000);
        clientesObj.getCompleto().sendKeys("Rua da Prancha");
        Thread.sleep(2000);
        clientesObj.getBotaoSalvar().click();

    }

}
