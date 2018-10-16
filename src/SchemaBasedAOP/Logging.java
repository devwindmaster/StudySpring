package SchemaBasedAOP;

/**
 * @author DevWind 
 * Logging sẽ là phương tiện dùng chung được gọi mỗi khi 
 * cần thiết từ các xử lý khác nhau. 
 * Các method này cần phải PUBLIC để các method bên ngoài có thể gọi. 
 */

public class Logging {
	/**
	 * method này sẽ thường được gọi TRƯỚC các xử lý chính.
	 */
	public void beforeAdvice() {
		System.out.println("Processing BeforeAdvice...");
	}
	
	/**
	 * method này sẽ thường được gọi SAU các xử lý chính.
	 */
	public void afterAdvice() {
		System.out.println("Processing AfterAdvice...");
	}
	
	/**
	 * method này sẽ thường được gọi mỗi khi xử lý chính RETURN Value
	 * @param retVal
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Processing AfterReturningAdvice : " + retVal.toString());
	}
	
	/**
	 * method này sẽ thường được gọi mỗi khi EXCEPTION được quăng ra 
	 * từ các xử lý chính.
	 * @param ex
	 */
	public void afterThrowingAdvice(Exception ex) {
		System.out.println("Processing afterThrowingAdvice: "+ ex.toString());
	}
}
