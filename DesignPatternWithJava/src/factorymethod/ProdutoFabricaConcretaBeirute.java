package factorymethod;

import factorymethod.factory.ProductCreatorAbstract;
import factorymethod.factory.Produto;
import factorymethod.produtoconcreto.Beirutes;

public class ProdutoFabricaConcretaBeirute extends ProductCreatorAbstract {

	@Override
	protected Produto createProduto() {
		// TODO Auto-generated method stub
		return new Beirutes();
	}

}
