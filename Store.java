package Lab_2;

import java.util.Map;
import java.util.HashMap;

public class Store {
    private Map<String, Product> store = new HashMap<>();
    public int getQuantity(String name) {
        if (name == null || !store.containsKey(name)) {
            throw new IllegalStateException("Такого товара нет в магазине");
        }
        return store.get(name).getQuantity();
    }
    public void add_Product(String name, double price, int quantity){
        store.put(name, new Product(name, price, quantity));
    }
    public void add_QuantityProduct(String name, int quantity){
        if(store.containsKey(name)){
            store.get(name).addQuantity(quantity);
        }
    }
    public double buyProduct(String name, int quantity){
        if(quantity <= 0){
            throw new IllegalArgumentException("Количество для покупки должно быть больше нуля");
        }
        if(name == null || !store.containsKey(name)){
            throw new IllegalStateException("Такого товара нет в магазине");
        }
        Product prod = store.get(name);
        prod.removeProduct(quantity);
        return prod.getPrice() * quantity;
    }
    public void writeOffProduct(String name, int quantity){
        if(name == null || !store.containsKey(name)){
            throw new IllegalStateException("Такого товара нет в магазине");
        }
        store.get(name).removeProduct(quantity);
    }
}

