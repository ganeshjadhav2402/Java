import java.util.*;


public class Strings {

  public static void main(String args[]) {

    String name1 = "Ganesh";

    String name2 = "Ganesh";

    if(name1.equals(name2)) {

      System.out.println("They are the same string");

    } else {

      System.out.println("They are different strings");

    }

    
    //DO NOT USE == to check for string equality

    //Gives correct answer here

    if(name1 == name2) {

      System.out.println("They are the same string");

    } else {

      System.out.println("They are different strings");

    }

    
    //Gives incorrect answer here

    if(new String("Ganesh") == new String("Ganesh")) {

      System.out.println("They are the same string");

    } else {

      System.out.println("They are different strings");

    }

  }

}
