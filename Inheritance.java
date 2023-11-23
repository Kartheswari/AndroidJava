// Inheritance Concept

// Parent-child relationship.

// Code Reusability

// Method Overriding

// Avoid duplicating the same code in multiple places.

// We can inherit the parent class method and use it inside the child class

// Example -> Object class

public class Inheritance
{
    public static void main(String[] args) {
        System.out.println("main method");
//      Designer  obj = new Designer();
        
        Developer  obj = new Developer();
        obj.salary();
    }
}

class Employee
{
    private String department;

    public Employee() {
    }
    
    String department() 
    {
        System.out.println("department:::: ManageEngine");
        return "ManageEngine";
    }
}

class Developer extends Employee
{
    public Developer() 
    {
    }
    
    void salary()
    {
        System.out.println("Developer salary----->30k"+"----department---->"+super.department());
    }
}

class Designer extends Employee
{
    public Designer() 
    {
    }
    
    void salary()
    {
        System.out.println("Developer salary----->50k"+"----department---->"+super.department());
    }
}
