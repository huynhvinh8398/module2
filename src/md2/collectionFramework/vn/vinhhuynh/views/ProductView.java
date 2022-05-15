package md2.collectionFramework.vn.vinhhuynh.views;

import md2.collectionFramework.vn.vinhhuynh.model.Product;
import md2.collectionFramework.vn.vinhhuynh.services.IProductService;
import md2.collectionFramework.vn.vinhhuynh.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    IProductService productService = new ProductService();
    public Scanner scanner = new Scanner(System.in);

    //thêm sản phẩm
    public void addProduct() {
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)) {
            System.out.println("id này đã tồn tại");
        } else {
            System.out.println("Nhập vào tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.println("Nhập vào giá tiền sản phẩm: ");
            double price = Double.parseDouble(scanner.nextLine());
            Product products = new Product(id, name, price);
            productService.addProduct(products);
        }

    }

    // hiển thị sản phẩm
    public void displayProduct(List<Product> products) {
        System.out.println("-------------------Product----------------------");
        System.out.printf("%-10s %-20s %-20s\n", "ID", "Tên Sản Phẩm", "Giá sản phẩm");

        for (Product product : products) {
            System.out.printf("%-10d %-20s %-20s\n", product.getId(), product.getName(), product.getPrice());
        }
        System.out.println("---------------------------------------------------");
    }

    // sửa sản phẩm
    public void updateProduct() {
        if (productService.isEmpty()) {
            System.out.println("không có trong danh sách");

        } else {
            System.out.println("Nhập id sản phẩm cần sửa: ");
            int id = Integer.parseInt(scanner.nextLine());
            if (productService.existById(id)) {
                for (Product products : productService.findAll()) {
                    if (products.getId() == id)
                        System.out.println("có số thứ tự là" + id + ":" + products);
                    int choice;
                    do {
                        System.out.println("Menu edit Product");
                        System.out.println("1.Sửa id sản phẩm: ");
                        System.out.println("2.Sửa tên sản phẩm");
                        System.out.println("3.Sửa giá sản phẩm");
                        System.out.println("4.Hiển thị danh sách sản phẩm: ");
                        System.out.println("5.Quay trở lại menu");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Nhập id bạn muốn sửa đổi:");
                                id = Integer.parseInt(scanner.nextLine());
                                products.setId(id);
                                System.out.println("sửa id thành công");
                                break;
                            case 2:
                                System.out.println("Nhập tên bạn muốn sửa:");
                                String name = scanner.nextLine();
                                products.setName(name);
                                System.out.println("sửa tên thành công");
                                break;
                            case 3:
                                System.out.println("Nhập giá tiền bạn muốn sửa: ");
                                Double price = Double.parseDouble(scanner.nextLine());
                                products.setPrice(price);
                                System.out.println("sửa giá thành công");
                                break;
                            case 4:
                                displayProduct(productService.findAll());
                                break;
                            case 5:
                                showMenu();
                                break;
                            default:
                                System.out.println("nhập sai vui lòng nhập lại");
                        }
                    } while (choice != 0);
                }
            }
        }

    }

    //Tìm kiếm sản phẩm theo tên
    public void findProductByName(List<Product> products) {
        System.out.println("Tên sản phẩm cần tìm");
        String name = scanner.nextLine();
//        List<Product> newProducts = new ArrayList<>();
        for (Product product : products) {
            if (productService.exitsByName(name)) {
                displayProduct(productService.findProductByName(name));
              return;
            }
        }
        System.out.println("sản phẩm k có");
    }



    //xoá sản phẩm theo id
    public void deleteById() {
        System.out.println("Nhập id muốn xoá:");
        int id = Integer.parseInt(scanner.nextLine());
        if (productService.existById(id)){
            productService.deleteById(id);
            System.out.println("xoá sản phẩm thành công");
            return;
        }
        System.out.println("Id không tồn tại");
    }

    // hiện danh sách
    public void showMenu() {
        int choice = 0;
        do {
            System.out.println("❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ --MENU--❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ");
            System.out.println("❑    1.Thêm sản phẩm                                 ❑ ");
            System.out.println("❑    2.Sửa thông tin sản phẩm theo id                ❑ ");
            System.out.println("❑    3.Tìm kiếm sản phẩm theo tên                    ❑ ");
            System.out.println("❑    4.Xoá sản phẩm theo id                          ❑ ");
            System.out.println("❑    5.Hiển thị sản phẩm                             ❑ ");
            System.out.println("❑    6.Hiển thị sản phẩm theo giá từ thấp đến cao    ❑ ");
            System.out.println("❑    7.Hiển thị sản phẩm theo giá từ cao đến thấp5    ❑ ");
            System.out.println("❑    0.Thoát chương trình                            ❑ ");
            System.out.println("❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑ ❑  ❑ ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    findProductByName(productService.findAll());
                    break;
                case 4:
                    deleteById();
                    break;
                case 5:
                    displayProduct(productService.findAll());
                    break;
                case 6:
                    displayProduct(productService.findAllByPriceASC());
                    break;
                case 7:
                    displayProduct(productService.findAllByPriceDESC());
                    break;
                case 0:
                    System.out.println("0. Thoát chương trình");
                    break;
                default:
            }
        } while (choice != 0);

    }

}
