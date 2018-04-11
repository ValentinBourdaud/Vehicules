
public enum Type {
	VILLE(1, "ville"),
	VTT(2, "vtt"),
	ROUTE(3, "route"); 
	
	int code;
	String label;
	
	Type(int id, String type){
		code = id;
		label = type;
		}
	
	public String toString() {
		return code+"-"+label;
	}
}
