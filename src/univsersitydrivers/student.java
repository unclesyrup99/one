/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univsersitydrivers;

/**
 *
 * @author Rahul Gawdi
 * @version 1.0 (i guess)
 * establishes fields
 * assign fields to value within constructor for parameters in udriver
 * create getters and setters
 * create seperate methods for balance to allow the transfer of money
 * 
 * 
 */
public class student {

  private String firstName;
private    String studentID;
    private char gender;
  private  int age;
   private boolean liveOnCampus;
   private double balance;

    /**
     *gets first name 
     * @return string firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gets balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *allows you to set firstName to something
     * @param fName
     */
    public void setFirstName(String fName) {
     firstName = fName;
    }

    /**
     *returns id
     * @return id #
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * allows you to change id #
     * @param ID
     */
    public void setStudentID(String ID) {
    studentID = ID;
    }

    /**
     * returns gender
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     *
     * @param studentGender
     */
    public void setGender(char studentGender) {
        gender = studentGender;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param studentAge
     */
    public void setAge(int studentAge) {
        age = studentAge;
    }

    /**
     *
     * @return
     */
    public boolean isLiveOnCampus() {
        return liveOnCampus;
    }

    /**
     *
     * @param isLiveOnCampus
     */
    public void setLiveOnCampus(boolean isLiveOnCampus) {
        liveOnCampus = isLiveOnCampus;
    }

    /**
     *allows you to add money to account
     * @param amount
     */
    public void transferToCard(double amount){
       if (amount > 0 ){
           balance = balance + amount;
           System.out.println("balance is " + balance);
           
       }
       else{
           System.out.print("error, amount must be greater than 0");
       }
    }

    /**
     *allows you to take off money from account
     * @param amount
     */
    public void payFromCard(double amount){
    if (amount <= balance){
        balance = balance -amount;
   System.out.println("balance is " + balance);
    }
    else{
        System.out.println("error, balance is too low");
    }
}

    /**
     *
     */
    public student() {
balance = 0;
    }
    
    /**
     *
     * @param fName
     * @param ID
     * @param studentGender
     * @param studentAge
     * @param isLiveOnCampus
     */
    public student(String fName, String ID, char studentGender, int studentAge, boolean isLiveOnCampus) {
        firstName = fName;
        studentID =ID;
       gender = studentGender ;
        age= studentAge;
       liveOnCampus= isLiveOnCampus ;
       balance = 0;
       
    }

    /**
     *
     */
    public static void main() {

    }

}
