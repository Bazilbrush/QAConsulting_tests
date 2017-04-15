package qa_calculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class time {

	int discount;
 	int dayOfWeek;
 	
 	public time (int a, int b){
 		discount= a;
 		dayOfWeek=b;
 	}
 	
 	public void calc_discount(){
 		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e");
 		LocalDate localDate = LocalDate.now();
 		//System.out.println(dtf.format(localDate)); //2016/11/16
 	
 		dayOfWeek = Integer.valueOf(dtf.format(localDate)); //format date as integer
 	
 		if(dayOfWeek == 3){    //day 3 is Wednesday
 			//
 			discount = 2; //STATIC DISCOUNT OF 2 QUID
 		}else {
 			discount = 0;
 		}
 	}
 	
 	public void discounts_brah(){
 		if (discount == 2){
 			System.out.println("It's Wednesday brah! Sick discounts for everyone!");
 		}else {
 			System.out.println("Sorry bro, pay full price today.");
 		}
 	}
}
