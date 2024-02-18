public class Nurse {
    private final String name;
    private int experienceYears;

    public Nurse(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }
    public void assistPatient() {
        System.out.println("Nurse " + name + " is assisting the patient.");
    }

    // Метод для обработки медицинских процедур
    public void performMedicalProcedures(String procedure) {
        System.out.println("Nurse " + name + " is performing medical procedure: " + procedure);
    }
}
