public class Main {
    static void main(String[] args) {
        // class Employee
        Employee employee = new Employee(
                "John Brown",
                "Developer",
                "johnbrown@hmail.com",
                "478 124 568",
                34);
        // getters use
        System.out.println("Full name: " + employee.getFullName()); // za pomoca getter pokazujemy wartości przypisane do dannej zmiennej
        System.out.println("Job title: " + employee.getJobTitle());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone number: " + employee.getPhoneNumber());
        System.out.println("Age: " + employee.getAge());

        //setters
        employee.setJobTitle("Engineer");
        System.out.println("New job title: " + employee.getJobTitle());

        System.out.println("______________________________");

        // class Car
        Car myCar = new Car();
        myCar.start(); // wyprowadzamy metod z klasu Car
    }
}
