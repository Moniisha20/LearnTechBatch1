package automation.java;

public class Exception_Demo


{
	
	public static void main(String[] args) throws Exception  {
	
			System.out.println("start");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			Thread.sleep(3000);		

			try {
			System.out.println(10/2);
				try {
					String s=null;
					System.out.println(s.charAt(0));
				}
				catch(NullPointerException e){
					System.out.println("inner catch");
				}
				finally{
					System.out.println("inner finally");
				}
			}
			catch(ArithmeticException e) {
			System.out.println("dont/by zero");
			}
			finally{
			System.out.println("outer finaly");
			}
			System.out.println("4");
			System.out.println("5");
			System.out.println("end");
			}

	}
	

