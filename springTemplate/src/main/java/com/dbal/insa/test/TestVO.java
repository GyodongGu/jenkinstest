package com.dbal.insa.test;

public class TestVO {
	private String cId;
	private String cName;
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "TestVO [cId=" + cId + ", cName=" + cName + "]";
	}
	
}
