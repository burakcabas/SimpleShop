package model;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProducts();
    Product getProductByName(String name);


}
