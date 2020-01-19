package advanced_java_assignment_annotaions;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)
@interface features{
	int ram() default 4;
	String Processor() default "SnapDragon";
} 
class Samsungstar{
	int cost;
	int warranty;
	public Samsungstar(int cost,int warranty){
		this.cost=cost;
		this.warranty=warranty;
	}
	@features(ram=6,Processor="Exynos")
	public void getFeatures() {
		System.out.println(cost);
	}
}

