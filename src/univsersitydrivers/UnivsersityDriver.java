/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univsersitydrivers;

/**
 *
 * @author Rahul Gawdi
 */
public class UnivsersityDriver{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   // student bob = new student();
    //System.out.println(bob.firstName);
    //System.out.println(bob.studentID);
    //System.out.println(bob.gender);
    //System.out.println(bob.age);
    //System.out.println(bob.liveOnCampus);    
      //  System.out.println();
        //student john = new student("John", "800123456",'m',20,true);
         //System.out.println(john.firstName);
    //System.out.println(john.studentID);
    //System.out.println(john.gender);
    //System.out.println(john.age);
    //System.out.println(john.liveOnCampus);   
   student mary = new student("Joan", "800234567",'f',19,false);
    System.out.println("Object mary first name is " + mary.getFirstName());
    mary.setFirstName("Sue");
    System.out.println("Object mary first name is " + mary.getFirstName());
    mary.transferToCard(100);
    mary.payFromCard(50);
    mary.transferToCard(0);
    mary.payFromCard(150);
    
    }
    
}
