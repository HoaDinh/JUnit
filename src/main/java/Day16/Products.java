package Day16;
import java.util.ArrayList;

public class Products {
    int id;
    String name;
    int quantity;
    double price;
    public Products() {

    }
    public Products(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    // Thêm sản phẩm vào danh sách
    public ArrayList<Products> addProduct() {
        ArrayList<Products> products = new ArrayList<Products>();
        products.add(new Products(100, "Socolate", 130, 124));
        products.add(new Products(110, "Candy", 15, 124));
        products.add(new Products(120, "Beer", 140, 125));
        products.add(new Products(130, "Noodle", 150, 126));
        products.add(new Products(140, "Cigar", 160, 127));
        System.out.println("Show up the list of products");
        for (Products p : products) {
            System.out.println(p);
        }
        return products;
    }

    // Tìm kiếm và sửa thông tin của sản phẩm
    public void searchProduct(ArrayList<Products> products, String productName) {
        System.out.println("Find the products called Cigar ");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(productName)) {
                System.out.println(products.get(i));
                products.set(i, new Products(products.get(i).id, "Noodle", products.get(i).quantity, 100));
            }
        }

        System.out.println("The item is after changing : ");
        for (Products p : products) {
            System.out.println(p);
        }
    }

    public void deleteProduct (ArrayList < Products > products,int productID){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id == productID) {
                System.out.println(products.get(i));
                products.remove(i);
            }
        }
        System.out.println("The list item has deleted:");
        for (Products p : products) {
            System.out.println(p);
        }
    }
}




