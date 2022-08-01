package com.cwa.bank;

import java.util.Scanner;

public class Bank {
	private String aName;
	private int accNumber;
	private double accBalance;
	private String accType;
	public Bank createAccount(String aName, int accNumber, double accBalance, String type) {
		if(accBalance <1000) {
			System.out.println("You cannot create account");
			System.out.println("Enter more then 1000 balance");
			Scanner sc = new Scanner(System.in);
			accBalance = sc.nextDouble();
			sc.close();
		}
		this.aName = aName;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
		this.accType = type;
		
		return this;
	}
	public Bank() {
		
	}
	public Bank(String aName, int accNumber, double accBalance, String type) {
		super();
		this.aName = aName;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
		this.accType = type;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String type) {
		this.accType = type;
	}
	public void showDetails() {
		System.out.println("Holder Name "+this.aName);
		System.out.println("Account Number "+this.accNumber);
		System.out.println("Balance "+this.accBalance);
		System.out.println("Account Type "+this.accType);
	}
	
}
