package Companie;

public class Test {
    public static void main(String args[]){
        Companie companie = new Companie("Companie Samsung SRL");
        Manager manager1 = new Manager("Taian Victor",10500, 4);
        Manager manager2 = new Manager("Taian Aurelia",9700, 2);
        Manager manager3 = new Manager("Taian Aurelia",9700, 2);
        Manager manager4 = new Manager("Taian Aurelia",9700, 2);
        Developer developer1 = new Developer("Flavius Gabriel", 6700, 2, "Front-end");
        HR humanr1 = new HR("Delia Smarandescu", 7500, 4);
        Developer developer2 = new Developer("Todorov Gabriel", 6700, 2, "Front-end");
        Developer developer3 = new Developer("Alina Gregu", 6300, 1, "Back-end");
        HR humanr2 = new HR("Delia Ditu", 8300, 7);
        HR humanr3 = new HR("Radu Smarandescu", 7500, 4);
        Developer developer4 = new Developer("Turu Klara", 6700, 2, "Full-stack");

        companie.add(manager1);
        companie.add(manager2);
        companie.add(manager3);
        companie.add(manager4);


        manager1.add(manager2);
        manager1.add(developer1);
        manager1.add(developer3);
        manager1.add(humanr1);

        manager2.add(developer2);
        manager2.add(developer4);
        manager2.add(humanr2);
        manager2.add(humanr3);

        Visitor printVisitor = new RenderContentVisitor();
        companie.accept(printVisitor);
    }
}
