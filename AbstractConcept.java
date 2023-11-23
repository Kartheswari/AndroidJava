//Abstract class Concepts

//Abstract class can not instantiate, extended by its subclass

//Abstract class main method can declare

//Abstract class multiple constructor can use

//If a abstract class with out extends -> It implicitly inherits from the Object class.

//Static keyword can use inside the Abstract class

//Abstract class contains both the abstract and default methods

public class AbstractConcept
{
    public static void main(String[] args) {
        System.out.println("main method");
        TeamMembers obj = new TeamMembers();
        
        System.out.println("empId-->"+Employee.empId);
        //obj.mobileNumber();
        //obj.team();
        
        //String[] arguments = {"arg1", "arg2", "arg3"};
        //Employee.main(arguments);
    }
}

abstract class Employee 
{
    public static int empId = 1666;
    Employee()
    {
        System.out.println("This is Employee constructor");
    }
    
    Employee(String name)
    {
        String className = super.getClass().getName();
        System.out.println("This is Employee constructor with name--->"+className);
    }
    
    abstract void mobileNumber();
   
    void team()
    {
        System.out.println("ManageEngine");
    }
    
    public static void main(String[] args) {
        System.out.println(" abstract main method"+args);
    }
}

class TeamMembers extends Employee
{
    
    TeamMembers()
    {
        super("eswari");
        System.out.println("This is TeamMembers constructor---->");
    }

    void mobileNumber()
    {
        System.out.println("12345678");
    }
}
