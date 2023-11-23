// Object, super class, variable, Multiple public class Concepts

// More than one public class cannot be written in one Java file

// Multiple public classes in a single file would make it ambiguous

// If a class does not explicitly extend any other class, it implicitly inherits from the java.lang.Object

// Variable can not override. Overriding is only applicable to methods, not to variables.

// If the same instance variable declared in both parent and child class, instance variable is chosen from the reference type.

public class BasicConcepts 
{    
    public static void main(String[] args) {
        System.out.println("main method");
        TeamMembers obj = new TeamMembers();
        
        //  Employee obj = new TeamMembers();
        String teamName = obj.teamName;
        
        System.out.println("teamName--->"+teamName);
    }
}

/*
public class Employee{
    public static void main(String[] args) {
        System.out.println("main method");

    }
}*/

class Employee
{
    String teamName = "ManageEngine";
    Employee()
    {

    }
}

class TeamMembers extends Employee
{
    String teamName = "SCP";
    TeamMembers()
    {
        String superClassName = TeamMembers.class.getSuperclass().getName();
        System.out.println("This is TeamMembers constructor ---->"+superClassName);
    }
}
