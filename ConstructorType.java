// Construtor Type Concepts

// No-arg constructor

// Parameterized constructor

public class ConstructorType
{
    public static void main(String[] args) {
    System.out.println("main method");
    // Employee obj = new Employee();
    Employee obj = new Employee(1666,"nila");
    obj.display();
    }
}

 class Employee 
 {
    int id;
    String name;
   
     //no-arg constructor
    Employee()
    {

    }

    //Parameterized constructor
    Employee(int empId, String empName)
    {
        id = empId;
        name = empName;
    }
     
    void display ()
    {
        System.out.println("This is default constructor-->"+id+"----"+name);
    }
}
