package com.infotel.service;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Personne;

public class ServiceImpl implements Iservice {
	
	private Idao dao = new DaoImpl(); // permet de communiquer avec la couche dao
	
	@Override
	public String creerPersonne(Personne p) {
		// TODO Auto-generated method stub
		
		return dao.creerPersonne(p);
	}

	@Override
	public Personne modifier(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifier(p);
	}

	@Override
	public void supprimer(Personne p) {
		// TODO Auto-generated method stub
		dao.supprimer(p);
	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		return dao.lister();
	}

}
