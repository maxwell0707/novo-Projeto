package inicial;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {

				
		List<String> list = new ArrayList();
		 list.add("max well pereira" );
		 list.add("joao batista");
		 list.add("joaquin");
		 
		for (String vect : list) {
			System.out.println(vect);
		}
		List<String > result = list.stream().filter(x-> x.charAt(0)=='m').collect(Collectors.toList());
		
		for(String v : result) {
			System.out.println("************************************");
			System.out.println(v);
		}
		
		
		
	}

}
