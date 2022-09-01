package it.betacom.openshift.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.betacom.openshift.model.Contatto;
import it.betacom.openshift.repository.ContattoRepository;
import it.betacom.openshift.service.ContattoService;

@Service("contattoService")
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	private ContattoRepository cR;
	
	@Override
	public List<Contatto> getAll() {
		
		return cR.findAll();
	}

}
