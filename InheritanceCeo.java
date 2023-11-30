

// If we create an object for trainee class will any other constructor gets invoked?

// Is the no- arg constructor will get invoked while creating a object using argumented constructor?

// Can we call one constructor from another constructor?
public class InheritanceCeo{
    public static void main(String[] args) {
        System.out.println("main method");
        Trainee  obj = new Trainee();
    }
}

class CEO{
    CEO()
    {
        System.out.println("CEO");
    }

    CEO(String name)
    {
        this();
        System.out.println("CEO shiv");
    }
}

class Director extends CEO{
    Director() {
        super("shiv");
        System.out.println("Director");
    }
}


class Manager extends Director{
    Manager() {
        System.out.println("Manager");
    }
}

class Lead extends Manager{
    Lead() {
        System.out.println("Lead");
    }
}

class Developer extends Lead{
    Developer() {
        System.out.println("Developer");
    }
    Developer(String name)
    {
        System.out.println("Developer shiv");
    }
}

class Trainee extends Developer{
    Trainee() {
        super("shiv");
        System.out.println("Trainee");
    }
}