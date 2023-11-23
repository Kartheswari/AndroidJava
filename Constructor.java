//Construtor Concepts

//Construtor -> first statement this() and super() calls

public class Constructor
{
    public static void main(String[] args) {
        System.out.println("main method");
        TeamMembers obj = new TeamMembers();

    }
}

class Employee 
{
    int id;
    String name;
    
    //no-arg constructor
    Employee()
    {
        System.out.println("This is Employee constructor");
    }
    
    //Parameterized constructor
    Employee(int empId, String empName)
    {
        id = empId;
        name = empName;
    }

    void display ()
    {
        System.out.println("This is display-->"+id+"----"+name);
    }


}

class TeamMembers extends Employee
{
    TeamMembers()
    {
        System.out.println("This is TeamMembers constructor");
    }
}
