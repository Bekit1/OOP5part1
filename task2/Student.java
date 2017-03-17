package task2;

public class Student {
private String name;
private String surname;
private String sex;
private int age;
private int group;
public Student(String name, String surname, String sex, int age, int group) {
	super();
	this.name = name;
	this.surname = surname;
	this.sex = sex;
	this.age = age;
	this.group = group;
}
public Student() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getGroup() {
	return group;
}
public void setGroup(int group) {
	this.group = group;
}
@Override
public String toString() {
	return "Student [name=" + name + ", surname=" + surname + ", sex=" + sex + ", age=" + age + ", group=" + group
			+ "]";
}

}
