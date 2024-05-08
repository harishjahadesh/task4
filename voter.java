package task4;

public class voter {
	public int voterid;
	public String name;
	public int age;
	
	public voter(int voterid, String name, int age ) throws invaliageException{
		if (age<18) {
			throw new invaliageException ("Invalidvoterid ");
		}
		this.voterid = voterid;
		this.name = name;
		this.age = age;
	}
	public int getvoterid() {
		return(voterid);
	}
	public String getname() {
		return(name);
	}
	public int getage() {
		return(age);
	}
}
