package DataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;
public class ProdutoDataFactory {

    // Criando um produto
    public static ProdutoPojo criarProdutoComValorIgualA(double valor) {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Computador");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Mouse");
        componente.setComponenteQuantidade(1);
        componentes.add(componente);

        ComponentePojo componente2 = new ComponentePojo();
        componente2.setComponenteNome("Teclado");
        componente2.setComponenteQuantidade(1);
        componentes.add(componente2);

        produto.setComponents(componentes);

        return produto;
    }
}
