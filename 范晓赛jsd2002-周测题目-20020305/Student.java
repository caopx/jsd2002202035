package 周考34;

public class Student extends Person{
	private int schoolId;
	
	Student(){		
	}
	
	Student(String name,int age,int schoolId){
		super(name,age);
		this.schoolId = schoolId;
	}
	
	void showMessage() {
		System.out.println("学生的信息是:姓名" + name+ ",年龄:" + age + ",学号:" + schoolId);
	}
}
