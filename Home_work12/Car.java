public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Start Electricity");
    }

    private void startCommand() {
        System.out.println("Start Command");
    }
    private void startFuelSystem(){
        System.out.println("Start Fuel System");
    }
}
/*
w danym clasie tworząc jeden metod public a inni private możemy uniknąć błdów w przyszłości,
np. kolejność wykonywania działań
 */