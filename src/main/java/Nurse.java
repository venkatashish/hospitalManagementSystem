public class Nurse extends Person implements Staff{

    public Nurse(int id, String name, int age, int contactNo){
        super(id,name,age,contactNo);
    }

    @Override
    public void performDuty(){
        System.out.println("Nurse performed the duty");
    }

    @Override
    public void checkIn(){
        System.out.println("Nurse has checked in for duty");
    }
}
