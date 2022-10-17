public class StockDemo {
    private StockManager manager;

    public StockDemo() {
        manager = new StockManager();
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
    }

    public void demo() {
        manager.printProductDetails();;
        manager.delivery(132, 5);;
        manager.printProductDetails();
        System.out.println("Testing");
    }

    public static void main(String[] args) {
        StockDemo stockDemo1 = new StockDemo();
        stockDemo1.demo();
        
    }
}
