package Test202035.java;

public class Test {

	public static void main(String[] args) {
	 Person[]ps=new Person[4];
	 ps[0]=new Student("aaa",23,"li","123");
	 ps[1]=new Student("da",23,"li","456");
	 ps[2]=new Teacher("aas",23,"li","789");
	 ps[3]=new Teacher("ass",23,"li","012");
	
	 for(int i=0;i<ps.length;i++) {
		 System.out.println(ps[i].name);
 	  ps[i].SayHi();
	 }
				
	}
}
