package trilambda;
import java.util.Objects;
@FunctionalInterface
interface TriConsumer<A, B, C> {
     void accept(A a, B b,C c);
  

}
public class Trilambda {
 public static void concat_strings_triconsumer(String a,String b,String c,TriConsumer<String,String,String>consumer) {
		consumer.accept(a,b,c);   
	   }
   public static void main(String args[]) 
     {
	   String s1="virat";
	   String s2="kohli";
	   String s3="is awesome";
	   Trilambda tri=new Trilambda();
	   tri.concat_strings_triconsumer(s1, s2, s3,(a,b,c)->System.out.print(a+" "+b+" "+c));
	 }
   
}
