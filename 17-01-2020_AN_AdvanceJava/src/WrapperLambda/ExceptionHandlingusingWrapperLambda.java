package WrapperLambda;
import java.util.*;
import java.util.function.BiConsumer;
public class ExceptionHandlingusingWrapperLambda {
   public static void main(String args[]) {
	   int arr[]= {1,2,3,4,5,6,7,8,9,10};
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter key to divide:");
	   int div=sc.nextInt();
	   div_arr_with_key(arr,div,wrapperLambda((v,k)->System.out.println(v/k)));
   }
   public static void div_arr_with_key(int [] arr,int div,BiConsumer<Integer,Integer>consumer) {
	   for(int i:arr) {
		   consumer.accept(i,div);
	   }
   }
   public static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer>consumer){
	  return (v,k) ->{
		  try {
			  consumer.accept(v,k);
		  }
		  catch(ArithmeticException e) {
			  System.out.println("Exception caught");
		  }
	  };
   }
}
