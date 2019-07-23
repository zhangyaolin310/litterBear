package com.zhang.mgc.model;


public class Clue {
    private Long clueId;// ID自增长主键

    private String custSource;// 客户来源
    
    private String phone;// 联系人电话
    
    private String personName;// 联系人姓名
    
    private String province;// 联系人省份
    
    private String custName;// 客户所在公司
    
    private String intentionPlan;// 意向产品
    
    private String status;// 分配状态
    
    private String createTime;// 线索创建时间
    
    private String assignedTime;// 线索分配时间
    
    private String followStatus;// 跟进状态
    
    private Long userId;// 销售人员id
    
    private Long custId;// 客户id
    
    private String userName;	//销售人名称
    
    private String custCreateTime;	//客户创建时间
    
    private String defendTime;	//最近维护时间
    
    private String showStatus;	//演示状态
    
    private String showAppointTime;	//预约演示时间
    
    private String showEndTime;	//完成演示时间
    
    private String startAssignedTime;	//搜索开始线索分配时间
    
    private String endAssignedTime;	//搜索结束线索分配时间
    
    private String startCustCreateTime;	//搜索客户创建开始时间
    
    private String endCustCreateTime;	//搜索客户创建结束时间
    
    private String startDefendTime;	//搜索最近维护开始时间
    
    private String endDefendTime;	//搜索最近维护结束时间
    
    private String startShowAppointTime;	//搜索预约演示开始时间
    
    private String endShowAppointTime;	//搜索预约演示结束时间
    
    private String startShowEndTime;	//搜索完成演示开始时间
    
    private String endShowEndTime;	//搜索完成演示结束时间
    
    private String page;	//页面页码数
    
    private String dataTotal;	//总共多少条数据
    
    private String panduanCol;	//判断字段
    
    private Integer startSize;	//分页开始数字
    
    private Integer endSize;	//分页结束数字

	public Clue() {
	}

	public Long getClueId() {
		return clueId;
	}

	public void setClueId(Long clueId) {
		this.clueId = clueId;
	}

	public String getCustSource() {
		return custSource;
	}

	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getIntentionPlan() {
		return intentionPlan;
	}

	public void setIntentionPlan(String intentionPlan) {
		this.intentionPlan = intentionPlan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAssignedTime() {
		return assignedTime;
	}

	public void setAssignedTime(String assignedTime) {
		this.assignedTime = assignedTime;
	}

	public String getFollowStatus() {
		return followStatus;
	}

	public void setFollowStatus(String followStatus) {
		this.followStatus = followStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getStartAssignedTime() {
		return startAssignedTime;
	}

	public void setStartAssignedTime(String startAssignedTime) {
		this.startAssignedTime = startAssignedTime;
	}

	public String getEndAssignedTime() {
		return endAssignedTime;
	}

	public void setEndAssignedTime(String endAssignedTime) {
		this.endAssignedTime = endAssignedTime;
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

	public String getStartDefendTime() {
		return startDefendTime;
	}

	public void setStartDefendTime(String startDefendTime) {
		this.startDefendTime = startDefendTime;
	}

	public String getEndDefendTime() {
		return endDefendTime;
	}

	public void setEndDefendTime(String endDefendTime) {
		this.endDefendTime = endDefendTime;
	}

	public String getCustCreateTime() {
		return custCreateTime;
	}

	public void setCustCreateTime(String custCreateTime) {
		this.custCreateTime = custCreateTime;
	}

	public String getDefendTime() {
		return defendTime;
	}

	public void setDefendTime(String defendTime) {
		this.defendTime = defendTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
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

	public String getStartShowAppointTime() {
		return startShowAppointTime;
	}

	public void setStartShowAppointTime(String startShowAppointTime) {
		this.startShowAppointTime = startShowAppointTime;
	}

	public String getEndShowAppointTime() {
		return endShowAppointTime;
	}

	public void setEndShowAppointTime(String endShowAppointTime) {
		this.endShowAppointTime = endShowAppointTime;
	}

	public String getStartShowEndTime() {
		return startShowEndTime;
	}

	public void setStartShowEndTime(String startShowEndTime) {
		this.startShowEndTime = startShowEndTime;
	}

	public String getEndShowEndTime() {
		return endShowEndTime;
	}

	public void setEndShowEndTime(String endShowEndTime) {
		this.endShowEndTime = endShowEndTime;
	}

	public String getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(String showStatus) {
		this.showStatus = showStatus;
	}

	public String getShowAppointTime() {
		return showAppointTime;
	}

	public void setShowAppointTime(String showAppointTime) {
		this.showAppointTime = showAppointTime;
	}

	public String getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(String showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getPanduanCol() {
		return panduanCol;
	}

	public void setPanduanCol(String panduanCol) {
		this.panduanCol = panduanCol;
	}

	public String getDataTotal() {
		return dataTotal;
	}

	public void setDataTotal(String dataTotal) {
		this.dataTotal = dataTotal;
	}

	@Override
	public String toString() {
		return "Clue [clueId=" + clueId + ", custSource=" + custSource + ", phone=" + phone + ", personName="
				+ personName + ", province=" + province + ", custName=" + custName + ", intentionPlan=" + intentionPlan
				+ ", status=" + status + ", createTime=" + createTime + ", assignedTime=" + assignedTime
				+ ", followStatus=" + followStatus + ", userId=" + userId + ", custId=" + custId + ", userName="
				+ userName + ", custCreateTime=" + custCreateTime + ", defendTime=" + defendTime + ", showStatus="
				+ showStatus + ", showAppointTime=" + showAppointTime + ", showEndTime=" + showEndTime
				+ ", startAssignedTime=" + startAssignedTime + ", endAssignedTime=" + endAssignedTime
				+ ", startCustCreateTime=" + startCustCreateTime + ", endCustCreateTime=" + endCustCreateTime
				+ ", startDefendTime=" + startDefendTime + ", endDefendTime=" + endDefendTime
				+ ", startShowAppointTime=" + startShowAppointTime + ", endShowAppointTime=" + endShowAppointTime
				+ ", startShowEndTime=" + startShowEndTime + ", endShowEndTime=" + endShowEndTime + ", page=" + page
				+ ", dataTotal=" + dataTotal + ", panduanCol=" + panduanCol + ", startSize=" + startSize + ", endSize="
				+ endSize + "]";
	}


}
