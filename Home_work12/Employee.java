public class Employee {
    // ten class jest jako taki szkielet dla main
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber; // nir int bo albo java nie będzie widziała 0 z przodu albo będzie zbyt długi
    private int age;

    public Employee (String fullName, String jobTitle, String email, String phoneNumber, int age){
        this.fullName = fullName; // tworzę imię dla osoby
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    //Musze stworzyć gettery i settery dla każdej zmiennej
    // Dla każdej również get i set ponieważ mamy inkapsulację(private);
    // get - "pokażać" znaczenie, pozwala na odczytanie wartoścli innym class
    // set - "zmienić", pozwala na bezpieczną zmianę znaczenia (w srodku możemy dodać if itd)
    public String getFullName(){ // pzrestrzegać się camelCase
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName; // tutaj musze napisać to ponownie w razie potrzeby zmiany
    }
    public String getJobTitle(){ // get + return
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){ // set + void !brz return!
        this.jobTitle = jobTitle;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
