package ÷‹øº34;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = new Person[5];
		p[0] = new Teacher("aaa",21,1);
		p[1] = new Teacher("bbb",23,2);
		p[2] = new Student("ccc",20,1);
		p[3] = new Student("ddd",21,2);
		p[4] = new Student("eee",22,3);
		
		for(int i =0;i < p.length;i++) {
			p[i].showMessage();
		}
	}
}