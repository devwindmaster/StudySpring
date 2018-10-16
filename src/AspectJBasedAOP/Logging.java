package AspectJBasedAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author DevWind 
 * Logging sẽ là phương tiện dùng chung được gọi mỗi khi 
 * cần thiết từ các xử lý khác nhau. 
 * Các method này cần phải PUBLIC để các method bên ngoài có thể gọi. 
 */
//Chú ý khai báo @Aspect ở đầu class. 
@Aspect
public class Logging {
	/**
	 * Khai báo pointcut. Tên của pointcut có vai trò tương tự như ID của nó khi 
	 * sử dụng xml làm config aspect.
	 * Khai báo execution ("execution(* AspectJBasedAOP.*.*(..))") có nghĩa là
	 * mọi methods ở package AspectJBasedAOP đều là đối tượng của các advices.
	 */
	@Pointcut("execution(* AspectJBasedAOP.*.*(..))")
	private void selectAll() {}
	
	/**
	 * method này sẽ thường được gọi TRƯỚC các xử lý chính.
	 * beforeAdvice cũng là một advice được gom chung tại pointCut
	 * do đó, mình khai báo thêm tên của pointCut(id) là gì. 
	 */
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("Processing BeforeAdvice...");
	}
	
	/**
	 * method này sẽ thường được gọi SAU các xử lý chính.
	 */
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("Processing AfterAdvice...");
	}
	
	/**
	 * method này sẽ thường được gọi mỗi khi xử lý chính RETURN Value
	 * @param retVal
	 */
	@AfterReturning(pointcut="selectAll()", returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Processing AfterReturningAdvice : " + retVal.toString());
	}
	
	/**
	 * method này sẽ thường được gọi mỗi khi EXCEPTION được quăng ra 
	 * từ các xử lý chính.
	 * @param ex
	 */
	@AfterThrowing(pointcut="selectAll()",throwing="ex")
	public void afterThrowingAdvice(Exception ex) {
		System.out.println("Processing afterThrowingAdvice: "+ ex.toString());
	}
}
