package com.zhang.mgc.model;

public class Contract {

    private Long contractId;// 合同ID自增长主键
    
    private Long custId;// 客户号
    
    private String contractTime;//合同日期
    
    private String planName;// 购买产品
    
    private String serviceMode;// 服务方式

    private String biaopinPrice;// 标品价格
    
    private String customMadePrice;// 定制价格
    
    private String renewPrice;// 续费价格
    
    private String kaipiaoShuidian;// 开票税点
    
    private String isHaveArrears;// 是否有尾款
    
    private String arrearsPrice;// 尾款金额
    
    private String custName;// 客户名称
    
    private String showPlanName;// 演示产品
    
    private String intentionalServices;// 意向服务方式
    
    private String intentionTradingPrice;// 意向交易价格
    
    private Long userId;// 销售人员id
    
    private String userName;	//销售人名称
    
    private String contractStatus;	//合同状态
    
    private String custCreateTime;	//客户创建时间
    
    private String showPlanEndTime;	//产品演示结束时间
    
    private String lastMakeCollectionsTime;	//最近修改收款时间
    
    private String startCustCreateTime;	//搜索客户创建开始时间
    
    private String endCustCreateTime;	//最近收款日期
    
    private String startShowPlanEndTime;	//搜索演示日期完成时间开始时间
    
    private String endShowPlanEndTime;	//搜索演示日期完成时间结束时间
    
    private String startContractTime;	//搜索合同日期开始时间
    
    private String endContractTime;	//搜索合同日期结束时间
    
    private String startMakeCollectionsTime;	//搜索合同日期开始时间
    
    private String endMakeCollectionsTime;	//搜索合同日期结束时间
    
    private String page;	//页面页码数
    
    private String dataTotal;	//总共多少条数据
    
    private String panduanCol;	//判断字段
    
    private Integer startSize;	//分页开始数字
    
    private Integer endSize;	//分页结束数字
    
    public Contract() {
        
    }

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getContractTime() {
		return contractTime;
	}

