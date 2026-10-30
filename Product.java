package Lab_2;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;
    public Product(String name, double price, int quantity){
        if(price < 0)
            throw new IllegalArgumentException("Цена не может быть отрицательной");
        if(quantity < 0)
            throw new IllegalArgumentException("Количество товаров не может быть отрицательным");
        Name = name;
        Price = price;
        Quantity = quantity;
    }
    public void removeProduct(int requestProd){
        if (requestProd <= 0)
            throw new IllegalArgumentException("Количество должно быть больше нуля");
        if(requestProd > this.Quantity)
            throw new IllegalStateException("Недостаточно товаров на складе");
        Quantity -= requestProd;
    }
    public void addQuantity(int newQuantity){
        if(newQuantity < 0){
            throw new IllegalArgumentException("Количество товаров не может быть отрицательным");
        }
        Quantity += newQuantity;
    }
    public String getName(){
        return Name;
    }
    public int getQuantity(){
        return Quantity;
    }
    public double getPrice(){
        return Price;
    }
}
