package �ܿ�34;

public class Person {
	String name;
	int age;

	Person(){	
	}
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	void showMessage(){
		System.out.println("����Ϊ:" + name);
		System.out.println("����Ϊ:" + age);
	}
}