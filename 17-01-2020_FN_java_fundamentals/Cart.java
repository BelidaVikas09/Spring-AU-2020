import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product{
    private int product_id,rate,Quantity_available;
    private String productName;
    public Product(int pid,int rate,int quantity_available,String name){
        this.product_id=pid;
        this.productName=name;
        this.Quantity_available=quantity_available;
        this.rate=rate;
    }

    public int getProduct_id() {
        return product_id;
    }
    public int getQuantity_available() {
        return Quantity_available;
    }
    public int getRate() {
        return rate;
    }
    public String getProductName() {
        return productName;
    }
    public void setQuantity_available(int quantity_available) {
        Quantity_available = quantity_available;
    }
}
class Order{
    private int order_id;
    private String user_name;
    ArrayList<Product>prod=new ArrayList<Product>();
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_name() {
        return user_name;
    }

    public ArrayList<Product> getProd() {
        return prod;
    }
    public void setProd(Product prod) {
        this.prod.add(prod);
    }
}
public class Cart {
    public static void Showproducts(HashMap<Integer,Product>pro){
        for(Map.Entry ele:pro.entrySet()){
            int i=(int)ele.getKey();
            Product prod=(Product) ele.getValue();
            System.out.println("Product_ID:"+ prod.getProduct_id());
            System.out.println("Product_name:"+prod.getProductName());
            System.out.println("Rate:"+prod.getRate());
            System.out.println("Qunatity_available:"+prod.getQuantity_available());
            System.out.println("------------------------------------------------------");
        }
    }
    public static void AddtoCart(Order ord,HashMap<Integer,Product>pro){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the product_id:");
        int id=sc.nextInt();
        Product p=pro.get(id);
        ord.setProd(p);
    }
    public static  void ShowCart(Order ord){
        System.out.println("Order_id:"+ ord.getOrder_id());
        System.out.println("User_name:"+ord.getUser_name());
        System.out.println("**************************************************************");
        System.out.println("Products in your cart are:");
        ArrayList<Product>arr=ord.getProd();
        int total=0;
        int size=arr.size();
        for(int i=0;i<size;i++){
            Product pr=arr.get(i);
            total+=pr.getRate();
            System.out.println("Product_id:"+pr.getProduct_id()+"  "+"Product_name:"+pr.getProductName()+"  "+"Product_rate:"+pr.getRate());
        }
        System.out.println("total cost till now:"+total);
        System.out.println("**************************************************************");
    }
    public static void remove(Order ord){
        Scanner sc=new Scanner(System.in);
        System.out.println("**************************************************************");
        System.out.println("enter the Product_id to be removed:");
        int id=sc.nextInt();
        ArrayList<Product>pro=ord.getProd();
        int size=pro.size();
        for(int i=0;i<size;i++){
            if(id==pro.get(i).getProduct_id()){
                System.out.println("Item "+ pro.get(i).getProductName()+" removed Successfully!");
                pro.remove(pro.get(i));
                size--;
            }
        }
        System.out.println("**************************************************************");
    }
    public static void main(String args[]){
        HashMap<Integer,Product>pro=new HashMap<Integer, Product>();
        pro.put(1,new Product(1,1000,10,"head and shoulder Shampoo"));
        pro.put(2,new Product(2,2000,15,"WildStone Soap"));
        pro.put(3,new Product(3,3000,5,"Fogg Deo"));
        pro.put(4,new Product(4,4000,20,"Axe Deo"));
        pro.put(5,new Product(5,2000,18,"Hair wax"));
        pro.put(6,new Product(6,200,19,"Oreo Biscuits"));
        pro.put(7,new Product(7,500,20,"Bourbon Biscuits"));
        System.out.println("********************Welcome to the cart*************************");
        boolean var=true;
        //System.out.println("want to see products and add to cart:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String user_name=sc.next();
        int ord_id=1;
        Order ord=new Order();
        ord.setOrder_id(ord_id);
        ord.setUser_name(user_name);
        ArrayList<Order>placed_orders=new ArrayList<Order>();
        while(var){
            System.out.println("Select an option among the options");
            System.out.println("1. for Show Products");
            System.out.println("2. for Add to Cart");
            System.out.println("3. for Show items in my Cart");
            System.out.println("4. for Remove Product from cart");
            System.out.println("5. for place Order");
            System.out.println("6. for Cancel the Order");
            System.out.print("Select an option among the above options:");
            int option=sc.nextInt();
            switch (option){
                case 1:
                     Showproducts(pro);
                     break;
                case 2:
                     AddtoCart(ord,pro);
                     break;
                case 3:
                    ShowCart(ord);
                    break;
                case 4:
                    remove(ord);
                    break;
                case 5:
                      System.out.println("Order has been placed!");
                      var=false;
                      placed_orders.add(ord);
                      break;
                case 6:
                    ord.getProd().clear();
                    System.out.println("Order has been cancelled!");
                    var=false;
                    break;
                default:
                    System.out.println("Enter valid id:");
                    break;
            }
        }
        System.out.println("Thank you "+ user_name+ " and visit again!");
    }
}
