package md2.collectionFramework.vn.vinhhuynh.services;

import md2.collectionFramework.vn.vinhhuynh.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    public final ArrayList<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1,"ferari", 550000))  ;
        productList.add(new Product( 2, "audi",100000))   ;
        productList.add(new Product( 3, "ford", 700000))  ;

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void addProduct(Product newProduct) {
       productList.add(newProduct);
    }

    @Override
    public void updateProduct(Product newProduct) {
    productList.add(newProduct);
    }

    @Override
    public boolean existById(int id) {
        return findById(id) !=null;
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList){
            if (product.getId()==id)
                return product;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
            }
        }
    }

    @Override
    public Product findName(String name) {
        for (Product product : productList){
            if (product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean exitsByName(String name) {
        return findName(name) !=null;
    }

    @Override
    public List<Product> findProductByName(String name) {
        List<Product> findList = new ArrayList<>();
        for (Product product: productList){
            if (product.getName().contains(name))
                findList.add(product);
        }
        return findList;
    }

    @Override
    public List<Product> findAllByPriceDESC() {
        List<Product> sortByfrice = new ArrayList<>(productList);
        sortByfrice.sort(new SortByPriceDESC());
        return sortByfrice;
    }

    @Override
    public List<Product> findAllByPriceASC() {
        List<Product> sortByfrice = new ArrayList<>(productList);
        sortByfrice.sort(new SortByPriceASC());
        return sortByfrice;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
