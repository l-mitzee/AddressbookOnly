package com.Book;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System");
        AddContact addressBook = new AddContact();
        addressBook.addNewContact();
        System.out.println(addressBook.list);
    }
}