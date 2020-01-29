package postgre;



import java.util.ArrayList;
import java.util.List;

public class products_mapper_class {
    private List<String>products = new ArrayList<String>();

    public void setProducts() {
        this.products.add("Dell-laptop");
        this.products.add("Lenovo-laptop");
        this.products.add("Samsung-laptop");
        this.products.add("Apple-laptop");
    }
    public List<String> getProducts(){
        return this.products;
    }
}
