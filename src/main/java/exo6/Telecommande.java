package exo6;

public class Telecommande {

	private Bouton[] lesBoutons;

	public Telecommande() {
		this.lesBoutons = new Bouton[4];
		for (int i = 0; i < 4 ; i++)
			lesBoutons[i] = new Bouton();
	}

}
