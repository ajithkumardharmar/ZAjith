package Com.ZAjith;

import java.util.Arrays;
import java.util.List;

public class StringContainsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> csIconList = Arrays.asList("icon-cs-bars", "icon-cs-wizard-action","icon-cs-more-actions","icon-cs-action-only","icon-cs-duplicate"
//				,"icon-cs-er-diagram");
		String csIconList = " scds-icon-cs-make-as-header ";
		if(csIconList.contains("icon-cs-")) {
			System.out.println("cs icon contains");
		}else {
			System.out.println("None");
		}
	}

}
