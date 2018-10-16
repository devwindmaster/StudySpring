package JDBCExample;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	/**
	 * Method dùng để init Database Resource ( Connection)
	 * @param ds
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * Method tạo record trong Table Student
	 * @param name
	 * @param age
	 */
	public void create(String name, Integer age);
	
	/**
	 * Method dùng truy xuất record của table Student sử dụng id
	 * @param id
	 * @return
	 */
	public Student getStudent(Integer id);
	
	/**
	 * Chọn toàn bộ record trong table Student
	 * @return
	 */
	public List<Student> listStudents();
	
	/**
	 * Method dùng delete 1 record trong table Student sử dụng id
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * Method dùng update 1 record trong table student
	 * @param id
	 * @param age
	 */
	public void update (Integer id, Integer age);
	
	/**
	 * Giả sử, Mình cần một method để search những students 
	 * nhưng lại không biết PK của nó.
	 * Vậy, một method tương tự như bên dưới có thể cần thiết. 
	 * @param age
	 * @param name
	 * @return
	 */
	public List<Student> getStudent(Integer age, String name); 
	
	/**
	 * Mình cần thêm một method nữa để xóa toàn bộ records
	 */
	public void deleteAll();
	
	/**
	 * Và 1 method reset lại serial
	 */
	public void resetSerial();	
}
