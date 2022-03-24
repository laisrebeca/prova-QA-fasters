package br.com.prova_QA_fasters.Testes;

import br.com.prova_QA_fasters.Actions.*;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes {

    static WebDriver driver;
    static LoginAct loginAct;
    static DashboardAct dashboardAct;
    static PedidosAct pedidosAct;
    static ProdutosAct produtosAct;
    static ClientesAct clientesAct;

    @BeforeEach
    void loginFasters() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\laisr\\eclipse-workspace\\prova-QA-fasters\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://fastgv-front-vercel.vercel.app");

        loginAct = new LoginAct(driver);
        loginAct.loginFasters();
        loginAct.escolherFilial();

    }

    @Test
    void test2() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.abrirCaixa();
    }

    @Test
    void test3() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.addPedidoCtodosPagamentos(driver);
        driver.close();
        System.out.println("Reportando Bug: Com todos os meios de Pagamentos Usuario digita o valor menor ou igual ao valor referente, mas consta como Erro.");
    }

    @Test
    void test3_1 () throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.apenasDoisMetodosPagamento(driver);
        driver.close();
        System.out.println("BUG: Site não aceita dos tipo diferentes de pagamento");

    }

    @Test
    void test4_pagamentoDinheiro() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.pagamentoDinheiro(driver);
        driver.close();
        System.out.println("Pedido Realizado com Sucesso!");

    }

    @Test
    void test5_pagamentoCartaoD() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.pagamentoCartaoD(driver);
        driver.close();
        System.out.println("Pedido Realizado com Sucesso!");
    }

    @Test
    void test6_PagamentoCartaoC() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.pagamentoCartaoC(driver);
        driver.close();
        System.out.println("Pedido Realizado com Sucesso!");
    }

    @Test
    void test7_PagamentoValeA() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.pagamentoValeA(driver);
        driver.close();
        System.out.println("Pedido Realizado com Sucesso!");
    }

    @Test
    void test8_PagamentoOutrosMeios() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        Thread.sleep(5000);
        dashboardAct.pagamentoOutros(driver);
        driver.close();
        System.out.println("Pedido Realizado com Sucesso!");
    }

    @Test
    void test9() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        dashboardAct.arrastandoElementos(driver);
    }

    @Test
    void test10_BotaoAceitar() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        dashboardAct = new DashboardAct(driver);
        dashboardAct.botaoAceitar();
        Thread.sleep(5000);
        driver.close();
        System.out.println("Mudança de Status para Em preparo");
    }

    @Test
    void test11() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pedidosAct = new PedidosAct(driver);
        pedidosAct.buscaPedidosSimples();
        driver.close();
        System.out.println("BUG: A Busca não acontece");
    }

    @Test
    void test12() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pedidosAct = new PedidosAct(driver);
        pedidosAct.buscaPedidosAvancado();
        Thread.sleep(5000);
        driver.close();
        System.out.println("BUG: A Busca não acontece");
    }

    @Test
    void test13() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        produtosAct = new ProdutosAct(driver);
        produtosAct.buscaSimplesProduto();
        Thread.sleep(2000);
        driver.close();
        System.out.println("Busca Realizada com Sucesso");
    }

    @Test
    void test14() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        produtosAct = new ProdutosAct(driver);
        produtosAct.buscaProdutosAvancado();
        Thread.sleep(2000);
        driver.close();
        System.out.println("Busca Realizada com Sucesso");
    }

    @Test
    void test15() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        produtosAct = new ProdutosAct(driver);
        produtosAct.addProduto();
        driver.close();
        System.out.println("Produto Adicionado com Sucesso!");
    }

    @Test
    void test16() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        produtosAct = new ProdutosAct(driver);
        produtosAct.addFornecedor();
        driver.close();
        System.out.println("Fornecedor Adicionado com Sucesso!");
    }

    @Test
    void test17() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        produtosAct = new ProdutosAct(driver);
        produtosAct.addFabricantes();
        driver.close();
        System.out.println("Fabricante Adicionado com Sucesso!");
    }

    @Test
    void test18() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clientesAct = new ClientesAct(driver);
        clientesAct.buscaSimplesClientes();
        driver.close();
        System.out.println("Busca simples por Clientes");

    }
    @Test
    void test19() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clientesAct = new ClientesAct(driver);
        clientesAct.buscaAvancadoClientes();
        driver.close();
        System.out.println("Busca avançada por Clientes");
    }

    @Test
    void test20() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clientesAct = new ClientesAct(driver);
        clientesAct.adicionarCliente();
        Thread.sleep(3000);
        driver.close();
        System.out.println("Adicionar novo Cliente");
    }

}
