package br.com.prova_QA_fasters.Actions;

import br.com.prova_QA_fasters.Objects.ProdutosObj;
import org.openqa.selenium.WebDriver;

public class ProdutosAct {
    static ProdutosObj produtosObj;

    public ProdutosAct(WebDriver driver) {
        produtosObj = new ProdutosObj(driver);
    }

    public void buscaSimplesProduto()throws InterruptedException{
        Thread.sleep(1000);
        produtosObj.getTelaProdutos().click();
        produtosObj.getBusca().sendKeys("Torrado");
        Thread.sleep(5000);
        produtosObj.getLupaP().click();
    }

    public void buscaProdutosAvancado ()throws InterruptedException{
        Thread.sleep(1000);
        produtosObj.getTelaProdutos().click();
        Thread.sleep(3000);
        produtosObj.getFiltro().click();
        Thread.sleep(3000);
        produtosObj.getBuscaAvancada().click();
        Thread.sleep(1000);
        produtosObj.getCodigoProduto().sendKeys("145");
        Thread.sleep(2000);
        produtosObj.getNameProduto().sendKeys("Perto do coração selvagem");
        Thread.sleep(5000);
        produtosObj.getBuscarBotao().click();
        Thread.sleep(5000);
    }

    public void addProduto()throws InterruptedException{
        Thread.sleep(2000);
        produtosObj.getTelaProdutos().click();
        Thread.sleep(2000);
        produtosObj.getAddNovo().click();
        Thread.sleep(2000);
        produtosObj.getNomeProduto().sendKeys("O Essencial da Segunda Guerra Mundial");
        Thread.sleep(2000);
        produtosObj.getCondicao().click();
        Thread.sleep(2000);
        produtosObj.getNovo().click();
        Thread.sleep(2000);
        produtosObj.getTipo().click();
        Thread.sleep(2000);
        produtosObj.getProduto().click();
        Thread.sleep(2000);
        produtosObj.getSubTipo().click();
        Thread.sleep(2000);
        produtosObj.getFisico().click();
        Thread.sleep(2000);
        produtosObj.getCategoria().click();
        Thread.sleep(2000);
        produtosObj.getLivros().click();
        Thread.sleep(2000);
        produtosObj.getNomeAdicional().sendKeys("por Dimas da Cruz Oliveira");
        Thread.sleep(2000);
        produtosObj.getTag().sendKeys("Livro, leitura, literatura, aprendizagem, clássico");
        Thread.sleep(2000);
        produtosObj.getDiscricaoCurta().sendKeys("Caixa com 3 Volumes");
        Thread.sleep(2000);
        produtosObj.getDiscricao().sendKeys("Box o Essencial da Segunda Guerra Mundial: Grandes LíderesMuitos líderes emergiram um pouco antes ou durante o mais terrível conflito de todos os tempos: a Segunda Guerra Mundial. Esses líderes são responsáveis pelo conflito, seja do lado do Eixo derrotado seja do lado dos Aliados vencedores; mas quem são eles? São homens que, por sua posição política e capacidade de atrair multidões, se destacaram do começo ao fim do conflito.");
        Thread.sleep(2000);
        produtosObj.getPrecoDoProduto().click();
        Thread.sleep(2000);
        produtosObj.getPrecoVenda().sendKeys("3500");
        Thread.sleep(2000);
        produtosObj.getControleEstoque().click();
        Thread.sleep(2000);
        produtosObj.getQuantidadeEstoque().sendKeys("60");
        Thread.sleep(2000);
        produtosObj.getUnidadeMedida().click();
        Thread.sleep(2000);
        produtosObj.getUnidade().click();
        Thread.sleep(2000);
        produtosObj.getBotaoSalvar().click();
    }


    public void addFornecedor() throws InterruptedException{
        Thread.sleep(2000);
        produtosObj.getTelaProdutos().click();
        Thread.sleep(2000);
        produtosObj.getFornecedores().click();
        Thread.sleep(2000);
        produtosObj.getAddNovo().click();
        Thread.sleep(2000);
        produtosObj.getName().sendKeys("teste fornecedor");
        Thread.sleep(2000);
        produtosObj.getCpf_cnpj().sendKeys("99.999.999/9999-99");
        Thread.sleep(2000);
        produtosObj.getEmail().sendKeys("fast.qa.eteste@gmail.com");
        Thread.sleep(2000);
        produtosObj.getBotaoSalvar().click();
        Thread.sleep(10000);
    }

    public void addFabricantes() throws InterruptedException{
        Thread.sleep(2000);
        produtosObj.getTelaProdutos().click();
        Thread.sleep(2000);
        produtosObj.getFabricantes().click();
        Thread.sleep(2000);
        produtosObj.getAddNovo().click();
        Thread.sleep(2000);
        produtosObj.getName().sendKeys("teste fabrica");
        Thread.sleep(2000);
        produtosObj.getCpf_cnpj().sendKeys("99.999.999/9999-99");
        Thread.sleep(2000);
        produtosObj.getEmail().sendKeys("fast.qa.eteste@gmail.com");
        Thread.sleep(2000);
        produtosObj.getBotaoSalvar().click();
        Thread.sleep(10000);
    }
}
