import products.Products;


import java.util.Scanner;

public class ManagerProducts {
    private static Products[] products = new Products[51];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Opções do menu
        int option;
        do {
            displayMenu();
            System.out.print("Por favor, escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.println("Boa escolha. Vamos iniciar!");
                    registerProduct();
                    break;
                /*case 2:
                    listProduct();
                    clearScreen();
                    break;
                case 3:
                    searchByCode();
                    clearScreen();
                    break;
                case 4:
                    searchByName();
                    clearScreen();
                    break;
                case 5:
                    deleteProduct();
                    clearScreen();
                    break;
                case 6:
                    updateStock();
                    break;
                case 7:
                    stockMinimumProduct();
                    break;
                case 8:
                    productsWithMarginProfitOver50();
                    break;*/
                case 9:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println();
            }
        } while (option != 9);
    }

    private static void displayMenu() {
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1.Cadastrar produto");
        System.out.println("2.Listar produto");
        System.out.println("3.Pesquisar produto por código");
        System.out.println("4.Pesquisar produto por nome");
        System.out.println("5.Excluir um produto");
        System.out.println("6.Atualizar estoque");
        System.out.println("7.Produtos em estoque mínimo");
        System.out.println("8.Produtos com margem de lucro acima de 50%");
        System.out.println("9.Sair");
    }

    /* PRIMEIRO MÉTODO: CADASTRAR PRODUTO */
    private static void registerProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("HORA DE CADASTRAR O SEU PRODUTO");
        System.out.println();
        System.out.print("Quantos produtos serão cadastrados? ");
        int quantityProducts = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        for (int i = 0; i > quantityProducts; i++) {
            System.out.println("Digite um número válido");
        }

        //
        for (int i = 0; i < quantityProducts; i++) {
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

        //Mensagem de Limite Máximo do cadastro de produtos
        if (i + 1 == quantityProducts) {
            System.out.println("Seu cadastro com " + quantityProducts + " produtos foram realizados.");
            break;
        } else if (i + 1 == 50) {
            System.out.println("Limite máximo de 50 produtos atingidos!");
        }
    }
            System.out.println("Agora, voltaremos ao menu !");
            System.out.println();
   }
}




