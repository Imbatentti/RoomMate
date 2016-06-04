package roommate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import roommate.bean.Imurointi;

public class ImurointiRowMapper implements RowMapper<Imurointi> {
	public Imurointi mapRow(ResultSet rs, int rowNum) throws SQLException{
		Imurointi imurointi = new Imurointi();
		imurointi.setImurointi_id(rs.getString("imurointi_id"));
		imurointi.setAlue(rs.getString("alue"));
		imurointi.setKayttajatunnus(rs.getString("kayttajatunnus"));
		//timestamp into string
		java.sql.Timestamp timestampObject = rs.getTimestamp("paivamaara");
		if(timestampObject != null){
			String paivamaara = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(timestampObject);
			imurointi.setPaivamaara(paivamaara);
		}	
		return imurointi;
	}	
}
