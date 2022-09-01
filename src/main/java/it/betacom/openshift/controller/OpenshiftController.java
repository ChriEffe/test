package it.betacom.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.betacom.openshift.model.Contatto;
import it.betacom.openshift.service.ContattoService;

@Controller
public class OpenshiftController {
	
	@Autowired
	private ContattoService cS;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homepage() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		List<Contatto> listaContatti = cS.getAll();
		mv.addObject("listaContatti", listaContatti);
		
		return mv;
	}
}
