package task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Group one=new Group();
Student a=new Student("alex","Smirnov", "male", 21, 3);
Student b=new Student("alex","Petrov", "male", 21, 3);
Student c=new Student("alex","Drov", "male", 21, 3);
Student d=new Student("alex","Plov", "male", 21, 3);
one.addStudent(a);
one.addStudent(b);
one.addStudent(c);
one.addStudent(d);
one.show();
one.deleteStudentBySurname("smirnov");
one.show();
	}

}
