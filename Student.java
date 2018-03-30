public class Student implements Comparable <Student> {
    
    private String surname;
    private String name;
    private String index;
    
    
    
    public Student(String surname, String name, String index) {
        this.surname = surname;
        this.name = name;
        this.index = index;
    }
    
    public Student() {}
    
    
    public String getSurname() {
        return surname;
    }
    
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String toString() {
		return name + " " + surname + " " + index;
    	
    }
    
    
    
    public boolean equals(Object object) {
    	if (object instanceof Student) {
      	  Student s = (Student)object;
      	  return this.index.equals(s.index);
      	}
    	return false;
    }



	@Override
	public int compareTo(Student o) {
		
		return index.compareTo(o.index);
	}
}