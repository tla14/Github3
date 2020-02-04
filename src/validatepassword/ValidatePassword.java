/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepassword;

import java.util.Scanner;

/*
 *
 * @author ikoal
 */
public class ValidatePassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String aString;
     int stringLength;
     final int NUM = 2;
     int uppercase = 0;
     int lower = 0;
     int digit = 0;

     Scanner in = new Scanner(System.in);
     int numSpaces = 0;
     System.out.print("Enter a Password ");
     aString = in.nextLine();
     stringLength = aString.length();

     for(int i = 0; i < stringLength; i++)
     {
        char ch = aString.charAt(i);
        if(Character.isUpperCase(ch))
           uppercase++;
        else
           if(Character.isLowerCase(ch))
             lower++;
           else
              if(Character.isDigit(ch))
                 digit++;
     }
     if(uppercase >= NUM && lower >= NUM && digit >= NUM)
        System.out.println("Valid password");
     else
     {
        System.out.println("The password did not have enough of the following:");
        if(uppercase < NUM)
           System.out.println("uppercase letters");
        if(lower < NUM)
           System.out.println("lowercase letters");
        if(digit < NUM)
          System.out.println("digits");
     }
  }
}