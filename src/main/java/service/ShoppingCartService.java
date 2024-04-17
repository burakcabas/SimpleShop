package service;

import model.Product;
import model.ProductDAO;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService {
    private ProductDAO productDAO;
    private List<Product> cartItems;

    public ShoppingCartService(ProductDAO productDAO){
        this.productDAO = productDAO;
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(String productName) {
        Product product = productDAO.getProductByName(productName);
        if(product != null) {
            cartItems.add(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void removeProduct(String productName) {
        // implement logic to remove product from cart by name
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for(Product product : cartItems){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
