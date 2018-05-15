/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Vansh
 */


public class Bill {
private String customerName;
private int myQuantity;
private String bookTitle;
private String bookAuthor;
private String bookPrices;
private double totalPrice = 0.0;
private String bookISBN;
private ArrayList<Book> items;
    public Bill(String name){
        CustomerBuyBookPanel bill = new CustomerBuyBookPanel();
        items = bill.getCart();
        customerName = name;

        
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getAmountOfItems(){
        int amt = 0;
        for(Book b : items){
            amt++;
        }
        return amt;
    }
    public String getISBNs(){
        for(Book b: items)
            bookISBN = b.getIsbn() + "\n";
        return bookISBN;
    }
    public String getTitles(){
        for (Book b: items)
            bookTitle = b.getTitle() + "\n";
        return bookTitle;
    }
    public String getAuthors(){
        for (Book b : items)
            bookAuthor = b.getAuthor() + "\n";
        return bookAuthor;
    }
    public String getPricePerBook(){
        for (Book b : items)
            bookPrices = String.valueOf(b.getPrice()) + "\n";
        return bookPrices;
    }
    public double getTotal(){
        for (Book b : items){
            totalPrice += b.getPrice();
        }
        return totalPrice;
    }
}
