package com.zhang.mgc.model;

public class Cust {
   
    private Long custId;	// 客户ID
    
    private Long clueId;
    
    private String custName; 	//客户名称
    
    private String busiType;	//企业类型
    
    private String mainBusi;	//主营业务
    
    private String operResources;	//运作资源主类型
    
    private String stockSizes;	//仓库数量
    
    private String plantArea;	//仓库面积
    
    private String dayCarAmount;	//日用车辆数量
    
    private String dayAveOrder;	//日均订单量
    
    private String personName;	//联系人姓名
    
    private String sex;	//性别
    
    private String personShenfen;	//联系人身份
    
    private String personZhiwei;	//联系人职位
    
    private String personPhone;	//联系方式
    
    private String otherPhone1;	//其他联系方式1
    
    private String otherPhone2;	//其他联系方式2
    
    private String otherPhone3;	//其他联系方式2
    
    private String otherPersonName;	//其他可用联系人姓名
    
    private String purchMotiva;	//采购意向
    
    private String purchMethod;	//采购方式
    
    private String intentionPlan;	//意向产品
    
    private String custBudget;	//客户预算
    
    private String lineTimeRequire;	//上线时间要求
    
    private String importRequire;	//重点需求内容
    
    private String remarks;	//备注内容
    
    private String remarksOther;	//其他备注内容
    
    private String defendTime;	//最近维护时间
    
    private String createTime;	//客户创建时间
    
    private String defendPerson;	//维护人
    
    private String remarksDefend;	//维护内容
    
    private String panduanCol;	//判断字段
    
    public Cust() {
        
    }

