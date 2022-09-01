package it.betacom.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.betacom.openshift.model.Contatto;
import it.betacom.openshift.service.ContattoService;

@RestController
@RequestMapping("/api")
public class ServiceRestController {
	
	@Autowired
	private ContattoService cS;
	
	@RequestMapping("/contatti")
	public List<Contatto> serviceTest() {

		return cS.getAll();
	}
}
