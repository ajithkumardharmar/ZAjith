package projectTestCode;

public class ContainsTest {
	
	public static void main(String[] args) {
		String x= "employeedepentendlkpak_DUMMY$$statelkpak2_cstate$$countrylkpak2_country";
		if(x.contains("statelkpak2_DUMMY$$countrylkpak2_country")) {
			System.out.println("Contains ");
		}else {
			System.out.println("Not Contains ");
		}
	}

}