	public Cust(Long custId, Long clueId, String custName, String busiType, String mainBusi, String operResources,
			String stockSizes, String plantArea, String dayCarAmount, String dayAveOrder, String personName, String sex,
			String personShenfen, String personZhiwei, String personPhone, String otherPhone1, String otherPhone2,
			String otherPhone3, String otherPersonName, String purchMotiva, String purchMethod, String intentionPlan,
			String custBudget, String lineTimeRequire, String importRequire, String remarks, String remarksOther,
			String defendTime, String createTime,String defendPerson,String remarksDefend,String panduanCol) {
		super();
		this.custId = custId;
		this.clueId = clueId;
		this.custName = custName;
		this.busiType = busiType;
		this.mainBusi = mainBusi;
		this.operResources = operResources;
		this.stockSizes = stockSizes;
		this.plantArea = plantArea;
		this.dayCarAmount = dayCarAmount;
		this.dayAveOrder = dayAveOrder;
		this.personName = personName;
		this.sex = sex;
		this.personShenfen = personShenfen;
		this.personZhiwei = personZhiwei;
		this.personPhone = personPhone;
		this.otherPhone1 = otherPhone1;
		this.otherPhone2 = otherPhone2;
		this.otherPhone3 = otherPhone3;
		this.otherPersonName = otherPersonName;
		this.purchMotiva = purchMotiva;
		this.purchMethod = purchMethod;
		this.intentionPlan = intentionPlan;
		this.custBudget = custBudget;
		this.lineTimeRequire = lineTimeRequire;
		this.importRequire = importRequire;
		this.remarks = remarks;
		this.remarksOther = remarksOther;
		this.defendTime = defendTime;
		this.createTime = createTime;
		this.createTime = defendPerson;
		this.createTime = remarksDefend;
		this.panduanCol = panduanCol;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Long getClueId() {
		return clueId;
	}

	public void setClueId(Long clueId) {
		this.clueId = clueId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getMainBusi() {
		return mainBusi;
	}

	public void setMainBusi(String mainBusi) {
		this.mainBusi = mainBusi;
	}

	public String getOperResources() {
		return operResources;
	}

	public void setOperResources(String operResources) {
		this.operResources = operResources;
	}

	public String getStockSizes() {
		return stockSizes;
	}

	public void setStockSizes(String stockSizes) {
		this.stockSizes = stockSizes;
	}

	public String getPlantArea() {
		return plantArea;
	}

	public void setPlantArea(String plantArea) {
		this.plantArea = plantArea;
	}

	public String getDayCarAmount() {
		return dayCarAmount;
	}

	public void setDayCarAmount(String dayCarAmount) {
		this.dayCarAmount = dayCarAmount;
	}

	public String getDayAveOrder() {
		return dayAveOrder;
	}

	public void setDayAveOrder(String dayAveOrder) {
		this.dayAveOrder = dayAveOrder;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPersonShenfen() {
		return personShenfen;
	}

	public void setPersonShenfen(String personShenfen) {
		this.personShenfen = personShenfen;
	}

	public String getPersonZhiwei() {
		return personZhiwei;
	}

	public void setPersonZhiwei(String personZhiwei) {
		this.personZhiwei = personZhiwei;
	}

	public String getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}

	public String getOtherPhone1() {
		return otherPhone1;
	}

	public void setOtherPhone1(String otherPhone1) {
		this.otherPhone1 = otherPhone1;
	}

	public String getOtherPhone2() {
		return otherPhone2;
	}

	public void setOtherPhone2(String otherPhone2) {
		this.otherPhone2 = otherPhone2;
	}

	public String getOtherPhone3() {
		return otherPhone3;
	}

	public void setOtherPhone3(String otherPhone3) {
		this.otherPhone3 = otherPhone3;
	}

	public String getOtherPersonName() {
		return otherPersonName;
	}

	public void setOtherPersonName(String otherPersonName) {
		this.otherPersonName = otherPersonName;
	}

	public String getPurchMotiva() {
		return purchMotiva;
	}

	public void setPurchMotiva(String purchMotiva) {
		this.purchMotiva = purchMotiva;
	}

	public String getPurchMethod() {
		return purchMethod;
	}

	public void setPurchMethod(String purchMethod) {
		this.purchMethod = purchMethod;
	}

	public String getIntentionPlan() {
		return intentionPlan;
	}

	public void setIntentionPlan(String intentionPlan) {
		this.intentionPlan = intentionPlan;
	}

	public String getCustBudget() {
		return custBudget;
	}

	public void setCustBudget(String custBudget) {
		this.custBudget = custBudget;
	}

	public String getLineTimeRequire() {
		return lineTimeRequire;
	}

	public void setLineTimeRequire(String lineTimeRequire) {
		this.lineTimeRequire = lineTimeRequire;
	}

	public String getImportRequire() {
		return importRequire;
	}

	public void setImportRequire(String importRequire) {
		this.importRequire = importRequire;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarksOther() {
		return remarksOther;
	}

	public void setRemarksOther(String remarksOther) {
		this.remarksOther = remarksOther;
	}

	public String getDefendTime() {
		return defendTime;
	}

	public void setDefendTime(String defendTime) {
		this.defendTime = defendTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDefendPerson() {
		return defendPerson;
	}

	public void setDefendPerson(String defendPerson) {
		this.defendPerson = defendPerson;
	}

	public String getRemarksDefend() {
		return remarksDefend;
	}

	public void setRemarksDefend(String remarksDefend) {
		this.remarksDefend = remarksDefend;
	}

	public String getPanduanCol() {
		return panduanCol;
	}

	public void setPanduanCol(String panduanCol) {
		this.panduanCol = panduanCol;
	}

	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", clueId=" + clueId + ", custName=" + custName + ", busiType=" + busiType
				+ ", mainBusi=" + mainBusi + ", operResources=" + operResources + ", stockSizes=" + stockSizes
				+ ", plantArea=" + plantArea + ", dayCarAmount=" + dayCarAmount + ", dayAveOrder=" + dayAveOrder
				+ ", personName=" + personName + ", sex=" + sex + ", personShenfen=" + personShenfen + ", personZhiwei="
				+ personZhiwei + ", personPhone=" + personPhone + ", otherPhone1=" + otherPhone1 + ", otherPhone2="
				+ otherPhone2 + ", otherPhone3=" + otherPhone3 + ", otherPersonName=" + otherPersonName
				+ ", purchMotiva=" + purchMotiva + ", purchMethod=" + purchMethod + ", intentionPlan=" + intentionPlan
				+ ", custBudget=" + custBudget + ", lineTimeRequire=" + lineTimeRequire + ", importRequire="
				+ importRequire + ", remarks=" + remarks + ", remarksOther=" + remarksOther + ", defendTime="
				+ defendTime + ", createTime=" + createTime + ", defendPerson=" + defendPerson + ", remarksDefend="
				+ remarksDefend + ", panduanCol=" + panduanCol + "]";
	}

}