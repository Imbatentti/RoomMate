package roommate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import roommate.bean.Paperit;

public class PaperitRowMapper implements RowMapper<Paperit> {
	public Paperit mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paperit paperit = new Paperit();
		paperit.setPaperit_id(rs.getString("paperit_id"));
		paperit.setTyyppi(rs.getString("tyyppi"));
		paperit.setKayttajatunnus(rs.getString("kayttajatunnus"));
		// timestamp into string
		java.sql.Timestamp timestampObject = rs.getTimestamp("paivamaara");
		if (timestampObject != null) {
			String paivamaara = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(timestampObject);
			paperit.setPaivamaara(paivamaara);
		}
		return paperit;
	}
}
