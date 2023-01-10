public class Contacts {

    private String name;
    private long phoneNumber;

    public String getName(){
        return this.name;
    }

    public long getPhone(){
        return this.phoneNumber;
    }

    public Contacts(String name, long phone){
        this.name = name;
        this.phoneNumber = phone;

    }

    public void setName(String name){
        this.name = name;
    }
//    ---------Max for phone number is 10 digits--------
    public void setPhoneNumber(long phone){
        this.phoneNumber = phone;
    }



}
