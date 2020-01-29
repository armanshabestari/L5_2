package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choose;
        while (true) {
            System.out.println("\n\tJob Form");
            System.out.println("please enter your firstname");
            Form.getInstance().setFname(in.next());
            System.out.println("Please enter your lastname");
            Form.getInstance().setLname(in.next());
            System.out.println("And your age");
            Form.getInstance().setAge(in.nextInt());
            System.out.println("\tDo you ACCEPT?(y/n)");
            choose = in.next();
            if (choose.equals("y")){
                Form.getInstance().creatform();
               // Form.getInstance().showinfo();
                break;
            }
        }
    }
}
