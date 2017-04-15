package qa_calculator;

public class runtime{
	
		
		 static ticket_prices tickets = new ticket_prices(0, 0, 0, 0); //initialise the tickets object
		
		 static user_input user = new user_input(0,0,0,0);//initialise user input
		 static do_math math = new do_math(0,0,0,0,0); //init math operations
		 
		 static time discount_time = new time(0, 0); //initialise discount

	public static void main(String args[]) {
		tickets.set_prices(8,6,6,4); //Set prices
		discount_time.calc_discount(); //calculate discounts
		
		System.out.println("Programme Start!");
		
		discount_time.discounts_brah();
		
		user.input_Data_Standard(); //Call up user input methods
		System.out.println("You have selected "+user.n+" Standard tickets @ £"+(tickets.Standard-discount_time.discount)+" each.");
		
		user.input_Data_Pensioner();
		System.out.println("You have selected "+user.x+" Pensioner tickets @ £"+(tickets.Pensioner-discount_time.discount)+" each.");
		
		user.input_Data_Student();
		System.out.println("You have selected "+user.y+" Student tickets @ £"+(tickets.Student-discount_time.discount)+" each.");
		
		user.input_Data_Child();
		System.out.println("You have selected "+user.z+" Child tickets @ £"+(tickets.Child-discount_time.discount)+" each.");
		
		//call math methods to calculate totals
		math.math_std(tickets.Standard, user.n, discount_time.discount);
		math.math_oap(tickets.Pensioner, user.x, discount_time.discount);
		math.math_stu(tickets.Student, user.y, discount_time.discount);
		math.math_cld(tickets.Child, user.z, discount_time.discount);
		math.math_total();
		
		System.out.println(discount_time.discount); //test
		System.out.println("Your total is: £"+math.total);
	}
	
}
