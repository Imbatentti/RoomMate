package roommate.bean;

public class Imurointi {
	private String imurointi_id;
	private String alue;
	private String paivamaara;
	private String kayttajatunnus;

	public Imurointi(String imurointi_id, String alue, String paivamaara,
			String kayttajatunnus) {
		super();
		this.imurointi_id = imurointi_id;
		this.alue = alue;
		this.paivamaara = paivamaara;
		this.kayttajatunnus = kayttajatunnus;
	}

	public Imurointi() {
		imurointi_id = null;
		alue = null;
		paivamaara = null;
		kayttajatunnus = null;
	}

	public String getImurointi_id() {
		return imurointi_id;
	}

	public void setImurointi_id(String imurointi_id) {
		this.imurointi_id = imurointi_id;
	}

	public String getAlue() {
		return alue;
	}

	public void setAlue(String alue) {
		this.alue = alue;
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
