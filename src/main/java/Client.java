import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        ArrayList<Staff> staffList = new ArrayList<>();
        ArrayList<Doctor> doctorList = new ArrayList<>();
        ArrayList<Nurse> nurseList = new ArrayList<>();
        ArrayList<AdministrativeStaff> adminStaffList = new ArrayList<>();
        ArrayList<Patient> patientList = new ArrayList<>();

        char runLoop = 'Y';
        Scanner obj = new Scanner(System.in);

        while(runLoop == 'Y'){
            System.out.println("Enter doctor ID");
            int id = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter doctor name");
            String name = obj.nextLine();
            System.out.println("Enter doctor age");
            int age = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter doctor contact number");
            int contactno = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter doctor's specialization");
            String specialization = obj.nextLine();
            System.out.println("Enter doctor's lisence number");
            String licenseno = obj.nextLine();
            doctorList.add(new Doctor(id, name, age, contactno, specialization, licenseno));
            staffList.add(new Doctor(id, name, age, contactno, specialization, licenseno));
            System.out.println("Want to enter more doctors into the system");
            runLoop = obj.next().charAt(0);
            obj.nextLine();
        }
        runLoop = 'Y';
        while(runLoop == 'Y'){
            System.out.println("Enter nurse ID");
            int id = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter nurse name");
            String name = obj.nextLine();
            System.out.println("Enter nurse age");
            int age = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter nurse contact number");
            int contactno = obj.nextInt();
            obj.nextLine();
            nurseList.add(new Nurse(id,name,age,contactno));
            staffList.add(new Nurse(id, name, age, contactno));
            System.out.println("Want to enter more nurses into the system");
            runLoop = obj.next().charAt(0);
            obj.nextLine();
        }

        runLoop = 'Y';
        while(runLoop == 'Y'){
            System.out.println("Enter adminStaff ID");
            int id = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter adminStaff name");
            String name = obj.nextLine();
            System.out.println("Enter adminStaff age");
            int age = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter adminStaff contact number");
            int contactno = obj.nextInt();
            obj.nextLine();
            adminStaffList.add(new AdministrativeStaff(id,name,age,contactno));
            staffList.add(new AdministrativeStaff(id, name, age, contactno));
            System.out.println("Want to enter more adminStaff into the system");
            runLoop = obj.next().charAt(0);
            obj.nextLine();
        }

        runLoop = 'Y';
        while(runLoop == 'Y'){
            System.out.println("Enter patient ID");
            int id = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter patient name");
            String name = obj.nextLine();
            System.out.println("Enter patient age");
            int age = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter patient contact number");
            int contactno = obj.nextInt();
            obj.nextLine();
            System.out.println("Enter patient's ailment");
            String ailment = obj.nextLine();
            patientList.add(new Patient(id, name, age, contactno, ailment));
            System.out.println("Want to enter more patient into the system");
            runLoop = obj.next().charAt(0);
            obj.nextLine();
        }
        for(Patient element: patientList){
            element.assignDoctor(element,doctorList);
        }

        for(Patient element: patientList){
            element.showPatientDetails(element);
        }
        for(Staff element: staffList){
            element.performDuty();
        }
    }
}
