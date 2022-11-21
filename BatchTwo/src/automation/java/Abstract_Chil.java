package automation.java;

public class Abstract_Chil extends Abstract_Class {

	@Override
	public void joinAcc() {
System.out.println("2.75%");		
	}

	@Override
	public void FD() {
		System.out.println("5%");		
		
	}

	@Override
	public void RD() {
		System.out.println("6%");		
		
	}
	public static void main(String[] args) {
		Abstract_Chil ac = new Abstract_Chil();
		ac.joinAcc();
		ac.FD();
		ac.RD();
		ac.savAcc();
	}



}
