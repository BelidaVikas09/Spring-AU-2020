package postgre;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Hibernate {
	public static products_mapper_class pr=new products_mapper_class();
	public static void show_products(){
      pr.setProducts();
      List<String>list;
      list=pr.getProducts();
      System.out.println("Products available:");
      for(String str:list){
           System.out.println(str);
	  }
	}

   public static void main(String args[]) {
   	     Scanner sc=new Scanner(System.in);
   	     int u_id;
   	     String pass_wd;
   	    User usr=new User();
        User user=new User();
	   LoginDetails ld=new LoginDetails();
	   user.setEmail("vikas@1262.com");
	   user.setPhone(543453);
	   user.setId(1009);
	   user.setName("vikas");
	   Address add=new Address();
	   add.setPin(1231);
	   add.setStreet("koramangala");
	   add.setCity("Hyderabad");
	   user.setAddress(add);
	   ld.setUsr_id(1263);
	   ld.setUser_name("VikasBelida");
	   ld.setPassword("Learning is a Continous Process");
//	   ld.setAddress(add);
	   SessionFactory sessionfactory= new Configuration().configure().buildSessionFactory();
	   Session session=sessionfactory.openSession();
	   session.beginTransaction();
	   Product p=new Product();
	   p.setCost(20000);
	   p.setP_id(1);
	   Electronics ec=new Electronics();
	   ec.setName("DELL-laptop");
	   ec.setP_id(10);
	   ec.setQuantity(12);
	   session.save(p);
	   session.save(ec);
	   Product p1=new Product();
	   p1.setCost(20000);
	   p1.setP_id(2);
	   Electronics ec1=new Electronics();
	   ec1.setName("Lenovo-laptop");
	   ec1.setP_id(11);
	   ec1.setQuantity(12);
	   session.save(p1);
	   session.save(ec1);
	   Product p2=new Product();
	   p2.setCost(20000);
	   p2.setP_id(3);
	   Electronics ec2=new Electronics();
	   ec2.setName("Apple-laptop");
	   ec2.setP_id(13);
	   ec2.setQuantity(12);
	   session.save(p2);
	   session.save(ec2);
	   Product p4=new Product();
	   p4.setCost(20000);
	   p4.setP_id(112);
	   Electronics ec3=new Electronics();
	   ec3.setName("Samsung-laptop");
	   ec3.setP_id(14);
	   ec3.setQuantity(12);
	   session.save(p4);
	   session.save(ec3);
	    session.save(user);
	   session.save(ld);
	   System.out.println("Enter your id:");
	   u_id=sc.nextInt();
	   String ss=sc.nextLine();
	   System.out.println("Enter your passwd:");
	   pass_wd=sc.nextLine();
	   String hql = "select usr_id, password, user_name FROM LoginDetails where usr_id=:u_id and password=:pass_wd";
	   Query query = session.createQuery(hql);
	   query.setInteger("u_id",u_id);
	   query.setString("pass_wd",pass_wd);
	   List results = query.list();
	   System.out.println(results);
       if(results.size()==0){
       	System.out.println("Enter valid details");
	   }
       else{
       	System.out.println("Logged in!");
	   }
       boolean var=true;
       System.out.println("shop any electronic item:");
       while(var){
       	   System.out.println("1. Show products");
		   System.out.println("2. Add products");
		   System.out.println("3. Place products");
		   System.out.println("4. Cancel products");
		   System.out.println("choose the option");
           int i=sc.nextInt();
           switch(i){
			   case 1:
			   	show_products();
			   	break;
			   case 2:
			   	System.out.println("enter the product u want");
			   	int option=sc.nextInt();
			   	if(option==1){
			   		System.out.println("item has been added!");
			   		user.setE(ec);
				}
			   	else if(option==2){
					System.out.println("item has been added!");
			   		user.setE(ec1);
				}
			   	else if(option==3){
					System.out.println("item has been added!");
			   		user.setE(ec3);
				}
			   	else if(option==4){
					System.out.println("item has been added!");
			   		user.setE(ec2);
				}
			   	else{
			   		System.out.println("choose right option");
				}
			   	break;
			   case 3:
			   	System.out.println("order has been succesfully placed");
			   	var =false;
			   	break;
			   case 4:
			   	   System.out.println("order has been cancelled");
			   	   var =false;
			   	   break;
			   default:
			   	var=false;
			   	break;
		   }
       }
	   session.getTransaction().commit();
	   session.close();
   }
}
