import java.util.ArrayList;
import java.util.Iterator;

public class StockManager {
    private ArrayList<Product> stock;

    public StockManager() {
        stock = new ArrayList<>();
    }

    public void addProduct(Product item) {
        stock.add(item);
    }

    public void delivery(int id, int quantity) {
        Iterator<Product> products = stock.iterator();
        while (products.hasNext()) {
            Product prod = products.next();
            if (prod.getId() == id) {
                prod.increaseQuantity(quantity);
                System.out.println("amount quantity added");
            }
        }
    }

    public Product findProduct(int id) {
        Iterator<Product> products = stock.iterator();

        while (products.hasNext()) {
            Product prod = products.next();
            if (prod.getId() == id) {
                return prod;
            }
        }

        return null;
    }

    public int numberInStock(int id) {
        Iterator<Product> products = stock.iterator();

        while (products.hasNext()) {
            Product prod = products.next();

            if (prod.getId() == id ) {
                return prod.getQuantity();
            }
        }

        return 0;
    }

    public void printProductDetails() {
        for (Product product : stock) {
            System.out.println(product.toString());
        }
    }

    
}
