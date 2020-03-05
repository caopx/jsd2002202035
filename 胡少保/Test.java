package Test;

public class Test {

	public static void main(String[] args) {
		Person[] p=new Person[5];
		p[0]=new Teacher("aaa",23,001);
		p[1]=new Teacher("bbb",24,002);
		p[2]=new Student("ccc",25,003);
		p[3]=new Student("ddd",25,004);
		p[4]=new Student("eee",26,005);
		for(int i=0;i<p.length;i++) {
			p[i].showMessage();
		}
	}

}
