package advanced_java_assignment_annotaions;
import java.lang.reflect.Method;
public class TestMethodAnno {
  public static void main(String args[]) throws Exception{
	  Samsungstar s=new Samsungstar(10000,4);
	  Method me=s.getClass().getMethod("getFeatures");
	  features feat=me.getAnnotation(features.class);
	  System.out.println("processor is: "+feat.Processor());
	  System.out.println("ram is: "+feat.ram());
	  
  }
}
