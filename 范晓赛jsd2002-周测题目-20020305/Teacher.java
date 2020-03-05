package 周考34;

public class Teacher extends Person{
	private int teacherId;
	
	Teacher(){	
	}
	Teacher(String name,int age,int teacherId){
		super(name,age);
		this.teacherId = teacherId;
	}
	
	void showMessage() {
		System.out.println("老师的信息是:" + name + ",年龄:" + age + ",工号:" + teacherId);
	}
}