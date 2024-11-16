import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Person{
    private String ailment;
    private int assignedDoctor;
    Scanner obj = new Scanner(System.in);

    public Patient(int id, String name, int age, int contactNo,String ailment){
        super(id,name,age,contactNo);
        this.ailment = ailment;
    }

    public void assignDoctor(Patient patient, ArrayList<Doctor> doctorList){
        System.out.println("Doctor details below, use this to assign them to the patients");
        for(Doctor element: doctorList){
            System.out.println("Doctor ID: -"+element.id+" Doctor's name: - "+element.name);
        }
        System.out.println("Enter the doctor id you want to assign to "+patient.name);
        this.assignedDoctor = obj.nextInt();
        obj.nextLine();
    }

    public void showPatientDetails(Patient patient){
        System.out.println("Patient Name: -"+patient.name+" || Patient ID:- "+patient.id+" || Patient Contact No. : -"+patient.contactNo+" || Patient age: - "+patient.age+" || Patient ailment: - "+patient.ailment+" || Assigned doctor: - "+patient.assignedDoctor);
    }
}
