package roommate.dao;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import roommate.bean.Imurointi;
import roommate.bean.Paperit;

public class KayttajaDAOSpringJdbcImpl implements KayttajaDAO {
	@Inject
	public DataSource dataSource;
	public JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	 public JdbcTemplate getJdbctemplate() {
		return jdbcTemplate;
	}

	public List<Imurointi> haeKaikkiImuroinnit() {
		String sql = "SELECT * FROM IMUROINTI";
		RowMapper<Imurointi> mapper = new ImurointiRowMapper();
		List<Imurointi> imurointi = jdbcTemplate.query(sql, mapper);
		return imurointi;
	}

	public List<Paperit> haeKaikkiPaperit() {
		String sql = "SELECT * FROM PAPERIT";
		RowMapper<Paperit> mapper = new PaperitRowMapper();
		List<Paperit> paperit = jdbcTemplate.query(sql, mapper);
		return paperit;
	} 
	 
	 
}
