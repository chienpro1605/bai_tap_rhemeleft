package chien.pro.service;

import chien.pro.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;
    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "John", 12000));
        products.put(2, new Product(2, "CHUONG", 5000));
        products.put(3, new Product(3, "phong", 3000));
        products.put(4, new Product(4, "alex", 5000));
        products.put(5, new Product(5, "canh", 4000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
