package �ܿ�34;

public class Teacher extends Person{
	private int teacherId;
	
	Teacher(){	
	}
	Teacher(String name,int age,int teacherId){
		super(name,age);
		this.teacherId = teacherId;
	}
	
	void showMessage() {
		System.out.println("��ʦ����Ϣ��:" + name + ",����:" + age + ",����:" + teacherId);
	}
}