	public void setContractTime(String contractTime) {
		this.contractTime = contractTime;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getServiceMode() {
		return serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getBiaopinPrice() {
		return biaopinPrice;
	}

	public void setBiaopinPrice(String biaopinPrice) {
		this.biaopinPrice = biaopinPrice;
	}

	public String getCustomMadePrice() {
		return customMadePrice;
	}

	public void setCustomMadePrice(String customMadePrice) {
		this.customMadePrice = customMadePrice;
	}

	public String getRenewPrice() {
		return renewPrice;
	}

	public void setRenewPrice(String renewPrice) {
		this.renewPrice = renewPrice;
	}

	public String getKaipiaoShuidian() {
		return kaipiaoShuidian;
	}

	public void setKaipiaoShuidian(String kaipiaoShuidian) {
		this.kaipiaoShuidian = kaipiaoShuidian;
	}

	public String getIsHaveArrears() {
		return isHaveArrears;
	}

	public void setIsHaveArrears(String isHaveArrears) {
		this.isHaveArrears = isHaveArrears;
	}

	public String getArrearsPrice() {
		return arrearsPrice;
	}

	public void setArrearsPrice(String arrearsPrice) {
		this.arrearsPrice = arrearsPrice;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getShowPlanName() {
		return showPlanName;
	}

	public void setShowPlanName(String showPlanName) {
		this.showPlanName = showPlanName;
	}

	public String getIntentionalServices() {
		return intentionalServices;
	}

	public void setIntentionalServices(String intentionalServices) {
		this.intentionalServices = intentionalServices;
	}

	public String getIntentionTradingPrice() {
		return intentionTradingPrice;
	}

	public void setIntentionTradingPrice(String intentionTradingPrice) {
		this.intentionTradingPrice = intentionTradingPrice;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getCustCreateTime() {
		return custCreateTime;
	}

	public void setCustCreateTime(String custCreateTime) {
		this.custCreateTime = custCreateTime;
	}

	public String getShowPlanEndTime() {
		return showPlanEndTime;
	}

	public void setShowPlanEndTime(String showPlanEndTime) {
		this.showPlanEndTime = showPlanEndTime;
	}

	public String getLastMakeCollectionsTime() {
		return lastMakeCollectionsTime;
	}

	public void setLastMakeCollectionsTime(String lastMakeCollectionsTime) {
		this.lastMakeCollectionsTime = lastMakeCollectionsTime;
	}

	public String getStartCustCreateTime() {
		return startCustCreateTime;
	}

	public void setStartCustCreateTime(String startCustCreateTime) {
		this.startCustCreateTime = startCustCreateTime;
	}

	public String getEndCustCreateTime() {
		return endCustCreateTime;
	}

	public void setEndCustCreateTime(String endCustCreateTime) {
		this.endCustCreateTime = endCustCreateTime;
	}

	public String getStartShowPlanEndTime() {
		return startShowPlanEndTime;
	}

	public void setStartShowPlanEndTime(String startShowPlanEndTime) {
		this.startShowPlanEndTime = startShowPlanEndTime;
	}

	public String getEndShowPlanEndTime() {
		return endShowPlanEndTime;
	}

	public void setEndShowPlanEndTime(String endShowPlanEndTime) {
		this.endShowPlanEndTime = endShowPlanEndTime;
	}

	public String getStartContractTime() {
		return startContractTime;
	}

	public void setStartContractTime(String startContractTime) {
		this.startContractTime = startContractTime;
	}

	public String getEndContractTime() {
		return endContractTime;
	}

	public void setEndContractTime(String endContractTime) {
		this.endContractTime = endContractTime;
	}

	public String getStartMakeCollectionsTime() {
		return startMakeCollectionsTime;
	}

	public void setStartMakeCollectionsTime(String startMakeCollectionsTime) {
		this.startMakeCollectionsTime = startMakeCollectionsTime;
	}

	public String getEndMakeCollectionsTime() {
		return endMakeCollectionsTime;
	}

	public void setEndMakeCollectionsTime(String endMakeCollectionsTime) {
		this.endMakeCollectionsTime = endMakeCollectionsTime;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getDataTotal() {
		return dataTotal;
	}

	public void setDataTotal(String dataTotal) {
		this.dataTotal = dataTotal;
	}

	public String getPanduanCol() {
		return panduanCol;
	}

	public void setPanduanCol(String panduanCol) {
		this.panduanCol = panduanCol;
	}

	public Integer getStartSize() {
		return startSize;
	}

	public void setStartSize(Integer startSize) {
		this.startSize = startSize;
	}

	public Integer getEndSize() {
		return endSize;
	}

	public void setEndSize(Integer endSize) {
		this.endSize = endSize;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", custId=" + custId + ", contractTime=" + contractTime
				+ ", planName=" + planName + ", serviceMode=" + serviceMode + ", biaopinPrice=" + biaopinPrice
				+ ", customMadePrice=" + customMadePrice + ", renewPrice=" + renewPrice + ", kaipiaoShuidian="
				+ kaipiaoShuidian + ", isHaveArrears=" + isHaveArrears + ", arrearsPrice=" + arrearsPrice
				+ ", custName=" + custName + ", showPlanName=" + showPlanName + ", intentionalServices="
				+ intentionalServices + ", intentionTradingPrice=" + intentionTradingPrice + ", userId=" + userId
				+ ", userName=" + userName + ", contractStatus=" + contractStatus + ", custCreateTime=" + custCreateTime
				+ ", showPlanEndTime=" + showPlanEndTime + ", lastMakeCollectionsTime=" + lastMakeCollectionsTime
				+ ", startCustCreateTime=" + startCustCreateTime + ", endCustCreateTime=" + endCustCreateTime
				+ ", startShowPlanEndTime=" + startShowPlanEndTime + ", endShowPlanEndTime=" + endShowPlanEndTime
				+ ", startContractTime=" + startContractTime + ", endContractTime=" + endContractTime
				+ ", startMakeCollectionsTime=" + startMakeCollectionsTime + ", endMakeCollectionsTime="
				+ endMakeCollectionsTime + ", page=" + page + ", dataTotal=" + dataTotal + ", panduanCol=" + panduanCol
				+ ", startSize=" + startSize + ", endSize=" + endSize + "]";
	}

}