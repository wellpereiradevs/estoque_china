/*
import products.Products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Array para guardar os produtos
        Products[] products = new Products[51];

        //Inicialização de todas as posições com null
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }

        //Scanner de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Loop para cadastrar os produtos
        for (int i=0; i < products.length; i++) {
            //Null para posições vazias
            if (products[i] == null) {
                System.out.println("Posição de #" + (i + 1) + " está vazia. Preencha esta posição.");
            } else {
                // Lógica para imprimir o produto se a posição não estiver vazia
                System.out.println("Posição de #" + (i + 1) + ": " + products[i]);
            }

            //Mensagem de Limite Máximo do cadastro de produtos
            if (i == 50) {
                System.out.println("Limite máximo de 50 produtos atingidos");
                break;
            }

            //Cadastrando os Produtos
            System.out.println("Cadastro do Produto #" + (i + 1));

            System.out.print("Insira o código do produto: ");
            int code = scanner.nextInt();

            //Consumir a nova linha
            scanner.nextLine();

            System.out.print("Digite o nome do produto: ");
            String name = scanner.nextLine();

            System.out.print("Insira o preço de compra:R$");
            double price_purchase = scanner.nextDouble();

            System.out.print("Insira o preço de venda:R$");
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
            //Mostrar os produtos cadastrados
            for (Products product : products) {
                if (product != null) {
                    System.out.println(product);
                }
            }
        scanner.close();
    }
}
*/
