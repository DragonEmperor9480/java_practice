class Person
{
    String name;
    int age;
    Person(String name, int age)
    {
        name = this.name;
        age = this.age;
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);

    }
}

class Employee extends Person{
    String companyName;
    double salary;
    Employee(String companyName, double salary)
    {
        companyName = this.companyName;
        salary = this.salary;
        System.out.println();
    }
}

public class MultiLevel_Inheritance {
    
}
