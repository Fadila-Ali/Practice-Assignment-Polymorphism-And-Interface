package com.fadila;

class AdultUser implements LibraryUser {
    @Override
    public void registerAccount(int age) {
        if (age >= 12) {
            System.out.println("You have successfully register under an adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
