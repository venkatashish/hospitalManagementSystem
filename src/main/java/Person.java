abstract class Person {
    protected int id;
    protected String name;
    protected int age;
    protected int contactNo;

    public Person(int id, String name, int age, int contactNo){
        this.id = id;
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getContactNo(){
        return contactNo;
    }
}
