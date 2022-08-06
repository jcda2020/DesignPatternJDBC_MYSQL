package app;

import java.util.Scanner;

import factorymethod.ProductCreatorAbstract;
import factorymethod.fabricasconcretas.ProdutoFabricaConcretaBeirutes;
import factorymethod.fabricasconcretas.ProdutoFabricaConcretaPizzas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		ProductCreatorAbstract food = null;
		
		
		int opcaoFood;
		double peso, distancia;
		String nome;

		System.out.println("Digite uma das opções: \n 1 - para pizzas \n 2- para beirutes: ");
		opcaoFood = leia.nextInt();
		
		if (opcaoFood == 1) {
        //pizza
				food = new ProdutoFabricaConcretaPizzas();

			System.out.println("Digite o sabor: Mussarela, Mista... ");
			nome = leia.next();

			System.out.println("Digite o pesso (em gramas): 175 ou 900 ");
			peso = leia.nextDouble();

			System.out.println("Digite a distância, em quilômetros:  ");
			distancia = leia.nextDouble();

			if (distancia <= 3) {

				distancia = 0;
				System.out.println("Opa! Frete grátis!");
			}

			food.startProduct(nome, peso, distancia);

		}
		
		
		if (opcaoFood == 2) {
			//beiture
			
			food = new ProdutoFabricaConcretaBeirutes();
			
			food.startProduct("Beiture frango", 200.0, 3);
		}

		
		
	}

}
