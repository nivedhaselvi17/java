
import java.util.*;

class Employee {

    String ename, address, mailid;
    int eid;
    long mobile;
    double bp, da, hra, pf, sc, gs, ns;

    static Scanner s = new Scanner(System.in);

    void setInput() {

        System.out.print("Enter Name: ");
        ename = s.nextLine();

        System.out.print("Enter Address: ");
        address = s.nextLine();

        System.out.print("Enter Mail ID: ");
        mailid = s.nextLine();

        System.out.print("Enter Employee ID: ");
        eid = Integer.parseInt(s.nextLine());

        System.out.print("Enter Mobile Number: ");
        mobile = Long.parseLong(s.nextLine());
    }

    void cal(double daPer, double hraPer, double pfPer, double scPer) {

        da = bp * daPer / 100;
        hra = bp * hraPer / 100;
        pf = bp * pfPer / 100;
        sc = bp * scPer / 100;

        // Gross Salary
        gs = bp + da + hra;

        // Net Salary
        ns = gs - pf - sc;
    }

    void display() {

        System.out.println("\nEmployee Details");
        System.out.println("Name          : " + ename);
        System.out.println("Employee ID   : " + eid);
        System.out.println("Mail ID       : " + mailid);
        System.out.println("Address       : " + address);
        System.out.println("Mobile Number : " + mobile);
    }
}

class Programmer extends Employee {

    void setBasicPay() {
        System.out.print("Enter Basic Pay: ");
        bp = Double.parseDouble(s.nextLine());
    }

    void display() {
        super.display();
        System.out.println("Designation   : Programmer");
        System.out.println("Basic Pay     : " + bp);
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("SC            : " + sc);
        System.out.println("Gross Salary  : " + gs);
        System.out.println("Net Salary    : " + ns);
    }
}

class AssistantProfessor extends Employee {

    void setBasicPay() {
        System.out.print("Enter Basic Pay: ");
        bp = Double.parseDouble(s.nextLine());
    }

    void display() {
        super.display();
        System.out.println("Designation   : Assistant Professor");
        System.out.println("Basic Pay     : " + bp);
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("SC            : " + sc);
        System.out.println("Gross Salary  : " + gs);
        System.out.println("Net Salary    : " + ns);
    }
}

class AssociateProfessor extends Employee {

    void setBasicPay() {
        System.out.print("Enter Basic Pay: ");
        bp = Double.parseDouble(s.nextLine());
    }

    void display() {
        super.display();
        System.out.println("Designation   : Associate Professor");
        System.out.println("Basic Pay     : " + bp);
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("SC            : " + sc);
        System.out.println("Gross Salary  : " + gs);
        System.out.println("Net Salary    : " + ns);
    }
}

class Professor extends Employee {

    void setBasicPay() {
        System.out.print("Enter Basic Pay: ");
        bp = Double.parseDouble(s.nextLine());
    }

    void display() {
        super.display();
        System.out.println("Designation   : Professor");
        System.out.println("Basic Pay     : " + bp);
        System.out.println("DA            : " + da);
        System.out.println("HRA           : " + hra);
        System.out.println("PF            : " + pf);
        System.out.println("SC            : " + sc);
        System.out.println("Gross Salary  : " + gs);
        System.out.println("Net Salary    : " + ns);
    }
}

class Salary {

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println("\n---PROGRAMMER---");
        p.setInput();
        p.setBasicPay();
        p.cal(97, 10, 12, 1);
        p.display();

        AssistantProfessor ap = new AssistantProfessor();
        System.out.println("\n---ASSISTANT PROFESSOR---");
        ap.setInput();
        ap.setBasicPay();
        ap.cal(110, 20, 12, 5);
        ap.display();

        AssociateProfessor asp = new AssociateProfessor();
        System.out.println("\n---ASSOCIATE PROFESSOR---");
        asp.setInput();
        asp.setBasicPay();
        asp.cal(130, 30, 12, 10);
        asp.display();

        Professor pr = new Professor();
        System.out.println("\n---PROFESSOR---");
        pr.setInput();
        pr.setBasicPay();
        pr.cal(140, 40, 12, 15);
        pr.display();

        Employee.s.close();
    }
}