package �ܿ�34;

public class Student extends Person{
	private int schoolId;
	
	Student(){		
	}
	
	Student(String name,int age,int schoolId){
		super(name,age);
		this.schoolId = schoolId;
	}
	
	void showMessage() {
		System.out.println("ѧ������Ϣ��:����" + name+ ",����:" + age + ",ѧ��:" + schoolId);
	}
}
