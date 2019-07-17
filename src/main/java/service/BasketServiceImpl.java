package service;


import model.Basket;
import model.Product;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BasketServiceImpl implements BasketService{

    List<Basket> cart;
    List<Product> productsAvailable;

    public BasketServiceImpl() {

        this.cart = new ArrayList<>();
        try {
            applyAvailableProducts();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

    }

    @Override
    public Basket add(Product product) {
        return null;
    }

    @Override
    public Basket remove(Product product) {
        return null;
    }

    @Override
    public int checkPrice(Basket basket) {
        return 0;
    }

    @Override
    public List<Product> getAllProducts(Basket basket) {
        return null;
    }


    private List<Product> applyAvailableProducts() throws Exception {
        if(this.productsAvailable.isEmpty()){

            this.productsAvailable.add(new Product("A", 40, 70,3 ));
            this.productsAvailable.add(new Product("B", 10, 15,2 ));
            this.productsAvailable.add(new Product("C", 10));
            this.productsAvailable.add(new Product("D", 25));

            return this.productsAvailable;
        }
        throw new Exception("Product list apply is not available if already exist.");
    }
}
