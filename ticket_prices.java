package qa_calculator;

public class ticket_prices {
	public int Standard;
	public int Pensioner;
	public int Student;
	public int Child;
	
	public ticket_prices(int t_Standard, int t_Pension, int t_Student, int t_Child){
		Standard = t_Standard;
		Pensioner = t_Pension;
		Student = t_Student;
		Child = t_Child;
		
	}
	
	public void set_prices(int a, int b, int c, int d){
		Standard = a;
		Pensioner = b; 
		Student = c;
		Child = d;
	}
}
