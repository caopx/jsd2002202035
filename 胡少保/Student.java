package Test;

public class Student extends Person{
	int schoolId;
	Student(){
		
	}
	Student(String name,int age,int schoolId){
		super(name,age);
		this.schoolId=schoolId;
		
	}
	void showMessage() {
		System.out.println("ѧ������Ϣ�ǣ�������"+name+",���䣺"+age+",ѧ���ǣ�"+schoolId);
	}
	
}
