package projeto.enum0;

public enum whatsRIR {

	ARIN("Whats.arin.net"), 
	RIPE("Whats.ripe.net"), 
	APNIC("Whats.apnic.net"), 
	AFRINIC("Whats.afrinic.net"),
	LACNIC("Whats.lacnic.net"), 
	JPNIC("Whats.jpnic.net"), 
	KRNIC("Whats.krnic.net"), 
	CNNIC("Whats.cnnic.net"),
	UNKNOWN("");

	private String url;

	whatsRIR(String url) {
		this.url = url;
	}

	public String url() {
		return url;
	}
}
