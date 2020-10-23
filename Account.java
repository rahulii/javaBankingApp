package bankingApplication;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime; // import the LocalDateTime class


public class Account {
	public int balance;     
	public int accountNo;   
	
	public Account(int balance,int accountNo) {
		this.balance = balance;
		this.accountNo = accountNo;
	}
	
	void displayBalance() {        
		System.out.println("Account NO :" + this.accountNo+" Balance: "+ this.balance);     
	}     
	
	 void deposit(int amount) {         
		balance = balance + amount;        
		System.out.println(amount + " is deposited");         
		displayBalance();
		try {
			FileOutputStream fos = new FileOutputStream(""
					+ "/home/rahul/Desktop/accountStatment.txt",true);
		    LocalDateTime myObj = LocalDateTime.now();

			String newEntry =  " deposit " + amount + " "+ balance + " "+ myObj + "\n";
			byte b[] = newEntry.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
     void withdraw(int amount) {       
    	balance = balance - amount;         
    	System.out.println(amount + " is withdrawn");         
    	displayBalance();
    	try {
			FileOutputStream fos = new FileOutputStream(""
					+ "/home/rahul/Desktop/accountStatment.txt",true);
			LocalDateTime myObj = LocalDateTime.now();

			String newEntry =  " withdraw " + amount + " "+ balance +" " + myObj+ "\n";
			byte b[] = newEntry.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}  

}
