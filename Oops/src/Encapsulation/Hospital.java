package Encapsulation;

public class Hospital {

	public static void main(String[] args) {
		Info i1=new Info();
		i1.setName("Tisai");
		i1.setAddress("Kalyan");
		i1.setContact(765432189);
		i1.setEmail("Tisai@gmail.com");
		System.out.println("Hospital Name: "+i1.getName()+"\nHospital Address: "+i1.getAddress()
        +"\nHospital contact: "+i1.getContact()+"\nHospital Email: "+i1.getEmail());
	}

}
