package roommate.bean;

public class Paperit {
	private String paperit_id;
	private String tyyppi;
	private String paivamaara;
	private String kayttajatunnus;
	
	public Paperit(String paperit_id, String tyyppi, String paivamaara, String kayttajatunnus) {
		super();
		this.paperit_id = paperit_id;
		this.tyyppi = tyyppi;
		this.paivamaara = paivamaara;
		this.kayttajatunnus=kayttajatunnus;
	}
	
	public Paperit(){
		paperit_id = null;
		tyyppi = null;
		paivamaara = null;
		kayttajatunnus= null;
	}

	public String getPaperit_id() {
		return paperit_id;
	}

	public void setPaperit_id(String paperit_id) {
		this.paperit_id = paperit_id;
	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public String getPaivamaara() {
		return paivamaara;
	}

	public void setPaivamaara(String paivamaara) {
		this.paivamaara = paivamaara;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}
	
	
}
