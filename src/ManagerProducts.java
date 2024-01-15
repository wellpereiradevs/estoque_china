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
                case 2:
                    System.out.println();
                    System.out.println("Ótimo, vamos listar os produtos.");
                    listProduct();
                    break;
                case 3:
                    searchByCode();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    updateStock();
                    break;
                case 7:
                    stockMinimumProduct();
                    break;
                /*case 8:
                    productsWithMarginProfitOver50();
                    break;*/
                case 9:
                    System.out.println("Programa finalizado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println();
            }
        } while (option != 9);
    }

    /* Exibir o menu na tela */
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

            //Cadastro de Produtos
            System.out.print("Quantos produtos serão cadastrados? ");
            int quantityProducts = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            //Cadastro de acordo com a quantidade desejada
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

                //Criar objeto Produto e adicioná-lo ao array.
                products[i] = new Products(code, name, price_purchase, price_sale, minimum_stock, stock_quant);
                //Quebra de linha ao cadastrar um novo produto.
                System.out.println();

                //Limpar o buffer.
                scanner.nextLine();

                //Mensagem de Limite Máximo do cadastro de produtos.
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

    /* SEGUNDO MÉTODO: LISTAR PRODUTO */
    private static void listProduct() {
        System.out.println();
        System.out.println("LISTA DOS PRODUTOS CADASTRADOS");

        boolean productsRegistered = false;

        for (Products product : products) {
            if (product != null) {
                System.out.println("Código: " + product.getCode() +
                        ", Nome: " + product.getName() +
                        ", Preço de compra: " + product.getPrice_purchase() +
                        ", Preço de venda: " + product.getPrice_sale() +
                        ", Estoque mínimo: " + product.getMinimum_stock() +
                        ", Quantidade em estoque: " + product.getStock_quant());
                productsRegistered = true;
                System.out.println();
            }
        }
        if (!productsRegistered) {
            System.out.println("Nenhum produto cadastrado. Por favor, primeiro realize o cadastro!");
            System.out.println();
        }
    }

    /* TERCEIRO MÉTODO: PESQUISAR PRODUTO POR CÓDIGO */
    private static void searchByCode() {
        System.out.println();
        System.out.println("PESQUISA DO PRODUTO POR CÓDIGO");

        do {
            System.out.print("Para sair, digite 12.Para continuar, digite 10:  ");
            System.out.println();
            int number = scanner.nextInt();

            if (number == 12) {
                System.out.println("Você saiu. Até breve!");
                System.out.println("Para continuar, escolha uma opção no menu!");
                System.out.println();
                return;
            } else if (number == 10) {
                System.out.print("Digite o código do produto: ");
                int code = scanner.nextInt();

                boolean productsRegistered = false;

                for (Products product : products) {
                    if (product != null && code == product.getCode()) {
                        System.out.println("Encontramos o produto com o código informado.");
                        System.out.println("Código: " + product.getCode() +
                                ", Nome: " + product.getName() +
                                ", Preço de compra: " + product.getPrice_purchase() +
                                ", Preço de venda: " + product.getPrice_sale() +
                                ", Estoque mínimo: " + product.getMinimum_stock() +
                                ", Quantidade em estoque: " + product.getStock_quant());
                        productsRegistered = true;
                    }
                }
                System.out.println();
                if (!productsRegistered) {
                    System.out.println("Produto não encontrado com o código informado. Tente novamente.");
                    System.out.println();
                }
            }
        } while (true);
    }

    /* QUARTO MÉTODO: PESQUISAR PRODUTO POR NOME */
    private static void searchByName() {
        System.out.println();
        System.out.println("PESQUISA DO PRODUTO POR NOME");

        do {
            System.out.println("Para sair, digite 12.Para continuar, digite 10: ");
            int number = scanner.nextInt();

            if (number == 12) {
                System.out.println("Você saiu. Até breve.");
                System.out.println("Para continuar, escolha uma opção no menu!");
                System.out.println();
                return;
            } else if (number == 10) {
                System.out.print("Digite o nome do produto: ");
                scanner.nextLine();
                String name = scanner.nextLine();

                boolean productsRegistered = false;

                for (Products product : products) {
                    if (product != null && name.equals(product.getName())) {
                        System.out.println("Encontramos o produto com o nome informado.");
                        System.out.println("Nome: " + product.getName() +
                                ", Código: " + product.getCode() +
                                ", Preço de compra: " + product.getPrice_purchase() +
                                ", Preço de venda: " + product.getPrice_sale() +
                                ", Estoque mínimo: " + product.getMinimum_stock() +
                                ", Quantidade em estoque: " + product.getStock_quant());
                        productsRegistered = true;
                    }
                }
                System.out.println();
                if (!productsRegistered) {
                    System.out.println("Produto não encontrado com este nome. Tente novamente.");
                    System.out.println();
                }
            }
        } while (true);
    }

    /* QUINTO MÉTODO: EXCLUIR UM PRODUTO */
    private static void deleteProduct() {
        System.out.println();
        System.out.println("EXCLUIR UM PRODUTO");

        System.out.print("Digite o nome do produto: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        boolean productFound = false;

        for (int i = 0; i < products.length; i++) {
            Products product = products[i];
            if (product != null && name.equals(product.getName())) {
                System.out.println("Encontramos o produto com o nome informado.");
                System.out.println("Nome: " + product.getName() +
                        ", Código: " + product.getCode() +
                        ", Preço de compra: " + product.getPrice_purchase() +
                        ", Preço de venda: " + product.getPrice_sale() +
                        ", Estoque mínimo: " + product.getMinimum_stock() +
                        ", Quantidade em estoque: " + product.getStock_quant());

                System.out.print("Deseja realmente excluir este produto? (s/n): ");
                String confirmation = scanner.nextLine().toUpperCase();

                if (confirmation.equals("s")) {
                    //Caso o produto não seja excluído, será cancelado.
                    products[i] = null;
                    System.out.println("Produto excluído com sucesso.");
                } else {
                    System.out.println("Exclusão cancelada.");
                }

                productFound = true;
                break; //Não é necessário continuar procurando, após encontrar o produto.
            }
        }

        System.out.println();
        if (!productFound) {
            System.out.println("Não encontramos o produto com este nome. Tente novamente.");
            System.out.println();
        }

    }

        /* SEXTO MÉTODO: ATUALIZAR ESTOQUE DO PRODUTO */
        private static void updateStock() {
            System.out.println();
            System.out.println("ATUALIZAR ESTOQUE DE UM PRODUTO");

            System.out.print("Digite o nome do produto: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            boolean productFound = false;

            for (int i = 0; i < products.length; i++) {
                Products product = products[i];
                if (product != null && name.equals(product.getName())) {
                    System.out.println("Encontramos o produto com o nome informado.");
                    System.out.println("Nome: " + product.getName() +
                            ", Código: " + product.getCode() +
                            ", Preço de compra: " + product.getPrice_purchase() +
                            ", Preço de venda: " + product.getPrice_sale() +
                            ", Estoque mínimo: " + product.getMinimum_stock() +
                            ", Quantidade em estoque: " + product.getStock_quant());

                    System.out.print("Digite a quantidade a ser adicionada/subtraída ao estoque: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); //Limpar o buffer do scanner.

                    //Atualizar o estoque.
                    int newStock = product.getStock_quant() + quantity;
                    if (newStock < 0) {
                        System.out.println("A quantidade resultaria em um estoque negativo. Operação cancelada.");
                    } else {
                        product.setStock_quant(newStock);
                        System.out.println("Estoque atualizado com sucesso. Novo estoque: " + newStock);
                    }

                    productFound = true;
                    break; //Não é necessário continuar procurando, após encontrar o produto.
                }
            }

            System.out.println();
            if (!productFound) {
                System.out.println("Não encontramos o produto com este nome. Tente novamente.");
                System.out.println();
            }
        }

        /* SÉTIMO MÉTODO: PRODUTOS COM ESTOQUE MÍNIMO */
        private static void stockMinimumProduct() {
            System.out.println();
            System.out.println("PRODUTOS EM ESTOQUE MÍNIMO");

            boolean productsFound = false;

            for (Products product : products) {
                if (product != null && product.getMinimum_stock() < 50) {
                    System.out.println("Nome: " + product.getName() +
                            ", Código: " + product.getCode() +
                            ", Preço de compra: " + product.getPrice_purchase() +
                            ", Preço de venda: " + product.getPrice_sale() +
                            ", Estoque mínimo: " + product.getMinimum_stock() +
                            ", Quantidade em estoque: " + product.getStock_quant());

                    productsFound = true;
                }
            }

            if (!productsFound) {
                System.out.println("Não há produtos com estoque mínimo abaixo de 50.");
            }
            System.out.println();
        }
}




