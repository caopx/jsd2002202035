package Test202035.java;

public class Person {
String name;
int age;
String address ;

Person(String name,int age,String address){
	this.name=name;
	this.age=age;
	this.address=address;
	
}
void SayHi(){
	System.out.println("大家好，我叫"+name+"今年"+age+"岁了，家住在"+address);
}
}
