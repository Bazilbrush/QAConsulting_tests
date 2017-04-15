package qa_calculator;

public class do_math {
	int stdtotal;
	int oaptotal;
	int stutotal;
	int childtotal;
	int total;
	
	public do_math(int a,int b,int c,int d,int e){
		stdtotal = a;
		oaptotal = b;
		stutotal = c;
		childtotal = d;
		total = e;
		
	}
	
	public void math_std(int price, int number, int disc){
		stdtotal=(price-disc)*number;
	}
	public void math_oap(int price, int number, int disc){
		oaptotal=(price-disc)*number;
	}
	public void math_stu(int price, int number, int disc){
		stutotal=(price-disc)*number;
	}
	public void math_cld(int price, int number, int disc){
		childtotal=(price-disc)*number;
	}
	public void math_total(){
		total=stdtotal+oaptotal+stutotal+childtotal;
	}
	
}
