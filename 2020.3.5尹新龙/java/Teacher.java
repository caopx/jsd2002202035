package Test202035.java;
public class Teacher extends Person{
String teacherId;
Teacher(String name,int age,String address,String teacherId){
	super(name,age,address);
	this.teacherId=teacherId;
	 System.out.println("大家好，我叫"+name+"今年"+age+"岁了，家住在"+address+"学号"+teacherId);
}
}
