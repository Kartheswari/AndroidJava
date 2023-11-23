// Overriding & Overloading Concepts


public class OverridingOverloading
{
    public static void main(String[] args) 
    {
        System.out.println("main method");
        
        TeamMembers obj = new TeamMembers();
        obj.skills("java","kotlin");
        
        obj.skills("java","kotlin","xml");
    }
}

class Employee 
{
    Employee()
    {
        // System.out.println("This is Employee constructor");
    }
    
    void team()
    {
        System.out.println("ManageEngine");
    }

}

class TeamMembers extends Employee
{
    TeamMembers()
    {
        //  System.out.println("This is TeamMembers constructor");
    }
    
    @Override
    void team() //Overriding
    {
        System.out.println("scp");
    }
   
    void skills(String a, String b) 
    {
        System.out.println("TeamMembers skills -->"+a+"----"+b);
    }

    //Overloading
    void skills(String a, String b,String c) 
    { 
        System.out.println("TeamMembers skills -->"+a+"----"+b+"---"+c);
    }


}
