package com.zhang.mgc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Defend {

    private Long defendId;// ID自增长主键
    
    private Long custId;// 客户号
    
    private String custName;// 客户名称

    private String userName;// 用户名,不为空
    
    private String defendTime;// 维护时间
    
    private String remarksDefend;// 维护内容
    
    public Defend() {
        
    }
    
    public Defend(String custId, String custName, String userName,String defendTime,String remarksDefend) {
        this.userName = custId;
        this.userName = custName;
        this.userName = userName;
        this.defendTime = defendTime;
        this.remarksDefend= remarksDefend;
    }

	public Long getDefendId() {
		return defendId;
	}

	public void setDefendId(Long defendId) {
		this.defendId = defendId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDefendTime() {
		return defendTime;
	}

	public void setDefendTime(String defendTime) {
		this.defendTime = defendTime;
	}

	public String getRemarksDefend() {
		return remarksDefend;
	}

	public void setRemarksDefend(String remarksDefend) {
		this.remarksDefend = remarksDefend;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Defend [defendId=" + defendId + ", custId=" + custId + ", custName=" + custName + ", userName="
				+ userName + ", defendTime=" + defendTime + ", remarksDefend=" + remarksDefend + "]";
	}

}