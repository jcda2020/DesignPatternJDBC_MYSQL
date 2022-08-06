package app;

import java.util.Scanner;

import factorymethod.ProdutoFabricaConcretaPizzas;
import factorymethod.factory.ProductCreatorAbstract;
import factorymethod.produtoconcreto.Pizzas;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductCreatorAbstract food = null;

		Scanner leia = new Scanner(System.in);

		int opcaoFood;
		double peso, distancia;
		String nome;

		System.out.println("Digite uma das opções: \n 1 - para pizzas \n 2- para beirutes: ");
		opcaoFood = leia.nextInt();

		if (opcaoFood == 1) {

			food = new ProdutoFabricaConcretaPizzas();

			System.out.println("Digite o sabor: Mussarela, Mista... ");
			nome = leia.next();

			System.out.println("Digite o pesso (em gramas): 175 ou 900 ");
			peso = leia.nextDouble();

			System.out.println("Digite a distância, em quilômetro:  ");
			distancia = leia.nextDouble();

			if (distancia <= 3) {

				distancia = 0;
				System.out.println("Opa! Frete grátis!");
			}

			food.startProduct(nome, peso, distancia);

		}

	}

}
