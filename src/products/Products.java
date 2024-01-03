package products;

public class Products {

    //Atributos da classe de Produtos
    private int code;
    private String name;
    private double price_purchase;
    private double price_sale;
    private int minimum_stock;
    private int stock_quant;

    //Método Construtor da classe de Produtos
    public Products(int code, String name, double price_purchase, double price_sale, int minimum_stock, int stock_quant) {
        this.code = code;
        this.name = name;
        this.price_purchase = price_purchase;
        this.price_sale = price_sale;
        this.minimum_stock = minimum_stock;
        this.stock_quant = stock_quant;
    }

    //Método Getters e Setters da classe de Produtos
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice_purchase() {
        return price_purchase;
    }

    public void setPrice_purchase(double price_purchase) {
        this.price_purchase = price_purchase;
    }

    public double getPrice_sale() {
        return price_sale;
    }

    public void setPrice_sale(double price_sale) {
        this.price_sale = price_sale;
    }

    public int getMinimum_stock() {
        return minimum_stock;
    }

    public void setMinimum_stock(int minimum_stock) {
        this.minimum_stock = minimum_stock;
    }

    public int getStock_quant() {
        return stock_quant;
    }

    public void setStock_quant(int stock_quant) {
        this.stock_quant = stock_quant;
    }
}
