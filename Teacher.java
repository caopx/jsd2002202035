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
		System.out.println("老师的信息是：姓名："+name+",年龄是"+age+",工号是："+teacheld);
	}
}
