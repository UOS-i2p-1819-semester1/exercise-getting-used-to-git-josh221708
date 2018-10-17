package uk.ac.uos.i2p.envelope;
import java.util.Scanner;

public class Envelope {

    public static void main(String [] args) {
          System.out.printf("Your name is; %s", getFullName());
    }
    
    public static String getFullName()
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Input Your First name: ");
      String forename = in.nextLine();
      System.out.print("Input your middle name: ");
      String middleName = in.nextLine();
      System.out.print("Input your surname: ");
      String surName = in.nextLine();

      return
                getFullName(forename, middleName, surName);

}
    public static String getFullName(String forename, String middleName, String surname) {
          return
                forename +" " + middleName +" " + surname;
    }
}
