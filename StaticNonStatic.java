//Static - non static Concepts


//Can not call non static with out instance because this is instance-specific data.

//We Can call Static method inside the non static.
//
//We  can call a non-static method from a static method but need an instance of the class to call that non-static method.

//static methods cannot be overridden.
//subclass declares a static method with the same signature as a static method in its superclass, it's not considered as overriding but rather a method hiding.
public class StaticNonStatic{
    public static void main(String[] args) {
        System.out.println("main method");
        TeamMembers obj = new TeamMembers();
        // obj.employeeId();
        // obj.anualHolidaysCount();
        TeamMembers.giftAmount();
        Employee.giftAmount();
        // TeamMembers.employeeRole();
    }
}

class Employee{
    String teamName = "ManageEngine";
    Employee()
    {

    }
    void anualHolidaysCount()
    {
        System.out.println("anualHolidaysCount ---->");
    }

    static void giftAmount()
    {
        System.out.println("giftAmount ---->");
    }
}

class TeamMembers extends Employee{
    String teamName = "SCP";
    TeamMembers()
    {
        // this.anualHolidaysCount();
        System.out.println("This is TeamMembers constructor ---->");
    }

    @Override
    void anualHolidaysCount()
    {
        System.out.println("TeamMembers anualHolidaysCount ---->");
    }

    static void giftAmount()
    {
        System.out.println("TeamMembers giftAmount ---->");
    }
    void employeeId()
    {
        Employee.giftAmount();
        System.out.println("employeeId ---->");
    }

    static void employeeRole()
    {
        Employee e = new Employee();
        e.anualHolidaysCount();

        //       new TeamMembers().employeeId();
        System.out.println("employeeRole ---->");
    }
}
