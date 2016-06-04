package roommate.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import roommate.bean.Imurointi;
import roommate.dao.KayttajaDAO;


@Controller
@RequestMapping(value ="/")
public class TulostusController {
	
	@Inject
	private KayttajaDAO dao;
	
	public KayttajaDAO getDao(){
		return dao;
	}
	public void setDao(KayttajaDAO dao){
		this.dao = dao;
	}
	
	//Imurointien tulostus
	@RequestMapping(value="imurointi", method=RequestMethod.GET)
	public String getTulostus(Model model){
		List<Imurointi> imurointi = dao.haeKaikkiImuroinnit();
		model.addAttribute("imurointi", imurointi);
		
		return "/sisalto/imurointi";
		
	}
	
	

}
