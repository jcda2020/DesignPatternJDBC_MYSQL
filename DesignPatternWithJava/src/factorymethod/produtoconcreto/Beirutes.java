package factorymethod.produtoconcreto;

import factorymethod.factory.Produto;

public class Beirutes implements Produto{

	
	
	private String nomeB;
	private String sabor;
	private double peso;
	private double precoPizza;
	@Override
	public int montaFood(String tipo, double peso) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calculaPreco(int codigo) {
		return codigo;
		// TODO Auto-generated method stub
	
	}
	@Override
	public void calculaPrecoComFrete(int codigo, double distancia) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	


}
