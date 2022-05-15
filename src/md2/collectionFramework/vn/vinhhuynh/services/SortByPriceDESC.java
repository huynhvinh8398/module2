package md2.collectionFramework.vn.vinhhuynh.services;

import md2.collectionFramework.vn.vinhhuynh.model.Product;

import java.util.Comparator;

public class SortByPriceDESC implements Comparator<Product> {
    @Override
    public int compare(Product productOne, Product productTwo) {
        double result = productTwo.getPrice()-productOne.getPrice();
        if (result >0) {
            return 1;
        } else if (result<0) {
            return -1;
        } else {
            return 0;
        }
    }
}
