package com.easylearnjava.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MachineDaoImpl extends HibernateDaoSupport implements MachineDao{

	@Override
	public void save(Machine mac) {
		getHibernateTemplate().save(mac);		
	}

	@Override
	public Machine findByMachineCode(String code) {
		List lst = getHibernateTemplate().find("from Machine where machineCode=?", code);
		return (Machine)lst.get(0);
	}

	@Override
	public void update(Machine mac) {
		getHibernateTemplate().update(mac);
	}

	@Override
	public void delete(Machine mac) {
		getHibernateTemplate().delete(mac);
	}

}
