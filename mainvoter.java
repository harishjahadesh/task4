package task4;

public class mainvoter {
	public static void main(String args[]) {
		try {
			voter voter1 = new voter(123,"max",20);
			System.out.println("voter1 created sucessfully");
			System.out.println("voterid :"+ voter1.getvoterid());
			System.out.println("name :"+ voter1.getname());
			System.out.println("age :"+ voter1.getage());
			voter voter2 = new voter(234,"sam",17);
			System.out.println("voter2 created sucessfully");
			System.out.println("voterid :"+ voter2.getvoterid());
			System.out.println("name :"+ voter2.getname());
			System.out.println("age :"+ voter2.getage());
		}catch (invaliageException e) {
			System.out.println("Erroe creating voter: "+e.getMessage());
		}
	}

}
