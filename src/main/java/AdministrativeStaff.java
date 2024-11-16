public class AdministrativeStaff extends Person implements Staff, AdministrativeTasks{

    public AdministrativeStaff(int id, String name, int age, int contactNo){
        super(id,name,age,contactNo);
    }

    @Override
    public void performDuty(){
        System.out.println("Admin Staff performed the duty");
    }

    @Override
    public void checkIn(){
        System.out.println("Admin Staff checked in for duty");
    }

    @Override
    public void manageSchedule(){
        System.out.println("Managed Schedule");
    }

    @Override
    public void generateReport(){
        System.out.println("Generate report");
    }
}
