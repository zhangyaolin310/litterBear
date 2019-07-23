package com.zhang.mgc.model;

public class ShowPlan {
   
    private Long showPlanId;	// 演示产品ID
    
    private Long custId;	// 客户ID
    
    private String showPlanName; 	//演示产品名称
    
    private String showPlanStartTime;	//演示产品开始时间
    
    private String showPlanEndTime;	//演示产品结束时间
    
    private String custNameAndShenfen;	//客户参与人员及身份
    
    private String objectionReply;	//演示过程异议及应对
    
    private String functionMatching;	//功能匹配度
    
    private String seafileDirectorie;	//需求匹配表的seafile目录
    
    private String businessIntention;	//是否达成商务意向
    
    private String intentionalServices;	//意向服务方式
    
    private String intentionalDeliveryTime;	//意向交付日期
    
    private String intentionTradingPrice;	//意向交易价格
    
    private String otherRequirement;	//其他要求条件
    
    public ShowPlan() {
        
    }

	public Long getShowPlanId() {
		return showPlanId;
	}

	public void setShowPlanId(Long showPlanId) {
		this.showPlanId = showPlanId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getShowPlanName() {
		return showPlanName;
	}

	public void setShowPlanName(String showPlanName) {
		this.showPlanName = showPlanName;
	}

	public String getShowPlanStartTime() {
		return showPlanStartTime;
	}

	public void setShowPlanStartTime(String showPlanStartTime) {
		this.showPlanStartTime = showPlanStartTime;
	}

	public String getShowPlanEndTime() {
		return showPlanEndTime;
	}

	public void setShowPlanEndTime(String showPlanEndTime) {
		this.showPlanEndTime = showPlanEndTime;
	}

	public String getCustNameAndShenfen() {
		return custNameAndShenfen;
	}

	public void setCustNameAndShenfen(String custNameAndShenfen) {
		this.custNameAndShenfen = custNameAndShenfen;
	}

	public String getObjectionReply() {
		return objectionReply;
	}

	public void setObjectionReply(String objectionReply) {
		this.objectionReply = objectionReply;
	}

	public String getFunctionMatching() {
		return functionMatching;
	}

	public void setFunctionMatching(String functionMatching) {
		this.functionMatching = functionMatching;
	}

	public String getSeafileDirectorie() {
		return seafileDirectorie;
	}

	public void setSeafileDirectorie(String seafileDirectorie) {
		this.seafileDirectorie = seafileDirectorie;
	}

	public String getBusinessIntention() {
		return businessIntention;
	}

	public void setBusinessIntention(String businessIntention) {
		this.businessIntention = businessIntention;
	}

	public String getIntentionalServices() {
		return intentionalServices;
	}

	public void setIntentionalServices(String intentionalServices) {
		this.intentionalServices = intentionalServices;
	}

	public String getIntentionalDeliveryTime() {
		return intentionalDeliveryTime;
	}

	public void setIntentionalDeliveryTime(String intentionalDeliveryTime) {
		this.intentionalDeliveryTime = intentionalDeliveryTime;
	}

	public String getIntentionTradingPrice() {
		return intentionTradingPrice;
	}

	public void setIntentionTradingPrice(String intentionTradingPrice) {
		this.intentionTradingPrice = intentionTradingPrice;
	}

	public String getOtherRequirement() {
		return otherRequirement;
	}

	public void setOtherRequirement(String otherRequirement) {
		this.otherRequirement = otherRequirement;
	}

	@Override
	public String toString() {
		return "ShowPlan [showPlanId=" + showPlanId + ", custId=" + custId + ", showPlanName=" + showPlanName
				+ ", showPlanStartTime=" + showPlanStartTime + ", showPlanEndTime=" + showPlanEndTime
				+ ", custNameAndShenfen=" + custNameAndShenfen + ", objectionReply=" + objectionReply
				+ ", functionMatching=" + functionMatching + ", seafileDirectorie=" + seafileDirectorie
				+ ", businessIntention=" + businessIntention + ", intentionalServices=" + intentionalServices
				+ ", intentionalDeliveryTime=" + intentionalDeliveryTime + ", intentionTradingPrice="
				+ intentionTradingPrice + ", otherRequirement=" + otherRequirement + "]";
	}


}