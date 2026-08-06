public class Home_work11 {
    public static void main(String[] args) {
    Person firstPerson = new Person("John", 30, "Engineer");
    firstPerson.printInfo("1. "); // wyprowadzenie metodu
    Person secondPerson = new Person("Mary", 25, "Teacher");
    secondPerson.printInfo("   ");
    Person thirdPerson = new Person("Bob", 35, "Doctor");
    thirdPerson.printInfo("   ");
        System.out.println();
    Person forthPerson = new Person("Alice", 28, "Architect");
    forthPerson.printInfo("2. ");
        System.out.println("    (После обновления профессии)");
        forthPerson.newProfession("Designer");
        forthPerson.printInfo("   ");
    }
}
    class Person {
    /* nie pisać w środku clasu main
    oraz nie może byc public bo juz jest public main i tylko on może być
     */
        String name;
        int age;
        String profession;

        // Konstruktor
        public Person (String name, int age, String profession) {
            this.name = name; // this tak jakby oznacza "ten konkretny", pisząc to java tak jakby tworzy odrębne pole do tego
            this.age = age;
            this.profession = profession;
        }
        public void printInfo(String prefix){ // dzięki temu możemy później w nawias dodać " " itd
            /* static nie może byc bo static cos uniwersalne takie jak jakieś fromuły,
            który mogą uzywać każdy.
            (jak widzimy static to to dla całego klasu a nie dla każdego obiektu, jak nie ma to konkretnego trzeba stworzyć "new")
             nie potrzebuje danych w nawiasach ponieważ on odnosi się do konkretnego obiektu i sam wie jego wnętrzene pola name itd.
             */
            System.out.println(prefix + " Имя: " + name + ", Возраст: " + age + ", Профессия: " + profession);
        }
        public void newProfession(String newProfession){ // musimy wprowadzić nową zmienną na bank bo inaczej nie uda się
            this.profession = newProfession;
        }
    }
