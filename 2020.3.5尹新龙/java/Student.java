package Test202035.java;

public class Student extends Person{
          String schoolid;
          Student(String name ,int age,String address,String schoolid){
        	  super(name,age,address);
        	  this.schoolid=schoolid;
        	  System.out.println("��Һã��ҽ�"+name+"����"+age+"���ˣ���ס��"+address+"ѧ��"+schoolid);
          }
          
}
