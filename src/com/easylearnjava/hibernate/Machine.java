package com.easylearnjava.hibernate;

public class Machine {

	private int machineId;
	private String machineCode;
	private String machineName;

	public Machine() {

	}


	@Override
	public String toString() {
		return "Machine [machineId=" + machineId + ", machineCode="
				+ machineCode + ", machineName=" + machineName + "]";
	}


	public int getMachineId() {
		return machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	public String getMachineCode() {
		return machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

}
