package Inheritance;

class Doctor {
    int doctorId;
    String name;
    String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public void showConsultationFee() {
        double fee = 0;
        switch (specialization.toLowerCase()) {
            case "cardiologist": fee = 1000; break;
            case "dentist": fee = 500; break;
            case "general": fee = 300; break;
            default: fee = 400;
        }
        System.out.println(name + "'s consultation fee: " + fee);
    }
}

class DoctorTest {
    public static void main(String[] args) {
        Doctor doc = new Doctor(1, "Dr. Mehta", "Dentist");
        doc.showConsultationFee();
    }
}
