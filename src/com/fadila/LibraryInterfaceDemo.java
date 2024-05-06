package com.fadila;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser kidUser = new KidUser();
        kidUser.registerAccount(10);
        kidUser.requestBook("kids");

        kidUser.registerAccount(18);
        kidUser.requestBook("Fiction");

        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount(5);
        adultUser.requestBook("Kids");

        adultUser.registerAccount(23);
        adultUser.requestBook("Fiction");

    }
}
