package it.betacom.openshift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.betacom.openshift.model.Contatto;

@Repository("contattiRepository")
public interface ContattoRepository extends JpaRepository<Contatto, Long> {

}
