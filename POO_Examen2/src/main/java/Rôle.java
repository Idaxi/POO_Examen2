
public class R�le {
	
	String nomR�le;
	
	public R�le(String role) {
		nomR�le = role;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if(! (o instanceof R�le)) {
			return false;
		}
		
		R�le other = (R�le) o;
		return this.nomR�le != null ? this.nomR�le.equals(other.nomR�le) : this.nomR�le == other.nomR�le;
	}
	
	@Override
	public int hashCode() {
		return nomR�le == null? 0 : nomR�le.length();
	}

}
