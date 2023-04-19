package model;

public class Product {

    private String code;
    private String nameProduct;
    private float price;
    private int quantity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String code, String nameProduct, float price, int quantity) {
        this.code = code;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;


    }
}
