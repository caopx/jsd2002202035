package Test202035.java;
public class Teacher extends Person{
String teacherId;
Teacher(String name,int age,String address,String teacherId){
	super(name,age,address);
	this.teacherId=teacherId;
	 System.out.println("��Һã��ҽ�"+name+"����"+age+"���ˣ���ס��"+address+"ѧ��"+teacherId);
}
}
