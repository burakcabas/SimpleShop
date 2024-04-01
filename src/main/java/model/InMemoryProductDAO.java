package model;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDAO implements ProductDAO {
    private List<Product> products;

    public InMemoryProductDAO() {
        // Initialize the product list with some sample products
        this.products = new ArrayList<>();
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

}



