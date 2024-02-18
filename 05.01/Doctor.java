public class Doctor {
    private final String name;
    private final String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void examinePatient() {
        System.out.println("Doctor " + name + " is examining the patient.");
    }

    public void prescribeTreatment(String treatment) {
        System.out.println("Doctor " + name + " prescribes treatment: " + treatment);
    }
}
