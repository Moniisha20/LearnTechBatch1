package automation.java;

public class Interface_child implements Interface1, Interface2{

	@Override
	public void clientName() {
System.out.println("Saudi Payment");		
	}

	@Override
	public void empID() {
System.out.println("3993");		
	}

	@Override
	public void empName() {
System.out.println("Monisha");		
	}

	@Override
	public void empLocation() {
System.out.println("Thiruvannamlai");		
	}
public static void main(String[] args) {
	Interface_child ic = new Interface_child();
	ic.clientName();
	ic.empID();
	ic.empName();
	
}
}
