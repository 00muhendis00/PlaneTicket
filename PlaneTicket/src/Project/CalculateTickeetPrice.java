package Project;
import java.util.Scanner;
public class CalculateTickeetPrice {
	public static void main(String[] args) {
		double distance,pay,ageSaleRate,ageSale,saleTotal,saleTravel;
		int age,travelType;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a distance(km)  = ");
		distance = input.nextDouble();
		
		System.out.print("Enter your age = ");
		age = input.nextInt();
		
		System.out.print("1-> one way\n2-> round-trip");
		System.out.print("Enter a travel type = ");
		travelType = input.nextInt();
		
		pay = distance * 0.10;
		
		if(age<12) {
			ageSaleRate = 0.5;
			ageSale = pay * ageSaleRate;
			saleTotal = pay - ageSale;
			if(travelType == 2) {
				saleTravel = saleTotal*0.20;
				saleTotal -=saleTravel;
				System.out.print("Total = " + saleTotal);
			}
			else if(travelType == 1) {
				System.out.print("Total = " + saleTotal);
			}
			else {
				System.out.print("Incorrect entry");
			}	
		}
		else if((age>12) && (age<24)) {
			ageSaleRate = 0.1;
			ageSale = pay * ageSaleRate;
			saleTotal = pay - ageSale;
			if(travelType == 2) {
				saleTravel = saleTotal*0.20;
				saleTotal -=saleTravel;
				System.out.print("Total = " + saleTotal);
			}
			else if(travelType == 1) {
				System.out.print("Total = " + saleTotal);
			}
			else {
				System.out.print("Incorrect entry");
			}	
		}
		else if((age>65)) {
			ageSaleRate = 0.3;
			ageSale = pay * ageSaleRate;
			saleTotal = pay - ageSale;
			if(travelType == 2) {
				saleTravel = saleTotal*0.20;
				saleTotal -=saleTravel;
				System.out.print("Total = " + saleTotal);
			}
			else if(travelType == 1) {
				System.out.print("Total = " + saleTotal);
			}
			else {
				System.out.print("Incorrect entry");
			}	
	     }
	
	}
}
