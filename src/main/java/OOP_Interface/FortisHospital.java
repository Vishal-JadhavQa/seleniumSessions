package OOP_Interface;

public class FortisHospital implements USMedical, UKMedical, IndianMedical{
	
	//US
	@Override
	public void cardioServices() {
		System.out.println("Fortis Hospital -> cardioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("Fortis Hospital -> neuroServices");
	}

	@Override
	public void physioServices() {
		System.out.println("Fortis Hospital -> physioServices");
	}

	//UK
	@Override
	public void dentalServices() {
		System.out.println("Fortis Hospital -> dentalServices");
	}

	@Override
	public void entServices() {
		System.out.println("Fortis Hospital -> entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("Fortis Hospital -> pediaServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("Fortis Hospital -> oncologyServices");
	}

	//common
	@Override
	public void emergencyServices() {
		System.out.println("Fortis Hospital -> emergencyServices");
	}
	
	//individual
	public void medicalTraining() {
		System.out.println("Fortis Hospital -> medicalTraining");
	}
	
	public void medicalInsurance() {
		System.out.println("Fortis Hospital -> medicalInsurance");
	}

}
