
public class Rôle {
	
	String nomRôle;
	
	public Rôle(String role) {
		nomRôle = role;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if(! (o instanceof Rôle)) {
			return false;
		}
		
		Rôle other = (Rôle) o;
		return this.nomRôle != null ? this.nomRôle.equals(other.nomRôle) : this.nomRôle == other.nomRôle;
	}
	
	@Override
	public int hashCode() {
		return nomRôle == null? 0 : nomRôle.length();
	}

}
