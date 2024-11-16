public class Doctor extends Person implements Staff{
    private String specialization;
    private String lisenceNumber;

    public Doctor(int id, String name, int age, int contactNo, String specialization, String lisenceNumber){
        super(id,name,age,contactNo);
        this.specialization = specialization;
        this.lisenceNumber = lisenceNumber;
    }

    @Override
    public void performDuty(){
        System.out.println("Doctor performed the duty");
    }

    @Override
    public void checkIn(){
        System.out.println("Doctor checked in for duty");
    }
}
