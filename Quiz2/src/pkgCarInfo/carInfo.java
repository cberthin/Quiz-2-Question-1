package pkgCarInfo;
import java.util.Scanner;
import java.lang.Math;

public class carInfo {
	private double totalPrice;
	private double downPayment;
	private double loanTime;
	private double interestRate;
	private double principal;
	
	private double monthlyPayment;
	private double totalInterest;
	
	private Scanner stdin=new Scanner(System.in);
	
	public carInfo() {
		System.out.println("What is the price of the car/amount of loan?");
			this.totalPrice=stdin.nextDouble();
	
		System.out.println("What is the down payment?");
			this.downPayment=stdin.nextDouble();
	
		System.out.println("What is the length of the loan in months?");
			this.loanTime=stdin.nextDouble();
			
		System.out.println("What is the loan interest rate?");
			this.interestRate=stdin.nextDouble()/100;
		
		this.principal=this.totalPrice-this.downPayment;
		
	stdin.close();
	
	this.monthlyPayment();
	this.totalInterest();
	 
	}
	
	public void monthlyPayment() {
		this.monthlyPayment=((this.interestRate/12)*this.principal)/
				(1-(Math.pow(1+(this.interestRate/12), -1*this.loanTime)));
	}
	
	public void totalInterest() {
		this.totalInterest=((this.monthlyPayment)-(this.totalPrice/this.loanTime))*this.loanTime;
	}
	
	public double getMonthlyPayment() {
		return this.monthlyPayment;
	}
	
	public double getTotalInterest() {
		return this.totalInterest;
	}
	
	
}
