package bankingApplication;

import java.util.Scanner;
import java.io.*;
public class Bank {
	public int choice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Welcome to LTI Bank");
		System.out.println("Please Enter your Account number");
		int accountNo = sc.nextInt();
		Account acc = new Account(0,accountNo);
		do {
		System.out.println("Please enter your choice");
		System.out.println("1.Deposit\t2.Withdraw\t3.Account Statement\t 4.Balance");
		b.choice = sc.nextInt();
		switch(b.choice)
		{
		case 1:
			System.out.println("Please Enter the amount you want to deposit");
			int amount = sc.nextInt();
			acc.deposit(amount);
			break;
		case 2:
			System.out.println("Please Enter the amount you want to withdraw");
			amount = sc.nextInt();
			acc.withdraw(amount);
			break;
		case 3:
			try {
				FileInputStream fin = new FileInputStream("/home/rahul/Desktop/accountStatment.txt");
				try {
					int i=0;    
		            while((i=fin.read())!=-1){    
		             System.out.print((char)i);    
				}
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
	                

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 4:
			acc.displayBalance();
			break;
			
			
		
	}

}while(b.choice!=4);
}
}
