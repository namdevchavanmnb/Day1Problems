package Com.BridgeLabz;

public class StringEqual {
	public static void  stringCheck(String S1,String S2) {
		if(S1.equals(S2)) {
			System.out.println("String are Equal ");
		}
		else {
			System.out.println("String are Not Equal");
		}
	}
	public static void main(String[] args) {
		stringCheck("Namdev", "Santhosh");

	}
}
