package com.company.Task4;


public class Worker {
    void does(){
        System.out.println("Employee");
    }

    public static void main(String args[]) {
        Programmer programmer = new Programmer();
        programmer.does();

    }
}

class Clerk extends Worker{
    void does(){
        System.out.println("clerk");
    }
}

class Recruiter extends Clerk{
    void does(){
        System.out.println("Recruiting");
    }
}

class Cleaner extends Clerk{
    void does(){
        System.out.println("Cleaning");
    }
}

class OfficeManager extends Clerk{
    void does(){
        System.out.println("Office Management");
    }
}

class ItSpecialist extends Worker{
    void does(){
        System.out.println("It Specialist");
    }
}

class Programmer extends ItSpecialist{
    void does(){
        System.out.println("Programming");
    }
}

class TechnicalDirector extends ItSpecialist{
    void does(){
        System.out.println("Techincal Management");
    }
}

class ProjectManager extends ItSpecialist{
    void does(){
        System.out.println("Project Management");
    }
}






