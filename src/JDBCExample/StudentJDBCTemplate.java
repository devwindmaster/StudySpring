package JDBCExample;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name,age) values (?,?)";
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + "Age = " + age);
		return;
	}

	@Override
	/* 
	 * Điều gì đang xảy ra? 
	 * JDBCTemplate sẽ query câu SQL, tạo 1 array với 1 elements là object có giá trị = id
	 * object này sau đó được map với các giá trị còn lại của Student ( name, age ) để trả 
	 * về 1 record hoàn chỉnh. Record này sau đó lại được set cho các fields tương ứng của 
	 * Object Student để trả về 1 object student hoàn chỉnh. 
	 */
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject
				(SQL, new Object[] {id},new StudentMapper());
		return student;
	}

	/* 
	 * Khác với get 1 student ở trên. getStudents gồm 1 list những student được return.
	 * Vì không cụ thể là id nào, cho nên toàn bộ id có trong Student sẽ được dùng làm key
	 * để map với các object student, sau đó cho vào list rồi return.
	 */
	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record With ID : " + id);
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?" ;
		// chú ý trình tự của các param cần thay trong SQL
		jdbcTemplateObject.update(SQL,age,id);
		System.out.println("Updated Record with ID = " + id);
		
	}

	/* 
	 * Khác với method getStudent(id) ở trên, method dưới đây overload,
	 * sử dụng age và name để tạo objects, dồn vào list rồi trả lại kết quả.
	 * Nếu interface StudentDao không định nghĩa method này thì method này khi được gọi sẽ phát sinh lỗi
	 * 
	 */
	@Override
	public List<Student> getStudent(Integer age, String name) {
		String SQL = "select * from student where age = ? and name = ?";
		List<Student> students = jdbcTemplateObject.query(SQL,new Object[] {age,name},new StudentMapper());
		return students;
	}

	@Override
	public void deleteAll() {
		String SQL = "delete from Student";
		jdbcTemplateObject.update(SQL);
		System.out.println("Deleted All Record ");
		return;
		
	}

	@Override
	public void resetSerial() {
		String SQL = "ALTER SEQUENCE student_id_seq RESTART WITH 1";
		jdbcTemplateObject.update(SQL);
		System.out.println("SERIAL SEQUENCE RESET!");
		return;
	}

}
