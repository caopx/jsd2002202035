package Test202035.java;

public class Student extends Person{
          String schoolid;
          Student(String name ,int age,String address,String schoolid){
        	  super(name,age,address);
        	  this.schoolid=schoolid;
        	  System.out.println("大家好，我叫"+name+"今年"+age+"岁了，家住在"+address+"学号"+schoolid);
          }
          
}
