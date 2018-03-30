import java.util.List;
import java.util.ArrayList;


public class StudentRepository implements Repository {
	List<Student> students = new ArrayList<Student>();
	public void list() {
		
	}
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean doesExist(Student s) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getSortedList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
