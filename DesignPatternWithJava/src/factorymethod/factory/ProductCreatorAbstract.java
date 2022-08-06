package factorymethod.factory;

public abstract class ProductCreatorAbstract {

	



	protected abstract Produto createProduto();
	
	
	
	public void startProduct(String nome, double peso, double distancia) {
		  
		  Produto produto =  createProduto();
	  
		
		int codigo =  produto.montaFood(nome,peso);				   
		produto.calculaPrecoComFrete(codigo, distancia);
		
		
			System.out.println(produto.toString());
		  
		
	  }
	
	
}
