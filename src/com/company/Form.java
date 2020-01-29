package com.company;

public class Form {

    private static Form form = new Form();
    public static Form getInstance(){
        return form;
    }
    private Form(){}
    private String fname;
    private String lname;
    private int age;

    public void creatform(){
        System.out.println("\n-- form is completed successfully and job is yours --");
    }
    /*public void showinfo(){
        Form.getInstance().getFname();
        Form.getInstance().getLname();
        form.getAge();
    }*/

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
