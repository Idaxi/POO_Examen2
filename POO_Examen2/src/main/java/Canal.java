import java.util.List;
import java.util.Map;

public abstract class Canal implements Comparable{
	Map<Rôle, List<Utilisateur>> mapping_role_utilisateurs;
	Integer ordre;
	List<Webhook> webhooks;
	String nom;
	Map<Rôle, List<Habilitation>> mapping_role_habilitations;
	List<Message> historiques;
	
	public void Canal(){
				
	}
	
	public void ecrireMessage(Utilisateur uti, Message ms) {
		
	}
	
	public int CompareTo(Canal o) {
		return Canal()-o.Canal(); //ou ecrireMessage(Utilisateur uti, Message ms)-o.ecrireMessage(Utilisateur uti, Message ms)
	}

	public Object getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}

	public Object getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}

	public List<Message> getHistoriques() {
		return historiques;
	}

}
