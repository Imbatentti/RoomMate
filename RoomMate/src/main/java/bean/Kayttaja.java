package bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Kayttaja {

	@NotNull
	@Size(max = 50)
	private String kayttajatunnus;
	private String salasana;

	public Kayttaja(String kayttajatunnus, String salasana) {
		super();
		this.kayttajatunnus = kayttajatunnus;
		this.salasana = salasana;
	}

	public Kayttaja() {
		kayttajatunnus = null;
		salasana = null;
	}

	public String getKayttajatunnus() {
		return kayttajatunnus;
	}

	public void setKayttajatunnus(String kayttajatunnus) {
		this.kayttajatunnus = kayttajatunnus;
	}

	public String getSalasana() {
		return salasana;
	}

	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}

}
