package automation.pom;

public class CGetterandSetter extends PFLocal{

public static void main(String[] args) {
	PFLocal pf = new PFLocal();
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
Base b = new Base();

b.fill(pf.getName(),"moniisha0220");
		//getLogin(),"moniisha0220");
b.fill(pf.getPassword(),"Iammoni@0220");
b.btnClick(pf.getLogin());
}	
}
