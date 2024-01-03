import products.Products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Array para guardar os produtos
        Products[] products = new Products[50];

        //Scanner de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Loop para cadastrar os produtos
        for (int i=0; i < products.length; i++) {
            System.out.println("Cadastro do Produto #" + (i + 1));

            System.out.print("Insira o código do produto: ");
            int code = scanner.nextInt();

            //Consumir a nova linha
            scanner.nextLine();

            System.out.print("Digite o nome do produto: ");
            String name = scanner.nextLine();

            System.out.print("Insira o preço de compra:");
            double price_purchase = scanner.nextDouble();

            System.out.print("Insira o preço de venda:");
            double price_sale = scanner.nextDouble();

            System.out.print("Digite o estoque mínimo: ");
            int minimum_stock = scanner.nextInt();

            System.out.print("Digite a quantidade em estoque: ");
            int stock_quant = scanner.nextInt();

            //Criar objeto Produto e adicioná-lo ao array
            products[i] = new Products(code, name, price_purchase, price_sale, minimum_stock, stock_quant);
            //Quebra de linha ao cadastrar um novo produto
            System.out.println();

            //Limpar o buffer
            scanner.nextLine();
        }
    }
}
