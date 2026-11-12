
package workshop;

public class WorkShopRegistration {
    public void Register(String name, int Age) throws InvalidAgeException{
        if (Age < 18){
            throw new InvalidAgeException(name + " : Must be Least 18 Years Old ");
        }
        else {
            System.out.println("Registration Successful for : " + name);
        }
    }
}
