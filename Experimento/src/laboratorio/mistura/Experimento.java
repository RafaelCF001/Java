package laboratorio.mistura;
import java.util.ArrayList;

public class Experimento {
	private ArrayList<Mistura> misturas = new ArrayList<Mistura>();

	
	public void setMistura(Mistura m) {
		this.misturas.add(m);
	}

	public boolean registrarMistura(Mistura m) {
		setMistura(m);
		return this.misturas.contains(m);
	}
	public void exibirExperimento() {
		for(int i = 0 ; i < misturas.size(); i++ ) {
			System.out.println("Misturas: " + misturas.get(i));
		}
	}
}
