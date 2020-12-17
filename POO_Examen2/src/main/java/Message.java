
public class Message {
	Utilisateur auteur;
	Destinataire destinataire;
	String texte;
	
	public void setDestinaire(Canal c) {
		destinataire = c;
		
	}

	public void setTexte(String str) {
		texte = str;
		
	}

	public String getTexte() {
		return texte;
	}

}
