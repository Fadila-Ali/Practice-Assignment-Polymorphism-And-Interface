package com.fadila;

class KidUser implements LibraryUser {
    @Override
    public void registerAccount(int age) {
        if (age <= 11) {
            System.out.println("You are successfully registered inder a kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType.equals("kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
