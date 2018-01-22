package edu.cnm.bootcamp.ijprework;

public class HelloWorld {

  public static void main(String[] args) {
    String target = salutees(args);
    String message = salutation(target);
    salute(message);
    }

  private static String salutees(String[] args) {
    String result = "";
    for (int i = 0; i < args.length; i++) {
      result = result + args[i] + ", " ;
    }
    return result;
  }

  private static String salutation(String target) {
    return "Hello, " + (!target.isEmpty() ? target : "World");
  }

  private static void salute(String salutation) {
    System.out.println(salutation);
  }
}
