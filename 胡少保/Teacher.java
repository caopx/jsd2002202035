package Test;

public class Teacher extends Person{
	int teacheld;
	Teacher(){
		
	}
	Teacher(String name,int age,int teacheld){
		
		super(name,age);
		this.teacheld=teacheld;
	}
	void showMessage() {
		System.out.println("��ʦ����Ϣ�ǣ�������"+name+",������"+age+",�����ǣ�"+teacheld);
	}
}
