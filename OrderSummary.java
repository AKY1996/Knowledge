package com.ecomz.orders.model;

import java.util.Scanner;

public class OrderSummary {
	String productId;
	String productName;
	float price;
	int quantity;
	int discountPercent;
	float discountAmount;
	float cartSubTotal;

	public void getDetails(){
		productId="5892AZV";
		productName="BoseSpeakers";
		price=25245.5f;
		discountPercent=20;				
	}
	public void displayDetails(){
		System.out.println(" Product Id: " + productId);
		System.out.println("Product Name: " + productId);
		System.out.println("Price: " + price);
	}
	public void acceptQuantity(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter quantity");
		quantity=scanner.nextInt();
	}
	public void calculateCartTotal(){
		discountAmount=(discountPercent/100)*price;
		System.out.println("Discount Amount: " + discountAmount);
		cartSubTotal=price-(discountAmount)*quantity;
		System.out.println("Cart Total: " + cartSubTotal);
	}
}
		
	
	



