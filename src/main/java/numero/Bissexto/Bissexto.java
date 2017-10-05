package numero.Bissexto;

public class Bissexto {
	
	public boolean bissexto(int i) {
		boolean numero = false;
		if (i == 0) {
			numero = false;
		} else if (i % 400 == 0) {			
			numero = true;
		} else if ((i % 4 == 0) && (i % 100 !=0)) {
			numero = true;
		} else numero = false;
		return numero;

	}

}
