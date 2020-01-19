package advanced_java_assignment_annotaions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.TYPE)
@interface SmartPhone{
   String operatingSystem() default "Android";
   int version() default 1;
}
@SmartPhone(operatingSystem="Android oreo",version=8)
class Samsung{
	String Model;
	int size;
	public Samsung(String Model,int size) {
		this.Model=Model;
		this.size=size;
	}
}
public class Annotations {
   public static void main(String[] args) {
	   Samsung obj=new Samsung("S10",6);
	   Class c =obj.getClass();
	   Annotation an=c.getAnnotation(SmartPhone.class);
	   SmartPhone s=(SmartPhone)an;
	   System.out.println(s.operatingSystem());
	   System.out.println(s.version());
	   
	   
	   
   }
}
