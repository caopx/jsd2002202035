package 周考34;

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
		System.out.println("名字为:" + name);
		System.out.println("年龄为:" + age);
	}
}