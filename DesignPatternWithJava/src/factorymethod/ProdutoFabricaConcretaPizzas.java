package factorymethod;

import factorymethod.factory.ProductCreatorAbstract;
import factorymethod.factory.Produto;
import factorymethod.produtoconcreto.Pizzas;

public class ProdutoFabricaConcretaPizzas extends ProductCreatorAbstract {



	@Override
	protected Produto createProduto() {
		// TODO Auto-generated method stub
		return new Pizzas();
	}

	
	
	
	
}
