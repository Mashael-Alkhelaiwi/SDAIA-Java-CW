package day2.session2;

import java.time.Year;

public class Employee
{
    String name;
    double salary;
    int hairYear;

    public Employee (String name, double salary, int hairYear)
    {
        this.name=name;
        this.salary=salary;
        this.hairYear=hairYear;
    }

    public double anualSalary()
    {
        return salary*12;
    }

    public int servicePeriod()
    {
        int curentYear= Year.now().getValue();
        return curentYear-hairYear;
    }

    public String toString()
    {
        return ("welcom "+name+" your anual salary is: "+anualSalary()+" and your service period is: "+servicePeriod());
    }
}
