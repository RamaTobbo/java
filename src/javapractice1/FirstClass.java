/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapractice1;

/**
 *
 * @author 10User
 */
public class FirstClass {
    public static void main(String[]args){
      //  System.out.print("test1");
      int topScore=100;
      if(topScore==100){
          System.out.println("You have a top score excellent");
      }
      int secondTopScore=89;
      if(secondTopScore>=89 && topScore<100){
          System.out.println("very good job !");
      }
      int thirdTopScore=81;
      if(thirdTopScore==81 || thirdTopScore<81){
         System.out.println("great");
    }
   String isGreat= thirdTopScore==81?"true":"false";
   System.out.println(isGreat);
   double value1=20;
   double value2=80;
   double res=(value1 + value2)*100;
  double reminder= res%40;
   boolean isReminderEqual0= reminder==0?true:false;
   System.out.println(isReminderEqual0);
   if(!isReminderEqual0)
       System.out.print("got some remainder");
   
}
}