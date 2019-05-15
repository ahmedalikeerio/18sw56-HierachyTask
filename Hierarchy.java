class Person{
	String name;
	public void getName(){
		name="Ahmed Ali";
		System.out.println("Name :"+name);
	}}
	class Student extends person{
		String studentname;
		public void getStName(){
			studentname="Ahmed Ali";
			System.out.println("Student Name :"+studentname);
		}}
		class Employe extends Person{
			String employename;
			public void getEmpName(){
				employename="Usama";
				System.out.print("Employe name: "+employename);}
			}
			class UnderGraduate extends Student{
				String degname;
				public void showDegree(){
				degname="Matriculation"	;
				System.out.println("undergraduate degre:"+degname);
				}
			}
			class Graduate extends Student{
				String degname;
				public void showDegree(){
				degname="BE Software";
				System.out.println("graduate degre:"+degname);
							}
			}
			class Faculty extends Employe{
							String faculty;
							public void showFaculty(){
							faculty="Teacher"	;
							System.out.println("I am a"+faculty);
							}
			}
			class Staff extends Employe{
										String staff;
										public void showStaff(){
										staff="Professor"	;
										System.out.println("I am a"+faculty);
										}
			}
			class Master extends Graduate{
						String deg;
						public void showDegree(){
						deg="master in artificial intelligence";
						System.out.println("masater Degree :"+deg);
										}
			}
			class Doctoral extends Graduate{
						String deg;
						public void showDegree(){
						deg="phd in artificial intelligence";
						System.out.println("doctoral Degree :"+deg);
						}
			}
			class NonDegree extends Graduate{
						String deg;
						public void showDegree(){
						deg="I am wando";
						System.out.println(deg);
						}
			}
class Hierarchy{
	public static void main(String[]args){
		Person p=new Person();
		Student s=new Student();
		Employe e=new Employe();
		Graduate g=new Graduate();
		p.getStName();
		p.getEmpName();
		s.showDegree();
		s.showDegree();
		e.showFaculty();
		e.showStaff();
		g.showDegree();
		g.showDegree();
	}}