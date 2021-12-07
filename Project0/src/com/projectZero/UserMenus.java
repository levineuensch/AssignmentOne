package com.projectZero;

import java.util.Scanner;

public class UserMenus {
    static Scanner sc = new Scanner(System.in);
    public static void StartMenu(){

        System.out.println("1) Login");
        System.out.println("2) Create a New Account");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter your login information");
                LoginMenu();
            case 2:
                System.out.println("Create your profile");
        }
    }

    public static void LoginMenu(){
        System.out.println("Username: ");
        String user = sc.nextLine();
        System.out.println("Password: ");
        String pass = sc.nextLine();
    }

    public static void createMenu(){
        System.out.println();
        
    }
}
