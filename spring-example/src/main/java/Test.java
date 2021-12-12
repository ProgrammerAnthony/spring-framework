import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Anthony
 * @create 2021/12/12
 * @desc
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		System.out.println(context.getBean(Test.class));
	}
}
