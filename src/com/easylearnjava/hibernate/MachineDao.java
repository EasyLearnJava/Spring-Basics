package com.easylearnjava.hibernate;

public interface MachineDao {
	
	public void save(Machine mac);
	
	public Machine findByMachineCode(String code);
	
	public void update(Machine mac);
	
	public void delete(Machine mac);

}
