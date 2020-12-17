package pkmain.managers;

import javax.persistence.EntityManager;

public class MasterManager {
	
//	FIELDS
	private EntityManager em;

//	CONSTRUCTOR
	public MasterManager(EntityManager em) {
		this.em = em;
	}

//	GETTERS & SETTERS
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
