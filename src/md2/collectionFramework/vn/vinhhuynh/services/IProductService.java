package md2.collectionFramework.vn.vinhhuynh.services;

import md2.collectionFramework.vn.vinhhuynh.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct(Product newProduct);
    void  updateProduct(Product newProduct);
    boolean existById(int id);
    Product findById(int id);
    void deleteById(int id);
    Product findName(String name);
    boolean exitsByName(String name);
    List<Product> findProductByName(String name);
    List<Product> findAllByPriceDESC();
    List<Product> findAllByPriceASC();
    boolean isEmpty();
}
