
package workshop;


public class WorkShop {

    
    public static void main(String[] args) {
        WorkShopRegistration workshop = new WorkShopRegistration();
        
        System.out.println("\n==== Registration Attempt 1 ====");
        try {
            workshop.Register("Ali", 14);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
        System.out.println("\n==== Registration Attempt 2 ====");
      try {
            workshop.Register("Khaled", 28);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
      System.out.println("\n==== Registration Attempt 3 ====");
      try {
            workshop.Register("Ahmed", 20);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
      System.out.println("\n==== Registration Attempt 4 ====");
      try {
            workshop.Register("Anon", 18);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
      System.out.println("\n==== Registration Attempt 5 ====");
      try {
            workshop.Register("Sara", 22);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
      System.out.println("\n==== Registration Attempt 6 ====");
      try {
            workshop.Register("Taha", 17);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
            
        }
    }
    
}
