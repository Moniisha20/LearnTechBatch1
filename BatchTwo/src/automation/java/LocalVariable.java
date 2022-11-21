package automation.java;

public class LocalVariable {
//Local variable at method level
	private void methodLevel(int empId)
	{
		System.out.println("Your EmpID is :" + empId);
	}
	
//Local variable at constructor level
	public LocalVariable(String cname)
	{
		System.out.println("Your Company name is :" + cname);
	}
	
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable("moni");
		lv.methodLevel(23456);
	}
}
