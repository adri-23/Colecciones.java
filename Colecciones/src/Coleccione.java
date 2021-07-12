import java.util.LinkedList;
import java.util.List;

public class Coleccione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedList
		List<String> animales = new LinkedList<String>();
		animales.add("perro");
		animales.add("gato");
		animales.add("conejo");
		animales.add("oso");
		animales.add("pato");
		
		for(String an: animales) {
			System.out.println(an);
		}
		
	}

}
