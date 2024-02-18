public class Main {
    public static void main(String[] args){
        Doctor doctor = new Doctor("Jhon", "Surgeon");
        doctor.examinePatient();
        Walker walker = new Walker();
        System.out.print(walker.run());
        VetClinic vetClinic = new VetClinic();
        System.out.print(vetClinic.getAllFlyers());
    }
}
