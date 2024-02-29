package Encapsulation;

public class Learner {

	public static void main(String[] args) {
		Info i1=new Info();
		i1.setName("Shruti");
		i1.setAddress("Thane");
		i1.setContact(765432189);
		i1.setEmail("s@gmail.com");
		System.out.println("Learner Name: "+i1.getName()+"\nLearner Address: "+i1.getAddress()
		                    +"\nLearner contact: "+i1.getContact()+"\nLearner Email: "+i1.getEmail());

	}

}
