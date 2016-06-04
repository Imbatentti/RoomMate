package roommate.dao;

import java.util.List;

import roommate.bean.Imurointi;
import roommate.bean.Paperit;

public interface KayttajaDAO {
	
	public abstract List<Imurointi> haeKaikkiImuroinnit();	
	public abstract List<Paperit> haeKaikkiPaperit();
}
